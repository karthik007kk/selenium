package Beseantechnologies.Project;


	

	import org.testng.annotations.Test;

	public class invocationcount {
		@Test (invocationCount=1)
			public void computer() {
			System.out.println("system");
			}
			@Test (invocationCount=2)
			public void age() {
				System.out.println("24");
			}
			@Test (invocationCount=3)
				public void book() {
					System.out.println("tamil");
				}
				
		}

			

			
			
			
			

		





