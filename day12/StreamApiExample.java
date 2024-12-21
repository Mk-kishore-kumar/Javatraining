package com.day12;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
//stream API
public class StreamApiExample {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 5, 7, 8, 9, 6);
		// -> function definition
		// :: referening println method
		// forEach() termination operation
		// filter() -one of intermedite function
		// Strem() - will initialize the stream

		numbers.stream().filter(x -> x % 2 == 0).forEach(System.out::println);

		// count() termination operation
		long count = numbers.stream().filter(x -> x % 2 == 0).count();
		System.out.println("count is" + count);

		// collectors.tolist

		List<Integer> evenNumber = numbers.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());

		System.out.println(evenNumber);

		// for set

		Set<Integer> a1 = numbers.stream().filter(x -> x % 2 == 0).collect(Collectors.toSet());

		System.out.println(a1);

		// after filter adding one more intermediate function
		// perform MAP()
		//single line only
		List<Integer> evenNumber1 = numbers.stream()
				//Using 3 intermediate functions
				.filter(x -> x % 2 == 0)
				.map(x -> x * 10)
				.sorted()//get in sorted manner
				.collect(Collectors.toList());
         System.out.println(evenNumber1);
	}

}
