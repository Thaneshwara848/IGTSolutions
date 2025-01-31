import java.util.*;
class A{
	A(){}
	A(String name)
	{
		System.out.println("A (String name )");
	}
	void abc()
	{
		System.out.println("Hi XYZ moethod...!");
	}
}
class B extends A{
	B()
	{
					// same class with 1 paramanet construtor
		this(100);	
		System.out.println("Hi B()");	
	}
	B(String name, int age)
	{
		super("Myname");
		System.out.println(" B(String name, int age)");	
	}
	B(int a)
	{
		this("Thanesh",45);
		System.out.println("Hi B(int a)");
	}
	void abc()
	{
		super.abc();				// same class with no arg method
		System.out.println("Hi ABC moethod...!");
	}
}
class Demo4{
	public static void main(String args[]) 
	{
		B b = new B();
		b.abc();
		//B b1= new B(100);
	}	
}