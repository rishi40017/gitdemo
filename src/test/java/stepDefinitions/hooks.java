package stepDefinitions;


import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks {
	
	@Before("@Smoke")
	public void hooksbefore()
	{ 
		System.out.println("-----------------------------------------------");
		System.out.println("hooks - before");
}
	@After("")
	public void hooksafter()
	{ 
		System.out.println("hooks - after");
}
}