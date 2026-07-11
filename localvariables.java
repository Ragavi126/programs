package Java;
/*
 * local variable are the variables which are declared within the method, constructor or blocks
it is mandatory to initialize the local variable before using otherwise will not be able to compile the code

 */
public class localvariables {

	public static void main(String[] args) {
		
		int x=100;
		
		localvariables v=new localvariables();
		v.sum();
		localvariables.sub();

	}
	
	public void sum() {
		System.out.println("sum");
		int marks=100;
	}
	
	public static void sub() {
		System.out.println("marks");
	}

}
