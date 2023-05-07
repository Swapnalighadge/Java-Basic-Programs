//wajp to display prime factors of a number that is 12
public class primefact {
	public static void checkPrime(int no) {
		int count=0;
		for(int i=1;i<=no;i++) {
			if(no%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println(no+"is Prime factor");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int no = 12;
	        
	       for (int i=1;i<=no;i++) {
	    	   if(no%i==0) {
	    		   checkPrime(i);
	    	   }
	}
	        }}

