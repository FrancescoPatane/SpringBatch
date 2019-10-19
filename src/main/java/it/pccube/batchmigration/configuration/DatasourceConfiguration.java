package it.pccube.batchmigration.configuration;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class DatasourceConfiguration {
	
	
	 @Primary
	 @Bean(name = "dbInMemory")
	 @ConfigurationProperties(prefix = "spring.datasource-in-memory")
	 public DataSource dataSourceInMemory() {
	  return DataSourceBuilder.create().build();
	 }
	
	 @Bean(name = "dbSource")
	 @ConfigurationProperties(prefix = "spring.datasource-source")
	 public DataSource dataSourceSource() {
	  return DataSourceBuilder.create().build();
	 }

	 @Bean(name = "dbDestination")
	 @ConfigurationProperties(prefix = "spring.datasource-destination")
	 public DataSource dataSourceDestination() {
	  return  DataSourceBuilder.create().build();
	 }

	 

}
