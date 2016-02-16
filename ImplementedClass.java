import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Math;

public class ImplementedClass implements InterfaceMethod1, InterfaceMethod2
{
	int input;
	public static void main(String[] arg)
	{
		ImplementedClass Objic = new ImplementedClass();
		Objic.input();
		Objic.display();
	}
	
	public void input()
	{
		BufferedReader ins = new BufferedReader(new InputStreamReader(System.in));
		try 
		{
			System.out.println("Enter a number : ");
			input = Integer.parseInt(ins.readLine());
		} catch (IOException e) 
		{
		}	
	}
	
	public void display()
	{
		System.out.println("Print the number : "+input);
		System.out.println("Print Square of "+input+" " +Math.pow(input, 2));
	}
}