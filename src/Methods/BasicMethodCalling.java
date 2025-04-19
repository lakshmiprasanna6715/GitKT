package Methods;

public class BasicMethodCalling {

	public void methodCalling() {
		
		int a=10,b=10;
		int sum=a+b;
		System.out.println("Creating an Method");
		System.out.println(+sum);
	}
	
	
	public static void main(String[] args) {
		
		BasicMethodCalling obj=new BasicMethodCalling();
		obj.methodCalling();
		

	}

}
