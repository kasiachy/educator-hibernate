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
		Car car = new Car(0, "A4","",4,2.0,false );
		//Car car1 = new Car("A4","Audi",4,1.5,true );
		//Car car2 = new Car("A4","Audi",4,2.2,true );
		//Car car3 = new Car("A4","Audi",4,1.8,true );
		//car.setId(1);
		myFirstRepository.saveAll(asList(car));
		//Car car = myFirstRepository.findById(4l).get();
		//System.out.println(car.toString());
	}
}
