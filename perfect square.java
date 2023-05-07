//WAJP TO TO FIND WHETHER A NUMBER IS PERFECT SQUARE OR NOT
package Day1;

public class Perfectsq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=49;
        int temp=0;
        for (int i=1;i<no;i++) {
        	if (no%i==0 && i*i==0) {
        		temp=i*i;
        	}
        }
        if(temp==0) {
        	System.out.println(no+"perfect Square");
        }
        else {
        	System.out.println(no+"not a perfect Square");
        }
	}

}
