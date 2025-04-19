
public class SumArrayMethod {

	public static void main(String[] args) {
		
		int[] a= {10,20,30,15,25,35,40};
		
		int sum=sumofarray(a);
		
		System.out.println(+sum);
	}

	private static int sumofarray(int[] a) {
		// TODO Auto-generated method stub
		
		int sum=0;
		for(int i=0;i<a.length;i++) {
	    	  sum= sum +a[i];
	      }
		
		return sum;
	}

}
