package com.timur.cakmak.test;


import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.timur.cakmak.test.car.Car;
import com.timur.cakmak.test.car.CarService;

@SpringBootApplication
public class TestApplication implements CommandLineRunner {

	@Autowired
	CarService carService;

	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Car car = new Car();

		car.setRegistration("A59BCV95");
		car.setBrand("Mercedes");
		car.setColor("Noir");
		car.setFuel("Sp95");
		car.setPower(2.2);
		car.setMaxSpeed(240);
		car.setKm(60000);
		car.setInUse(false);
		car.setFirstUse(Date.valueOf("2022-02-02"));
		carService.save(car);
	}

}
