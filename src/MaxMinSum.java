
public class MaxMinSum {

	public static void main(String[] args) {
		int[] a={10,2,15,28,9};
	       int max=a[0];
	       int min=a[0];
	       int sum=0;
	       for(int i=1;i<a.length;i++){
	           if(a[i]>max)
	           {
	              max =a[i];
	               
	           }
	           }
	            System.out.println("maximum number :"+max);
	            
	        //to find min number
	        for(int i=1;i<a.length;i++) {
	        	 if(a[i]<min)
		           {
		              min =a[i];
		               
		           }
		           }
		            System.out.println("minimum number:-"+min);
		            
		      //sum of array
		      for(int i=0;i<a.length;i++) {
		    	  sum= sum +a[i];
		      }
		      System.out.println("sum of an array elements:"+sum);
	        }

	}


