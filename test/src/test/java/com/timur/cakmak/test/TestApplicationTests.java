package com.timur.cakmak.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.timur.cakmak.test.car.Car;
import com.timur.cakmak.test.car.CarRepository;
import com.timur.cakmak.test.car.CarService;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class TestApplicationTests {

	// @Test
	// void contextLoads() {
	// }

	@Autowired
	private CarService carService;

	@MockBean
	private CarRepository carRepository;

	@Test
	public void getAllTest() {
		when(carRepository.findAll()).thenReturn(Stream
			.of(new Car(
				"1",
				"A59BCV95",
				"BMW",
				"Noir",
				"Sp95",
				2.2,
				240,
				60000,
				false,
				"2022-02-02")
				).collect(Collectors.toList()));
		assertEquals(1, carService.getAll().size());
	}

}
