import java.util.Scanner;
public class baniy_sreach {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);

        // Array size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int a[] = new int[n];

        // Sorted array input
        System.out.println("Enter " + n + " elements in sorted order:");

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // Element to search
        System.out.print("Enter element to search: ");
        int search = sc.nextInt();

        int low = 0;
        int high = n - 1;
        int position = -1;

        // Binary Search
        while (low <= high) {

            int mid = (low + high) / 2;

            if (a[mid] == search) {
                position = mid;
                break;
            }
            else if (search > a[mid]) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        // Result
        if (position != -1) {
            System.out.println("Element found at position: " + (position + 1));
        }
        else {
            System.out.println("Element not found");
        }

        sc.close();
   
        
    }
}
