package test;//This is saying that this class is a part of the package test.

//The class...
public class Student {//Class is a category of objects, they have state, which is their name, age and vegetarian as listed below.
	String name;//name is a String variable.
	int age;// age is a whole number or integer.
	boolean vegetarian;// vegetarian is a boolean.
	
//The constructor...
public Student(String n, int a, boolean v) {//It gives the instructions for when an instance of a class is constructed. All other methods will have something like void for instance, constructors don't have anything in that space. It is saying to create a student we need three pieces of information which are whatever's inside these brackets.
//The variables...
	this.name = n;
	this.age = a;
	this.vegetarian = v;
//We can't create a new instance of the student class without these instructions being sent.
}

public String changeName(String nn) {//It's public, will return a String, is called changeName and expects a string.
	
	this.name = nn;//Whatever information nn sends us, put as name.
	System.out.println("The student name has been changed.");//Will print out what has happened when the method has been ran.
	return name;//Nothing after the return statement triggers.
}

@Override//This is the toString method we want to run and not the other one, we say this via override.
public String toString() {//"string" = What it's sending back. "toString" = This is the method name. "()" = What we are sending it.
	
return name;//It is returning the name.

}

}