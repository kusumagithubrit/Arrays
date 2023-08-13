package arrays;

public class Distinct_odd {

	public static void main(String[] args) {
		int[] a= {5,3,5,3,2,1,2,4};
		int count=0;
		for(int i=0;i<a.length;i++) {
			int count1=0;
			for(int j=0;j<a.length;j++) {
				if(a[i]==a[j]&&i>j) {
					break;
				}
				if(a[i]==a[j]&&a[i]%2==1) {
					count1++;
				}
			}
			if(count1>0)
				count++;
		}
		int[] b=new int[count];
		int ind=0;
		for(int i=0;i<a.length;i++) {
			int count1=0;
			for(int j=0;j<a.length;j++) {
				if(a[i]==a[j]&&i>j) {
					break;
				}
				if(a[i]==a[j]&&a[i]%2==1) {
					count1++;
				}
			}
			if(count1>0) {
				b[ind++]=a[i];
			}
		}
		for(int b1:b)
			System.out.println(b1);
	}

}
