package arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] a= {8,7,9,5,6,2,1};
		for(int i=0;i<a.length-1;i++) {
			for(int j=1;j<a.length-i;j++) {
				if(a[j-1]>a[j]) {
					int temp=a[j-1];
					a[j-1]=a[j];
					a[j]=temp;
				}
				
			}
		}
		System.out.print("[");
		for(int a1:a) {
			System.out.print(a1+" ");
		}
		System.out.println("]");
	}

}
