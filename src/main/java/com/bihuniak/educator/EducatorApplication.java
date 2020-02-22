package com.bihuniak.educator;

import com.bihuniak.educator.basic.Car;
import com.bihuniak.educator.basic.MyFirstRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

import static java.util.Arrays.asList;

@SpringBootApplication
public class EducatorApplication {

	@Autowired
	private MyFirstRepository myFirstRepository;

	public static void main(String[] args) {
		SpringApplication.run(EducatorApplication.class, args);
	}

	@PostConstruct
	public void init() {
		//Car car = new Car("A4","Audi",4,2.0,true );
		//Car car1 = new Car("A4","Audi",4,1.5,true );
		//Car car2 = new Car("A4","Audi",4,2.2,true );
		//Car car3 = new Car("A4","Audi",4,1.8,true );
		//myFirstRepository.saveAll(asList(car, car1, car2, car3));
		Car car = myFirstRepository.findById(4l).get();
		System.out.println(car.toString());
	}
}
