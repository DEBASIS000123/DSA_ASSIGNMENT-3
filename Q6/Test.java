package Q6;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box <String> strobj1=new Box<>("It is a object of Box string");
		Box <String> strobj2=strobj1;
		System.out.println("String variable1 contains :"+strobj1.gett());
		System.out.println("String variable2 contains :"+strobj2.gett());
		strobj1.sett("Changed");
		System.out.println("String variable1 contains :"+strobj1.gett());
		System.out.println("String variable2 contains :"+strobj2.gett());
		Box<Integer> intobj1=new Box<>(999);
		Box<Integer> intobj2=intobj1;
		System.out.println("Integer variable1 contains :"+intobj1.gett());
		System.out.println("Integer variable2 contains :"+intobj2.gett());
		intobj1.sett(1000);
		System.out.println("Integer variable1 contains :"+intobj1.gett());
		System.out.println("Integer variable2 contains :"+intobj2.gett());
		Box<Object> obj1 = new Box<>(new Object());
		Box<Object> obj2=obj1;
		System.out.println("Object variable1 contains :"+obj1.gett());
		System.out.println("Object variable2 contains :"+obj2.gett());
		obj1.sett(100);
		System.out.println("Object variable1 contains :"+obj1.gett());
		System.out.println("Object variable2 contains :"+obj2.gett());
		obj1.sett("String putted in the box");
		System.out.println("Object variable1 contains :"+obj1.gett());
		System.out.println("Object variable2 contains :"+obj2.gett());

	}

}
