package Q3;

public class student {
	String name;
	double mark;
	
	public student(String name,double mark) {
		this.name=name;
		this.mark=mark;
	}
	void display() {
		System.out.println(name+" has got "+mark);
	}
}
