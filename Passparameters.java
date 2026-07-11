package Java;

/*parameters --To make our program dynamic we can pass parameter while calling methods

parameter can be compiled time and runtime as well.

*/

public class Passparameters {

	public static void main(String[] args) {
		Passparameters.set(344.34,34.54);
		Passparameters obj=new Passparameters();
		obj.cat(23,23);
		
	}
	
	public void cat(int a,int b) {
		int c=a+b;
		System.out.println(c);
		}
	
	public static void set(double s,double k) {
		double c=s+k;
		System.out.println(c);
		
		
	}

}
