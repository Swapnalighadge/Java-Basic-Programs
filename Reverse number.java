//WAHP TO REVERSE A NUMBER THAT IS 1223
package Day1;

public class revno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int no=1223;
       int rev=0;
       while(no!=0) {
    	   int digit=no%10;
    	   rev=rev*10+digit;
    	   no=no/10;
       }
       System.out.println("The reverse number is:"+rev);
	}

}
