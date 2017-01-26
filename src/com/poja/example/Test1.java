package com.poja.example;

import java.util.HashMap;
import java.util.Map;

public class Test1 {

	public static void main(String[] args) {

		Map map = new HashMap();

		String s1 = "pooja";

		map.put(s1, 123);
		map.put("poonam", 456);
		map.put("sushil", 789);

		s1 = s1.toUpperCase();// POOJA

		map.put(s1, 456);

		System.out.println("value of s1 " + s1);

		System.out.println("I am getting value");
		
		System.out.println(map.get("pooja"));// 123
		System.out.println(map.get("POOJA"));// 456\
		
	}


}
