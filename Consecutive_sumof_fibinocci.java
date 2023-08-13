package arrays;

public class Consecutive_sumof_fibinocci {

	public static void main(String[] args) {
		int[] a= {5,3,8,6,2,9,4};
		int sum=a[0];
		for(int i=1;i<a.length;i++) {
			sum=sum+a[i];
			if(fib(sum)) {
				System.out.println(sum);
			}
		}
	}
	public static boolean fib(int n) {
		int n1=0,n2=1,n3=n1+n2;
		if(n==0) {
			return true;
		}
		while(n3<=n) {
			if(n3==n) {
				return true;
			}
			n1=n2;
			n2=n3;
			n3=n1+n2;
		}
		return false;
	}
}
