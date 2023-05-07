//CHECK WHETHER 19 IS SPECIAL NUMBER OR NOT
public class specialno {
public static void main(String[]args) {
	int no=19;
	int temp=no;//19
	int add=0;
	int mul=1;
	int sum=0;
	while(no!=0)
	{
		int d=no%10;
		add=add+d;
		mul=mul*d;
		sum=add+mul;
		no=no/10;
	}
	if(sum==temp) {
		System.out.println(temp+"is a special number");
	}
	else {
		System.out.println(temp+"is not special number");
	}
}
}
