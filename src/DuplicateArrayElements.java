
public class DuplicateArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,4,8,5,6,9,5,1,7};
		
		System.out.println("Duplicate array of elements is");
		
		for(int i=0;i<a.length;i++) {
			for(int  j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println(a[i]);
					break;
				}
			}
		}
	}

}
