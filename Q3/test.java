package Q3;
import java.util.Scanner;
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of the student ");
		String name=sc.next();
		System.out.println("Enter marks ");
		try {
			double mark=sc.nextDouble();
			student s=new student(name,mark);
			if(mark>100) {
				throw new MarksOutOfBoundException("Mark can't be greater than 100");
			}
				else {
					s.display();
				}
			}
		
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			sc.close();
		}
	}

}
