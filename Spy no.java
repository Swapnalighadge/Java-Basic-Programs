//wajp to check 1124 is spy number or not.
public class Spyno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no =1124;
		int temp=no;
		int mul=1;
		int add=0;
		while(no!=0) {
			int d=no%10;
			mul=mul*d;
			add=add+d;
			no=no/10;
		}
          if(add==mul) {
        	  System.out.println(temp+"is a Spy number");
          }
          else {
        	  System.out.println(temp+"is not a Spy number");
          }
	}

}
