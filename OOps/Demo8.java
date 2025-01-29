class Bank
{
	Bank(){}
	public void roi()
	{	
		System.out.println("10%");
	}
}
class SBI extends Bank
{
	//Bank(){} no y? const namer and class name must be same : hencve it voilets 
}
class Axis extends Bank
{
	public void roi()
	{	
		System.out.println("12%");
	}	
}
class Demo8
{
	public static void main(String args[])
	{
		Bank b = new Bank();
		b.roi();
		Axis a= new Axis();
		a.roi();
	}
}
// same method name and same signature in child class but different implementation in child is called as method over riding 
//