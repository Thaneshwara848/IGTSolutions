class Emp
{
}
class Clerk extends Emp
{
	Address a = new Address();
}
class Dev extends Emp 
{
	Address a = new Address();// obj ref
	void display()
	{
		System.out.println("Pin :"+a.pin);
	}
}
class Address
{
	int pin=9988;
	String street="5 th main";
}
class Dmo6
{
	public static void main(String args[])
	{
		Dev d = new Dev();
		d.display();
	}
}