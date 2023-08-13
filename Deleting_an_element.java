package arrays;

public class Deleting_an_element {

	public static void main(String[] args) {
		int[] a= {3,2,5,7,1,6,2,5,7,3};
		int ele=1;
		int ind=0;
		int[] b=new int[a.length-1];
		for(int i=0;i<a.length;i++) {
			if(a[i]!=ele) {
				b[ind++]=a[i];
			}
		}
			for (int i : b) {
				System.out.println(i);
			}	
				
	}
	
}
