package com.example.demo;

import org.hibernate.annotations.GeneratorType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;



@RestController
public class JustController {
	@Autowired
	CusRepo cus;
	
	@GetMapping("/")
	Customer getData() {
		
		return cus.save(Customer.builder().name("Rahim").build());
	}
	
}

@Data
@Builder
@Entity
class Customer{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long id;
	String name;	
}


interface CusRepo extends JpaRepository<Customer, Long> {
	
}