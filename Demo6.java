import java.util.Scanner;
 
class Manager
{
		int id;
		byte  age;
		int salary=90000;
		String name; 
		String des= "Manager";
		Manager(){
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter ID:");
			 id=sc.nextInt();
			System.out.println("Enter Name:");
			 name=sc.next();	
			System.out.println("Enter Age:");
			age=sc.nextByte();
			//System.out.println("Enter salary:");  salary=sc.nextInt();	
			//System.out.println("Enter Designation:"); des=sc.next();	
 
		}
		void display()
		{ 
		System.out.println("====================");
		System.out.println("My Id is: " +id);
		System.out.println("My Name is:" +name);	
		System.out.println("My Age is: " +age);	
		System.out.println("My Salary is: " +salary);	
		System.out.println("My Designation is: " +des);
 
		}
}
class Tester
{
		int id;
		int  age;
		int salary=30000;
		String name; 
		String des= "Tester";
		Tester(){
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter ID:");
			 id=sc.nextInt();
			System.out.println("Enter Name:");
			 name=sc.next();	
			System.out.println("Enter Age:");
			age=sc.nextInt();
			//System.out.println("Enter salary:");  salary=sc.nextInt();	
			//System.out.println("Enter Designation:"); des=sc.next();	
 
		}
		void display()
		{ 
		System.out.println("====================");
		System.out.println("My Id is: " +id);
		System.out.println("My Name is:" +name);	
		System.out.println("My Age is: " +age);	
		System.out.println("My Salary is: " +salary);	
		System.out.println("My Designation is: " +des);
 
		}
}
 
class Developer
{
		int id;
		int  age;
		int salary=50000;
		String name; 
		String des= "Developer";
		Developer(){
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter ID:");
			 id=sc.nextInt();
			System.out.println("Enter Name:");
			 name=sc.next();	
			System.out.println("Enter Age:");
			age=sc.nextInt();
			//System.out.println("Enter salary:");  salary=sc.nextInt();	
			//System.out.println("Enter Designation:"); des=sc.next();	
 
		}
		void display()
		{ 
		System.out.println("====================");
		System.out.println("My Id is: " +id);
		System.out.println("My Name is:" +name);	
		System.out.println("My Age is: " +age);	
		System.out.println("My Salary is: " +salary);	
		System.out.println("My Designation is: " +des);
 
		}
}
 
class Clerk
{
	int id;
		int  age;
		int salary=20000;
		String name; 
		String des= "Clerk";
		Clerk(){
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter ID:");
			 id=sc.nextInt();
			System.out.println("Enter Name:");
			 name=sc.next();	
			System.out.println("Enter Age:");
			age=sc.nextInt();
			//System.out.println("Enter salary:");  salary=sc.nextInt();	
			//System.out.println("Enter Designation:"); des=sc.next();	
 
		}
		void display()
		{ 
		System.out.println("====================");
		System.out.println("My Id is: " +id);
		System.out.println("My Name is:" +name);	
		System.out.println("My Age is: " +age);	
		System.out.println("My Salary is: " +salary);	
		System.out.println("My Designation is: " +des);
 
		}
} 
class Demo6
{
	public static void main(String Args[])
	{
		Manager m=new Manager();
		m.display();	
		Tester t=new Tester();
		t.display();	
		Developer d=new Developer();
		d.display();
		Clerk c=new Clerk();
		c.display();		
	}
}