import java.util.Scanner;
import java.util.InputMismatchException;
class  Demo1{
	public static void main(String args[]){
		m1();
	}
	static void m1(){
		m2();
		System.out.println("HI M1 method...!");
	}
	static void m2(){
		m3();
		System.out.println("HI M2 method...!");
	}
	static void m3(){
		try{
			System.out.println("HI M3 method...!");
			Scanner sc = new Scanner(System.in);
			System.out.println("ENTER A VAL :");	int a= sc.nextInt();
			System.out.println("Enter B val :");	int b= sc.nextInt();
			int c = a/b;
			System.out.println("Result is  :"+c);
		}
		catch(InputMismatchException ime){
			System.out.println("Boss please enter NUMBER onmly");
		}
		catch(ArithmeticException ae){
			System.out.println("We cant devide anything by ZERO ...!");
		}	
		catch(Exception e){
			System.out.println(e);
		}
		finally{
			System.out.println("Thank you ...!");
		}
	}

}