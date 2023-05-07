//WAJP TO DISPLAY PERFECT NUMBERS IN RANGE OF 1 TO 1000
public class Perfectnorange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int n=1;n<=1000;n++) {

			int sum=0;
			for(int i=1;i<n;i++) {
				if(n%i==0) {
					sum=sum+i;
				}
			}
			if(sum==n) {
				System.out.println(n+" is Perfect number");
			}
			
		}
	}
	}


