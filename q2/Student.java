package test;

import java.util.ArrayList;
import java.util.List;

public class Student {

	private int studentid;
	private String name;
	private List<Exam> exams;
	
	public Student(int studentid, String name){
		
		this.studentid=studentid;
		this.name=name;
		this.exams = new ArrayList<Exam>();
		
		 
		
	}
	
	
	
	public void registerExam(Exam exam){
		
		
		if (this.exams != null){
			if (!this.exams.contains(exam)){
			
			if(exam.Register()){
				this.exams.add(exam);
			}else{
				System.out.println("No Slots available");
			}
				
		
		}else{
			System.out.println("Already registered");
		
		}
		
		}
		
	}
	
	public void UnRegisterExam(Exam exam){
		
		
	if (this.exams != null){	
		if (this.exams.contains(exam)){
			
			exam.UnRegister();
			this.exams.remove(exam);
		}else{
			System.out.println("Not registered");
		
		}
	}
		
	}
}
