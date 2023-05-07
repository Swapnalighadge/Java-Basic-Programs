//COUNT THE NUMBER OF DIGITS
public class noofdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=2535;
		int count=0;
		while(n!=0) {
			count++;
			n=n/10;
			
		}
		System.out.println(count);

	}

}
