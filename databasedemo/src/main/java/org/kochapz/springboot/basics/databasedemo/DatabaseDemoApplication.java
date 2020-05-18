package org.kochapz.springboot.basics.databasedemo;

import org.kochapz.springboot.basics.databasedemo.entity.Person;
import org.kochapz.springboot.basics.databasedemo.jdbc.PersonJdbcDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;


@SpringBootApplication
public class DatabaseDemoApplication implements CommandLineRunner {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
@Autowired
PersonJdbcDao personJdbcDao;
	public static void main(String[] args) {
		SpringApplication.run(DatabaseDemoApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
	    logger.info("All users -> {}", personJdbcDao.findAll());
        logger.info("User info 10001 -> {}", personJdbcDao.findById(10001));
        logger.info("Inserting 10004 -> {}", personJdbcDao.insert(new Person(10004,"Hari","Chennai",new Date())));

    }
}
