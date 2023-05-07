//WAJP TO CHECK IF THE NUMBER IS PALINDROME OR NOT
package Day1;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1221;
		int temp=n;
		int r=0;
		while(n!=0) {
			int d=n%10;
			r=r*10+d;
			n=n/10;
		}
         if (temp==r) {
        	 System.out.println(n+"Palindrome number");
         }
         else {
        	 System.out.println(n+"not a Palindrome number");
         }
	}

}
