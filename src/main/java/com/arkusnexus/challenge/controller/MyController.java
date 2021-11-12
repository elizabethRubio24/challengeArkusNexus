package com.arkusnexus.challenge.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.arkusnexus.challenge.services.InterfaceService;

import entity.Access;
import entity.Greeting;
import entity.InheritanceClass;
import entity.PolymorphismClass;
import entity.TypicalClass;

@RestController
@RequestMapping(value="challenge")

public class MyController {
	
	private final AtomicLong counter = new AtomicLong();
	
	private static final String template ="Hello worldddddddddddd";
	
	@Autowired
	private InterfaceService interfaceService;

	
	@GetMapping("/accessModifiers")
	public Greeting accessModifiers(@RequestParam(value="name", defaultValue="world") String name) {

		AccessModifiers instanceAccessModifiers = new AccessModifiers();

		//Public can be accesed from within the class, outside the class, within the package and outside the package
		System.out.println(instanceAccessModifiers.examplePublic);
		
		//Private can be accesed only within the class
		instanceAccessModifiers.publicMethod();
		
		//Protected can be accesed within package and outside the package only through subclass.
		System.out.println(instanceAccessModifiers.exampleProtected);
		
		Access access= new Access();
		access.protectedMethod();
		
		//Default
		System.out.println(instanceAccessModifiers.exampleDefault);
		
		//Static can be accesed from its own class. It´s not necesary to  to instantiate the object.
		System.out.println(AccessModifiers.exampleStatic);		
		
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
	
	@GetMapping	("/typicall")
	public TypicalClass typicalClass() {
		TypicalClass classT = new TypicalClass();
		classT.setColor("Blue");
		classT.setSize(45L);
		classT.setValid(true);
		classT.setWeigth(142);
		
		Integer result = classT.doTheMaths(10, 41);
		classT.printSomething(result);
		
		return classT;		
	}
	
	@GetMapping	("/polymorphism")
	public List<String> polymorphism() {
		List<String> result = new ArrayList<String>();
		
		PolymorphismClass polymorphism= new PolymorphismClass();
		polymorphism.printPolymorphism(" Example 1");

		result.add(polymorphism.printPolymorphism(" Example 1"));
		result.add(polymorphism.printPolymorphism(" Example 2", 101121));
		
		return result;		
	}

	@GetMapping	("/inheritance")
	public Integer inheritance() {
		
		InheritanceClass inheritanceClass = new InheritanceClass();
		Integer anotherResult = inheritanceClass.doTheMaths(1004, 1);
		inheritanceClass.printSomethingElse(anotherResult);
		return anotherResult;
		
	}
	
	@GetMapping("/interface")	
	public String interfaceExample() {		
		return interfaceService.exampleInterface(123L);	
	}
}
