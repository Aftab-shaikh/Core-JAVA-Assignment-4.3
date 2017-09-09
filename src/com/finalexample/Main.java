package com.finalexample;
/* 
 * final example class
 * final keyword means it is fixed we cannot change it
 * final keyword use for variable , method , class 
 *  ( CONSTRUCTOR IS IMPLICITLY FINAL AND STATIC AND IT CANT BE OVERRIDDEN SO NO NEED TO MAKE IT FINAL)
 */

public class Main { // MAIN class contains main method
	public static void main(String[] args) { // main method
		
		FinalMethodExample studentstudying=new FinalMethodExample(); //object created of final class 
		studentstudying.finalMethod(); // could not be overridden but reused it
		
		FinalVariableExample finalVariable=new FinalVariableExample(); // object created just to print the student details and for example
		finalVariable.printStudentDetails();// method to print
		
	}

}

//----------------------------------------------------------------------------------------------------------------------------------------
// EXAMPLE OF FINALL CLASS CANNOT BE EXTENDED BY ANY CLASS

final class ImFinalClass{// this class is a final
	
	void finalClassmethod() { // A method just for example
	System.out.println("I am final Class (cannot be inherited by any class)");	
	}
}  



//class example1 extends ImFinalClass{ // HERE IT WILL NOT ALLOW TO EXTEND (AS PARENTS CLASS IS FINAL)
	
     //  void finalClassmethod() { // A method just for example (CANNOT BE OVERRIDDEN as class is final)
     // System.out.println("I am not a final Class ");	
     // }
   // }  
//}

//COMPILE TIME ERROR

//-----------------------------------------------------------------------------------------------------------------------------------------

// EXAMPLE OF FINAL METHOD 

class FinalMethodExample{ // this class is not final 
	
	final void finalMethod(){ // this is final method
		System.out.println("Student is studying");
	}
	
}

class Student1 extends FinalMethodExample{ // Student1 class extended FinalMethodExample class but CANNOT OVERRIDE the final method BUT CAN BE REUSE
	
	//void finalMethod() { 
	//	System.out.println("Student is not studying"); (CANNOT BE OVERRIDDEN as method is final) however we can reuse it
	//}
	
}

//------------------------------------------------------------------------------------------------------------------------------------------

// FINAL VARIABLES EXAMPLE 
class FinalVariableExample{ // Example class for final variable
	
	final String studentName; // final uninitialised variable 
	static final int rollnumber; //static final uninitialised variable
	final int ID = 12345; // final initialised variable
	
	static{rollnumber=72;} // static final uninitialised variable like rollnumber can be initialised only in static block
	
	public FinalVariableExample() { // constructor cannot be final ( CONSTRUCTOR IS IMPLICITLY FINAL AND STATIC AND IT CANT BE OVERRIDDEN SO NO NEED TO MAKE IT FINAL)
		
		studentName="Aftabalam aslam husen shaikh"; // final uninitialised variable like studentName can be only initialised in constructor
		
	}
	
	void printStudentDetails() { // this method just to print details of student
		System.out.println(" Student name is :- " + " " + studentName);
		System.out.println(" Student Roll Number is :- " + " " + rollnumber);
		System.out.println(" Student ID is :- " + " " + ID);
	}
}












