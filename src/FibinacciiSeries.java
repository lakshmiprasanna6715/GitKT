
public class FibinacciiSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//print n=10 fibonacci series
		int a=0,b=1;
		int n=10;
		
		System.out.println("Fibonacci series up to " + n + " terms:");

		
		for(int i=0;i<=n;i++) {
			System.out.println(a+"");
			int sum=a+b;
			a=b;
			b=sum;
			//System.out.println(a+"");
		
		}
			}

}
