package arrays;

public class Consecutive_sum {

	public static void main(String[] args) {
		int[] a= {5,3,8,6,2,9,4};
		int sum=a[0];
		for(int i=1;i<a.length;i++) {
			sum=sum+a[i];
			if(palin(sum)) {
				System.out.println(sum);
			}
		}
	}
	public static boolean palin(int n) {
		int rev=0,temp=n;
		while(n!=0) {
			int r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		if(rev==temp) {
			return true;
		}
		return false;
	}
	
}
