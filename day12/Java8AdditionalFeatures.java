package com.day12;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

class Employee {
	int id;
	String name;
	int salary;

	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}

public class Java8AdditionalFeatures extends Employee {

	public Java8AdditionalFeatures(int id, String name, int salary) {
		super(id, name, salary);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		// 1. Given a list of integers, find out all the even numbers that exist in the
		// list using
		// Stream functions?
		List<Integer> number = Arrays.asList(1, 2, 4, 5, 6, 7, 8, 9);
		List<Integer> number1 = number.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
		System.out.println(number1);
		System.out.println("------------");
		// 2. Given a list of integers, find out all the numbers starting with 1 using
		// Stream functions?
		List<Integer> num = Arrays.asList(10, 21, 11, 13);
		List<Integer> result = num.stream().filter(x -> String.valueOf(x).endsWith("1")).collect(Collectors.toList());
		System.out.println(result);
		System.out.println("-----------");

		// 3. How to find duplicate elements in a given integers list in java using
		// Stream functions?

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 1, 2, 3);
		List<Integer> duplicate = numbers.stream().filter(x -> numbers.indexOf(x) != numbers.lastIndexOf(x))
				.collect(Collectors.toList());
		System.out.println(duplicate);
		System.out.println("------------");

		Set<Integer> duplicatelist = numbers.stream().filter(x -> numbers.indexOf(x) != numbers.lastIndexOf(x))
				.collect(Collectors.toSet());

		System.out.println(duplicatelist);
		System.out.println("------------");

		Set<Integer> tempSet = new HashSet<>();
		long duplicateCount = numbers.stream().filter(x -> tempSet.add(x) == false).count();
		System.out.println(duplicateCount);
		System.out.println("------------");

		// 4. Given the list of integers, find the first element of the list using
		// Stream functions?
		int firstElement = numbers.stream().findFirst().get();
		System.out.println(firstElement);
		System.out.println("--------------");

		// 5. Given a list of integers, find the total number of elements present in the
		// list using Stream
		// functions?

		long count = numbers.stream().count();
		System.out.println(count);
		System.out.println("---------------");

		// 6. Given a list of integers, find the maximum value element present in it
		// using Stream
		// functions?
		int max = numbers.stream().max((x, y) -> x - y).get();
		System.out.println(max);
		System.out.println("---------------");

		// 7. Sort the Employee object using salary
		List<Employee> empList = Arrays.asList(new Employee(101, "kishore", 3000), new Employee(102, "partha", 4000),
				new Employee(103, "Ajay", 5000));

		List<Employee> sortList = empList.stream().sorted((e1, e2) -> e1.salary - e2.salary)
				.collect(Collectors.toList());
		System.out.println(sortList);

		// 8. Given a list of integers, sort all the values present in it using Stream
		// functions?
		List<Integer> sortList1 = numbers.stream().sorted().collect(Collectors.toList());
		System.out.println(sortList1);

		// 9. Given a list of integers, sort all the values present in it in descending
		// order using Stream
		// functions?

		List<Integer> sorted1 = numbers.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println(sorted1);
		List<Integer> Sorted2 = numbers.stream().sorted((x, y) -> y - x).collect(Collectors.toList());
		System.out.println(Sorted2);

		// 10. Given an integer array nums, return true if any value appears at least
		// twice in the array,
		// and return false if every element is distinct.

		tempSet.clear();
		boolean b = numbers.stream().filter(x -> tempSet.add(x) == false).count() > 0 ? true : false;
		System.out.println(b);

		// 11. Java 8 program to find factorial of given list of integer values

		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6);
		List<Integer> factList = list1.stream().map(x -> {
			int fact = 1;
			for (int i = 1; i <= x; i++)

				fact = fact * i;
			return fact;
		}).collect(Collectors.toList());

		System.out.println(factList);

		// 12. Write a Java 8 program to sort an array and then convert the sorted array
		// into Stream?
		int arr[] = { 3, 5, 2, 1, 7 };
		Arrays.sort(arr);
		Arrays.stream(arr).forEach(System.out::println);

		// 13. Convert a List of String into upper case using stream
		List<String> listnum = Arrays.asList("partha", "kishore", "ajay");

		List<String> upper = listnum.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());

		System.out.println(upper);

		// 14. Convert a List of String into a Map key and it's length as Map Value
		// using Java 8 Stream
		Map<String, Integer> map = listnum.stream().collect(Collectors.toMap(x -> x, x -> x.length()));
		System.out.println(map);
		//15. flatmap
		List<Integer> even = Arrays.asList(2, 4, 6, 8);
		List<Integer> odd = Arrays.asList(1, 3, 5, 7, 9);
		List<List<Integer>> evenOdd = Arrays.asList(even, odd);
		System.out.println("Before Flattering");
		System.out.println(evenOdd);
		List<Integer> result1 = evenOdd.stream().flatMap(x -> x.stream()).collect(Collectors.toList());
		System.out.println("After Flattering");
		System.out.println(result);
		
		//16.consumer
		Consumer<String> consumer = str -> System.out.println(str);
		listnum.forEach(consumer);

		Consumer<Integer> evenConsumer = n -> {

		if(n % 2 == 0)
		System.out.println(n);
		};
		list1.forEach(evenConsumer);
		
		//17.: Predicate
		Predicate<String> predicate = str -> str.contains("p");
		listnum.stream().filter(predicate).forEach(System.out::println);

		Predicate<Integer> evenPredicate = n -> n % 2 == 0;
		list1.stream().filter(evenPredicate).forEach(System.out::println);
		
		//18.Function
		Function<String, Character> function = str -> str.charAt(0);
		listnum.stream().map(function).forEach(System.out::println);

		Function<Integer, String> function1 = n -> {
		if (n % 2 == 0)
		return "Even";
		else

		return "Odd";
		};
		list1.stream().map(function1).forEach(System.out::println);
		
		//19. supplier
		Supplier<String[]> supplier = () -> new String[] {"One", "Two", "Three"};
		Arrays.asList(supplier.get()).forEach(System.out::println);

		Predicate<String> myPredicate = str -> str.contains("o") || str.contains("O");
		Function<String, Character> myFunction = str -> str.charAt(0);
		Consumer<Character> myConsumer = c -> System.out.println(c);

		Arrays.asList(supplier.get()).stream().filter(myPredicate).map(myFunction).forEach(myConsumer);

		}
	}

}
