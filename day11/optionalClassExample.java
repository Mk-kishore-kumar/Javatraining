package com.day11;

import java.util.Optional;

public class optionalClassExample {

	public static void main(String[] args) {
		String name = null;
		Optional<String> nameOptional = Optional.ofNullable(name);
		
		if(nameOptional.isPresent()) {
			String value = nameOptional.get();
			System.out.println(value);
			} else {
				System.out.println("value not presents");
			}
	}

}
