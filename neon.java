//wajp to check 9 is neon number or not
package Day2;
import java.util.*;
public class neon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int no= sc.nextInt();
    
        int sq=no*no;
        int sum=0;
        while(sq!=0)
    	{
    		int d=sq%10;
    		sum+=d;
    		sq=sq/10;
    	}
        if(sum==no) {
        	System.out.println(no+"is a Neon number");
        }
        else {
        	System.out.println(no+"is not a Neon number");
        }
	}

}
