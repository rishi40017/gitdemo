package stepDefinitions;

public class utils {
	
	public void utilsmethod()
	{
		System.out.println("This is a new change in the develop branch");
		
	}
	public void add_two_numbers()
	
	{
		int a = 4;
		int b = 3 ;
		System.out.println("#### Before Change #####" +"\na: " +a +"\nb: " +b);
		a = a * b;
		b = a / b;
		a = a / b;
		System.out.println("#### After Change #####" +"\na: " +a +"\nb: " +b);
		
		
		
	}
	

}
