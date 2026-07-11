package wrapperdemo;
/*
 * when to use
 * Using collection framework
 * To convert primitive data type to object and vice versa
 * 
 */
public class fourthdemo {

	public static void main(String[] args) {
		//autoBoxing--automatically convert primitive data type to corresponding object wrapper class
		
		int a=100;
		
		Integer c=a;
		System.out.println(c);
		
		//Autoboxing
		 int x=130;
		 Integer y=Integer.valueOf(x);
		System.out.println(y);

		
		//Unboxing--convert object wrapper class object to respective primitive data type
		
		Integer marks=100;
		int newmarks=marks.intValue();
		System.out.println(newmarks);
		
		//autounboxing
		
		Integer result=45;
		int newresult=result;
		System.out.println(newresult);
	}

}
