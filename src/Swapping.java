
public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=20, b=200;
	       System.out.println("Before a="+a+", and b="+b);
	       
	       int temp=0;
	       
	       temp=a+b;//temp=20+200=220
	       a=temp-a;//220-20=200
	       b=temp-a;//220-200=20
	       
	       System.out.println("After a="+a+", and b="+b);
	}

}
