package dailypractices;

public class Sumofdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 1237;
		int res = 0;
		int r ;
		while(sum>0) {
			r = sum%10;
			res = res + r;
			sum = sum/10;
		
		}
		System.out.println(res);
	}

}
