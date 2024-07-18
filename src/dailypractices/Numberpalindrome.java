package dailypractices;

public class Numberpalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 121;
		int temp = n;
		int sum =0;
		while(temp!=0) {
			int r = temp%10;
			sum = (sum*10)+r;
			temp = temp/10;
			
		}
		if(sum==n) {
			System.out.println("number is palindrome");
			
		}
		else {
			System.out.println("number is not palaindrome");
		}

	}

}
