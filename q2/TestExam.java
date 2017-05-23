package test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class TestExam {

	@Test
	public void runTests() {
		// TODO Auto-generated method stub
		Exam ex1 = new Exam(5,"exam1",3);
		Exam ex2 = new Exam(4,"exam2", 3);
		
		Student s1 = new Student(1,"venky");
		Student s2 = new Student(1,"ninja");
		Student s3 = new Student(1,"nnja");
		Student s4 = new Student(1,"nja");
		s1.registerExam(ex1);
		s1.registerExam(ex2);
		s2.registerExam(ex1);
		s2.registerExam(ex2);
		
		s2.registerExam(ex2);
		s3.registerExam(ex2);
		s4.registerExam(ex2);
		s2.UnRegisterExam(ex2);
		
		System.out.println(ex1.getSlots());
		
		
		System.out.println(ex2.getSlots());
	}

}
