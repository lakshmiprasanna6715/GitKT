
public class CountToVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Automation World";
		str=str.toLowerCase();
		int Vowels=0,Consonants=0;
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch>='a' && ch<='z')
			{			
				if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				
				Vowels++;
				
			}else {
				Consonants++;
			}
		}
		
	}
	System.out.println("Vowels" +Vowels+",Consonants" +Consonants);
}

}
