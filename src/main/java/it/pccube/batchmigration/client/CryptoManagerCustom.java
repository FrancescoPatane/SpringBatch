package it.pccube.batchmigration.client;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;


public class CryptoManagerCustom {

	private static final int CONSTANT2 = 2;
	private static final int CONSTANT00FF = 0x00ff;
	private static final int CONSTANT000F = 0x000f;
	private static final int EXADECIMAL_SIZE = 16;
	private static final int CARACTER_SIZE = 4;
	private static final String BLOWFISH = "Blowfish";
	private Cipher cipherEncrypt;
	private Cipher cipherDecrypt;

	public CryptoManagerCustom(String key, String instance)
			throws UnsupportedEncodingException, NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException {
		SecretKeySpec secretKey = new SecretKeySpec(key.getBytes("UTF8"), instance);
		cipherEncrypt = Cipher.getInstance(instance);
		cipherEncrypt.init(Cipher.ENCRYPT_MODE, secretKey);
		cipherDecrypt = Cipher.getInstance(instance);
		cipherDecrypt.init(Cipher.DECRYPT_MODE, secretKey);
	}

	public String encrypt(String data)
			throws IllegalBlockSizeException, BadPaddingException, UnsupportedEncodingException {
		if (data == null || "".equals(data)) {
			return data;
		}
		return byteArrayToHex(cipherEncrypt.doFinal(data.getBytes("UTF8")));
	}

	public String decrypt(String encrypted) throws IllegalBlockSizeException, BadPaddingException {
		if (encrypted == null || "".equals(encrypted)) {
			return encrypted;
		}
		byte[] encryptedData = hexStringToByteArray(encrypted);
		byte[] decrypted = cipherDecrypt.doFinal(encryptedData);
		return byteToString(decrypted);
	}

	private static String byteToString(byte[] bytes) {
		StringBuilder bld = new StringBuilder();
		for (int i = 0; i < bytes.length; i++) {
			bld.append((char) bytes[i]);
		}
		return bld.toString();
	}

	private static String byteArrayToHex(byte[] a) {
		int hn;
		int ln;
		int cx;
		String hexDigitChars = "0123456789abcdef";
		StringBuilder buf = new StringBuilder(a.length * CONSTANT2);
		for (cx = 0; cx < a.length; cx++) {
			hn = ((int) (a[cx]) & CONSTANT00FF) / EXADECIMAL_SIZE;
			ln = (int) (a[cx]) & CONSTANT000F;
			buf.append(hexDigitChars.charAt(hn));
			buf.append(hexDigitChars.charAt(ln));
		}
		return buf.toString();
	}

	private static byte[] hexStringToByteArray(String s) {
		int len = s.length();
		byte[] data = new byte[len / CONSTANT2];
		for (int i = 0; i < len; i += CONSTANT2) {
			data[i / CONSTANT2] = (byte) ((Character.digit(s.charAt(i), EXADECIMAL_SIZE) << CARACTER_SIZE)
					+ Character.digit(s.charAt(i + 1), EXADECIMAL_SIZE));
		}
		return data;
	}
	
	public static void main(String[] args) {
		try {
			CryptoManagerCustom cm = new CryptoManagerCustom("19tre40cc02an11i", BLOWFISH);
			System.out.println("decrypt: "+cm.decrypt("366dfab36152ad27"));
			System.out.println("encrypt: "+cm.encrypt("11"));
		} catch (InvalidKeyException | UnsupportedEncodingException | NoSuchAlgorithmException
				| NoSuchPaddingException e) {
			e.printStackTrace();
		} catch (IllegalBlockSizeException e) {
			e.printStackTrace();
		} catch (BadPaddingException e) {
			e.printStackTrace();
		}
	}

}
