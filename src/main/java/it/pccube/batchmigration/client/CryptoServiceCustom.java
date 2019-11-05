package it.pccube.batchmigration.client;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import it.pccube.batchmigration.exception.CryptoException;
import it.pccube.batchmigration.listener.WriterListener;


@Service
public class CryptoServiceCustom {

	@Value("${crypto.key}")
	private String key;

	@Value("${crypto.instance}")
	private String instance;

	private static final String ERROR = "Error -> ";

	public static final Logger logger = LoggerFactory.getLogger(WriterListener.class);

	private static final String FG_CRYPTO = "fgCrypto";


	public CryptoServiceCustom() {
		super();
	}

	// START CRYPTO WITH ANNOTATIONS
	private static Field getField(String fieldName, Class<?> clazz) throws NoSuchFieldException {
		try {
			return clazz.getDeclaredField(fieldName);
		} catch (NoSuchFieldException e) {
			Class<?> superClass = clazz.getSuperclass();
			if (superClass == null) {
				throw e;
			} else {
				return getField(fieldName, superClass);
			}
		}
	}

	private void setEncrypted(Object bean) throws IllegalArgumentException, IllegalAccessException {
		try {
			Field field = getField(FG_CRYPTO, bean.getClass());
			field.setAccessible(true);
			field.set(bean, true);
		} catch (NoSuchFieldException e) {
			return;
		}
	}

	private Boolean alreadyEncrypted(Object bean) throws IllegalArgumentException, IllegalAccessException {
		try {
			Field field = getField(FG_CRYPTO, bean.getClass());
			field.setAccessible(true);
			Object done = field.get(bean);
			if (done == null || done.equals(Boolean.FALSE)) {
				return false;
			}
			return true;
		} catch (NoSuchFieldException e) {
			return false;
		}
	}

	private void setDecrypted(Object bean) throws IllegalArgumentException, IllegalAccessException {
		try {
			Field field = getField(FG_CRYPTO, bean.getClass());
			field.setAccessible(true);
			field.set(bean, false);
		} catch (NoSuchFieldException e) {
			return;
		}
	}

	private Boolean alreadyDecrypted(Object bean) throws IllegalArgumentException, IllegalAccessException {
		try {
			Field field = getField(FG_CRYPTO, bean.getClass());
			field.setAccessible(true);
			Object done = field.get(bean);
			if (done == null || done.equals(Boolean.TRUE)) {
				return false;
			}
			return true;
		} catch (NoSuchFieldException e) {
			return false;
		}
	}

	public List<String> encrypt(Collection<String> listToEncrypt, String idSedia) {
		List<String> list = new ArrayList<>();
		for (String toEncrypt : listToEncrypt) {
			list.add(encrypt(toEncrypt, idSedia));
		}
		return list;
	}

	public List<String> decrypt(Collection<String> listToDecrypt, String idSedia) {
		List<String> list = new ArrayList<>();
		for (String toDecrypt : listToDecrypt) {
			list.add(decrypt(toDecrypt, idSedia));
		}
		return list;
	}

	public String encrypt(String stringToEncrypt, String idSedia) {
		try {
			String encryptKey;
			if (idSedia == null) {
				encryptKey = key;
			} else {
				encryptKey = key.substring(0, key.length() - idSedia.length()) + idSedia;
			}
			CryptoManagerCustom cm = new CryptoManagerCustom(encryptKey, instance);
			return cm.encrypt(stringToEncrypt);
		} catch (IllegalBlockSizeException | BadPaddingException | InvalidKeyException | UnsupportedEncodingException
				| NoSuchAlgorithmException | NoSuchPaddingException | StringIndexOutOfBoundsException e) {
			logger.error(ERROR, e);
			throw new CryptoException("Errore criptazione");
			}
	}

	public String decrypt(String stringToDecrypt, String idSedia) {
		try {
			String decryptKey;
			if (idSedia == null) {
				decryptKey = key;
			} else {
				decryptKey = key.substring(0, key.length() - idSedia.length()) + idSedia;
			}
			CryptoManagerCustom cm = new CryptoManagerCustom(decryptKey, instance);
			return cm.decrypt(stringToDecrypt);
		} catch (IllegalBlockSizeException | BadPaddingException | InvalidKeyException | UnsupportedEncodingException
				| NoSuchAlgorithmException | NoSuchPaddingException | StringIndexOutOfBoundsException e) {
			logger.error(ERROR, e);
			throw new CryptoException("Errore criptazione");
		}
	}
	// END CRYPTO WITH ANNOTATION

}
