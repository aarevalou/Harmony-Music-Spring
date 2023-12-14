package com.ufro.HardmonyMusic;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;

import javax.sql.DataSource;

@SpringBootApplication
public class HardmonyMusicApplication {

	public static void main(String[] args) {
		SpringApplication.run(HardmonyMusicApplication.class, args);
	}

	@Bean
	public CommandLineRunner dataLoader(DataSource dataSource, ResourceDatabasePopulator databasePopulator) {
		return args -> databasePopulator.populate(dataSource.getConnection());
	}
}
