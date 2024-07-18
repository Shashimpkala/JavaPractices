package dailypractices;

public class Armstrongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =370;
	int	temp = n;
	int r ;
	int sum =0;
	int lastdigit =0;
	while(temp!=0) {
		temp = temp/10;
		lastdigit++;
	}
	temp=n;
	while(temp!=0) {
		r = temp%10;
		sum += Math.pow(r, lastdigit);
		temp=temp/10;
	}
	if(n==sum) {
		System.out.println("number is armstrong");
	}
	else {
		System.out.println("number is not armstrong");
	}
	}

}
