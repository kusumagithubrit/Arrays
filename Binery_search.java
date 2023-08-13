package arrays;

public class Binery_search {

	public static void main(String[] args) {
		int[] a= {4,3,5,7,9,2};
		int ele=9;
		int f=0;
		int ind=-1;
		int l=a.length-1;
		int mid=(f+l)/2;
		while(f<=l) {
			if(ele==a[mid]) {
				ind=mid;
				break;
			}
			else if(ele>a[mid]) {
				f=mid+1;
			}
			else {
				l=mid-1;
			}
			mid=(f+l)/2;
		}
		if(mid==-1) {
			System.out.println("Element not found");
		}
		else {
			System.out.println("Element found" );
		}
	}

}
