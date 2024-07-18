package dailypractices;

public class Fibonocciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first = 1; int second =2;
		int n =10;
		
				System.out.println("Numbers are " + n );
				for(int i = 1;i<n;i++) {
					System.out.println(first + " ");
					int tem = first + second;
					first = second;
					second = tem;
				}

	}

}
