package com.arkusnexus.challenge.controller;

public class AccessModifiers {
	
	public String examplePublic="Public access";
	private int examplePrivate=232;
	protected  Boolean exampleProtected=true;
	static long exampleStatic=123l;
	char exampleDefault ='a';
	
	
	public void publicMethod () {
		System.out.println(examplePrivate);
	}

	protected void protectedMethod () {
		System.out.println(exampleProtected);
	}

}
