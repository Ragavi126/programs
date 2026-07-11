package Java;
/*string class has inbuilt methods which will help you to perform operations on strings

comparing, converting, split, concatenate and so on


startswith and endswithb method which will return true or false
split(expression)-will return array of String
trim--eliminates white space before and after string
equals-- Will compare and return true or false
equalsignorecase--will compare content and return true or false
charAt--returns a character at specified index
*/

public class stringclass {

	public static void main(java.lang.String[] args) {
		
		String name="Welcome to-java";
		
		System.out.println(name.startsWith("Welcome"));
		
		
		String name1="  Wletcome to java world   ";
		
		System.out.println(name1.endsWith("world"));
		
		String[] s=name.split("-");
		
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
		}
		
	String s1=name1.trim();
	
	System.out.println(s1);
	
	for(int i=0;i<name.length();i++) {
		System.out.println(name.charAt(i));
	}
		
	}
}
