import java.util.Scanner;

public class DuplicateArrayElements {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt(); // user defines array size
        int[] a = new int[n];

        System.out.println("Enter " + n + " array elements:");
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt(); // store user input in array
        }

        System.out.println("Duplicate elements in the array:");
        for(int i = 0; i < a.length; i++) {
            for(int j = i + 1; j < a.length; j++) {
                if(a[i] == a[j]) {
                    System.out.println(a[i]);
                    break;
                }
            }
        }

        sc.close();
    }
}