package Java;
/*
 * Array is a collection of similar data type

Array of integer 
Array of string 
Array of char
Array of double and so on

 */
public class Array {

	public static void main(String[] args) {
	
		String array[]=new String[6];
		
		array[0]="mukesh23";
		array[1]="anand";
		array[2]="any";
		array[3]="hj";
		array[4]="ghh";
		array[5]="hgt";
		
		System.out.println(array[3]);	
		
		int size=array.length;
		System.out.println(size);
		
		for(int i=0;i<size;i++) {
			System.out.println(array[i]);
		}

	}

}
