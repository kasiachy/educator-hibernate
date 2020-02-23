package com.bihuniak.educator;

import com.bihuniak.educator.basic.Car;
import com.bihuniak.educator.basic.MyFirstRepository;
import com.bihuniak.educator.company.Department;
import com.bihuniak.educator.company.DepartmentRepository;
import com.bihuniak.educator.company.Employee;
import com.bihuniak.educator.company.EmployeeRepository;
import com.bihuniak.educator.human.Adress;
import com.bihuniak.educator.human.Human;
import com.bihuniak.educator.human.HumanRepository;
import com.bihuniak.educator.human.Number;
import com.bihuniak.educator.human.Sex;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static java.util.Arrays.asList;

@SpringBootApplication
public class EducatorApplication {

	@Autowired
	private MyFirstRepository myFirstRepository;

	@Autowired
	private HumanRepository humanRepository;

	@Autowired
	private EmployeeRepository employeeRepository;

	@Autowired
	private DepartmentRepository departmentRepository;


	public static void main(String[] args) {
		SpringApplication.run(EducatorApplication.class, args);
	}

	@PostConstruct
	public void init() {
//		Car car = new Car(0, "A4","",4,2.0,false );
//		Car car1 = new Car("A4","Audi",4,1.5,true );
//		Car car2 = new Car("A4","Audi",4,2.2,true );
//		Car car3 = new Car("A4","Audi",4,1.8,true );
//		car.setId(1);
//		myFirstRepository.saveAll(asList(car));
//		Car car = myFirstRepository.findById(4l).get();
//		System.out.println(car.toString());


//		Human janusz = new Human(0,
//				"Janusz",
//				"Tkacz",
//				Sex.SECRET,
//				LocalDate.of(1980, 10, 22),
//				asList(new Adress("Bezpieczna", "Wrocław", "Polska", "51-114"), (new Adress("Radkowska", "Wrocław", "Polska", "50-537"))),
//				asList("512 445 221", "798 112 112", "32 415 22 34"));
//		humanRepository.save(janusz);


//		Department dzial = new Department (0,"Finance", "Sucha 12, Wrocław", 4);
//
//
//		Employee pracownik = new Employee(0,"Weronika Kowalska", "Accountant", dzial );
////		employeeRepository.save(pracownik);
//
//		dzial.setEmployee(pracownik);
//		departmentRepository.save(dzial);

//
//		System.out.println(departmentRepository.findById(11l).get());
//		System.out.println(departmentRepository.findById(9l).get());
		// w metodzie toString w encji employee nie może być department, bo będzie się nieskonczenie zapęltać
		// i odwrotnie kiedy próbujemy wyciągnąć informacje z employee

//		System.out.println(employeeRepository.findById(8l).get());


		Employee Ania = new Employee(0, "Anna Nowak", "Lawyer");
		Employee Basia = new Employee(0, "Barbara Adamczyk", "Receptionist");
		Employee Janek = new Employee(0, "Jan Kowalski", "Accountant");

		Department finance = new Department(0, "Finance", "Paprotna 30, Wrocław", 5, asList(Ania, Basia, Janek));
		departmentRepository.save(finance);		departmentRepository.save(finance);

//		Employee Andrzej = new Employee (0, "Andrzej Kwiatkowski", "Director of Marketing");
//
//		Department marketing =new Department(0,"Marketing", "Paprotna 30, Wrocław", 4, asList(Ania, Andrzej)) ;
//		departmentRepository.save(marketing);

	}
}
