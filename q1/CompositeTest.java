package test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CompositeTest {
	
	
	@Test
	public void test1(){
		Employee CEO = new Employee("Niju",10,10000.00);
		Employee VP = new Employee("Mahesh",20,5000.0);
		Employee SE = new Employee("Venky",30,500.0);
		Employee SE1 = new Employee("abc",30,500.0);
		CEO.add(VP);
		VP.add(SE);
		VP.add(SE1);
		VP.remove(SE1);
		System.out.println("CEO:"+ CEO.toString());
		for (Employee vp:CEO.getSubordinates()){
			System.out.println("VP:"+vp.toString());
			for (Employee se:vp.getSubordinates()){
				System.out.println("Software Engineer:"+se.toString());
			}
		}
		
		
	}

}
