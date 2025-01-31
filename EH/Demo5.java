import java.util.*;
class A{	
	void display() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age :");
		int age= sc.nextInt();
		if(age>60){
			throw new InvalidAgeException("Age more the 60 is not allwed ");
		}
		else if(age<18){
			throw new InvalidAgeException("Age less the 18  is not allwed");
		}
		else{
			System.out.println("Valid Age ....!");
		}
	}
}
class Demo5{
	public static void main(String args[]) {
		try{
			A a = new A();
			a.display();
		}
		catch(InvalidAgeException ma){
			System.out.println("Invalid Age  "+ma.getMessage());
		}
	}	
}
class InvalidAgeException extends RuntimeException{
	public InvalidAgeException(String msg)
	{
		super(msg);
	}
}


