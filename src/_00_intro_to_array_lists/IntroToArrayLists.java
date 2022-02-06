package _00_intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList (java.util) class
		ArrayList<String> stringArr = new ArrayList<String>();

		//2. Add five Strings to your list
		stringArr.add("Kayla");
		stringArr.add("Bob");
		stringArr.add("John");
		stringArr.add("Doe");
		stringArr.add("Susan");
		
		//3. Print all the Strings using a standard for-loop
		System.out.println("Print strings using a standard for-loop:");
		for (int i = 0; i < stringArr.size(); i++) {
			System.out.println(stringArr.get(i));
		}
		
		//4. Print all the Strings using a for-each loop
		System.out.println("Print strings using a for-each loop:");
		for(String s : stringArr){
			System.out.println(s);
		}
		
		//5. Print only the even numbered elements in the list.
		System.out.println("Print even numbered elements in the list:");
		for (int i = 0; i < stringArr.size(); i++) {
			if (i % 2 == 0) {
				System.out.println(stringArr.get(i));
			}
		}
		
		//6. Print all the Strings in reverse order.
		System.out.println("Print all strings in reverse order:");
		for (int i = (stringArr.size()-1); i >= 0; i--) {
			System.out.println(stringArr.get(i));
		}
		
		//7. Print only the Strings that have the letter 'e' in them.
		System.out.println("Print only strings that have the letter 'e' in them:");
		for(String s : stringArr){
			if (s.contains("e")) {
				System.out.println(s);
			}
		}
	}
}
