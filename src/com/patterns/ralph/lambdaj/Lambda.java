package com.patterns.ralph.lambdaj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Lambda {

	public static void main(String[]args){
		
		
		//simple sorting made readable and less coding in lambda expression 
		List<Person> personList = new  ArrayList<>();
		personList.add(new Person(20, "a", 18));
		personList.add(new Person(3, "b", 20));
		personList.add(new Person(1, "c", 19));
		personList.add(new Person(15, "d", 22));
		personList.add(new Person(12, "e", 12));
		
		//before lambda
		personList.sort(new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getAge()-o2.getAge();
			}
		});
		//lambda 
		personList.sort((p1, p2) -> p1.getAge() -p2.getAge());
		//or
		Comparator<Person> ageComparator = (p1,p2)->p1.getAge() -p2.getAge();
		Comparator<Person> nameComparator = (p1,p2)->p1.getName().compareTo(p2.getName());
		personList.sort(nameComparator);
		
		//before lambda
//		for(Person person : personList){
//			System.out.println(person);
//		}
		
		//after lambda
		personList.forEach(person -> System.out.println(person));

		StringBuilder sb = new StringBuilder();
		//before lambda
		for(Person person :personList){
			sb.append(person.getName()).append(",");
		}
		sb.deleteCharAt(sb.length()-1);
		System.out.println(sb.toString());
		
		//after lambda
		String result = personList.stream().map(person->person.getName()).collect(Collectors.joining(","));
		System.out.println(result);
		
		String[] splitter = "1 3 5 2 6 3".split(" ");
		//before lambda
		for(int x=0;x<splitter.length;x++){
			System.out.print(splitter[x]);
		}
		
		IntStream.range(0, splitter.length).forEach(x-> System.out.println(splitter[x]));

		
	}
}
