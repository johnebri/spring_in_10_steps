package com.in28minutes.spring.basics.springin10steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringIn10StepsApplication {
	
	// What are the beans?
	// What are the dependencies?
	// Where to search for beans?

	public static void main(String[] args) {
		 
		// BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());
		
		ConfigurableApplicationContext applicationcontext = SpringApplication.run(SpringIn10StepsApplication.class, args);
		BinarySearchImpl binarySearch = applicationcontext.getBean(BinarySearchImpl.class);
		int result = binarySearch.binarySearch(new int[] {12,4,6}, 3);
		System.out.println(result);
		
	}

}
