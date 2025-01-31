abstract class Bank
{
	abstract void ATM();
}
class Sbi extends Bank
{
	void ATM()	
	{
		System.out.println("Master Card ");
	}
}
class Axis extends Bank
{
	void ATM()	
	{
		System.out.println("Platinum Card ");
	}

}
public class Demo13
{
	public static void main(String args[]) 
	{
		//A a = new A();
		Sbi s = new Sbi();s.ATM();
		Axis a= new Axis();a.ATM();
	}
}
