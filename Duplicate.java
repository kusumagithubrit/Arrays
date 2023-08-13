package arrays;

public class Duplicate {

	public static void main(String[] args) {
		int[] a= {10,20,40,30,50,10,70,60,30,90,20,10,7,6,8,7,10};
		int count1=0;
		for(int i=0;i<a.length;i++) {
			int c=0;
			for(int j=0;j<a.length;j++) {
				if(a[i]==a[j]&&i>j) {
					break;
				}
				if(a[i]==a[j]) {
					c++;
					}
				}
			
			if(c>=2) {
				count1++;
				}
		}
		int[] b=new int [count1];
		int ind=0;
		for(int i=0;i<a.length;i++) {
			int c=0;
			for(int j=0;j<a.length;j++) {
				if(a[i]==a[j]&&i>j) {
					break;
				}
				if(a[i]==a[j]) {
					c++;
				}
					if(c>=2) {
						b[ind++]=a[i];
						break;
					}
				}
			}
		
		for (int i : b) {
			System.out.println(i);
		}
	}

}
