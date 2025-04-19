
public class Palindrome {

	public static void main(String[] args) {
		String a="madam";
	       
	       String rev="";
	       for(int i=a.length()-1;i>=0;i--){
	           rev=rev+a.charAt(i);
	       }

	       System.out.println("reverse string:"+rev);
	       
	       if(a.equals(rev)){
	           System.out.println("then given string is palindrome");
	       }
	           
	           else{
	               System.out.println("then given string is not palindrome");
	           }

	}

}
