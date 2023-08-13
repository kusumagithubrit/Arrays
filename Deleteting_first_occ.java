package arrays;

import java.util.Iterator;

public class Deleteting_first_occ {

	public static void main(String[] args) {
		int[] a= {2,8,3,8,5,6,1,8};
		int target=0;
		for(int i=0;i<a.length;i++) {
			int count=0;
			for(int j=0;j<a.length;j++) {
				if(a[i]==a[j]&&i>j) {
					break;
				}
				if(a[i]==a[j]) {
					count++;
				}
			}
			if(count>=2) {
				
				target=a[i];
			}
		}
		int[] b=new int[a.length-1];
		int ind=0;
		for(int i=0;i<a.length;i++) {
			if(i!=ret(a,target)) {
				b[ind++]=a[i];
			}
		}
		for(int b1:b) {
			System.out.println(b1);
		}
}
	public static int ret(int[] a,int target) {
		for (int i = 0; i < a.length; i++) {
			if(a[i]==target)
				return i;
		}
		return 0;
	}
}

