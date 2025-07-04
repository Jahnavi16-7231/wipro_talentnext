package java_fundamentals;

public class Question16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int n=10;n<=99;n++) {
			boolean isPrime=true;
			for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				isPrime=false;
				break;
			}
		}
		
		if(isPrime) {
			 System.out.print(n+" ");
		}
	  }
	  
	}
}
	


