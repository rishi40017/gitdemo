package stepDefinitions;


import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
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
	
	@AfterStep()
	public void hooksafterstep()
	{
		
		System.out.println("hooks - afterstep added after GIT clone");
		System.out.println("adding new step from gitstuff project");
		System.out.println("Adding new second step from Gitstuff project");
	}
}