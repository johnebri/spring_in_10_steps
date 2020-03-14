package com.in28minutes.spring.basics.springin10steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	
	@Autowired
	private SortAlgorithm sortAlgorithm;
	
	// contructor injection
//	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
//		super();
//		this.sortAlgorithm = sortAlgorithm;
//	}
	
	// setter injection
	public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
		this.sortAlgorithm = sortAlgorithm;
	}
	
	
	
	
	
	public int binarySearch(int[] numbers, int numberToSearchFor) {
		
		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		
		// Search the array
		
		// Return the result
		return 3;
	}

}
