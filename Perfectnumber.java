//WAJP TO DISPLAY PERFECT NUMBERS.
public class Perfectno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		int sum=0;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				sum=sum+i;
			}
		}
		if(sum==n) {
			System.out.println(n+" is Perfect number");
		}
		else {
			System.out.println(n+" is Not a Perfect number");
		}

	}

}
