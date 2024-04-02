package com.bt.functions;

import java.util.function.Function;

public class SquarWithFunctions {

	public static void main(String[] args) {
		// number squar using functional interface Function with apply methods
		
		
		Function<Integer, Integer> fn=n->n*n;//lamda implementation 
		
		System.out.println("squar of the no: "+fn.apply(11));//apply is funational inteface method

		
		//string length using funation
		
		Function<String, Integer> f=s->s.length();
	
		System.out.println("length of given string is :"+f.apply("welcomt to function "));//output length is 20
		System.out.println("length of given string is :"+f.apply("Rajesh kumar majhi"));//output length is 18
		
	}

}
