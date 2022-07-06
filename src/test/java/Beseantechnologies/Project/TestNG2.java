package Beseantechnologies.Project;

import org.testng.annotations.Test;

public class TestNG2 {
	
	public class invocationcount {
		@Test (groups = {"Smoke"})
			public void computer() {
			System.out.println("system");
			}
			@Test (groups = {"sanity"})
			public void age() {
				System.out.println("24");
			}
			@Test  (groups = {"reg"})
				public void book() {
					System.out.println("tamil");
				}
				
		}

}
