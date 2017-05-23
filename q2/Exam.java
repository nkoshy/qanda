package test;

public class Exam {
	
	private int examid;
	private String examname;
	private int slots;
	
	public Exam( int examid, String examname, int slots){
		
		this.examid = examid;
		this.examname = examname;
		this.slots = slots;
		
	}
	
	public Boolean Register(){
		
		if (this.slots > 0) {
		
		this.slots--;
			return true;
		}else{
			return false;
		}
	}
	
	public void UnRegister(){
		
		this.slots++;
		
	}
	
	public int getSlots(){
		
		return this.slots;
	}
	
	

}
