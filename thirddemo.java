package wrapperdemo;

public class thirddemo {

	public static void main(String[] args) {
		  
		
		String Price1="345.89";
		String Price2="450.89";
		
		double p1=Double.parseDouble(Price1);
		double p2=Double.parseDouble(Price2);
		
	double sum=p1+p2;
	
	System.out.println(sum);
	
	if(sum==796.78) {
		System.out.println("Passed");
	}
	else {
		System.out.println("Not Passed");
	}

	}

}
