package arrays.prefix;

import utils.InputUtils;
import utils.PrintUtils;

import java.util.Scanner;

// Given an array of integers of size n, answer q queries.
//Each query gives you two indices l and r (1-based indexing) and asks you to print the sum of elements from index
// l to r (inclusive).
// a= {1,2,3,4,5}
public class PrefixQuery {
    public static int[] makePreFixQuery(int[] arr){
        int[] prefixArray = new int[arr.length+ 1];
//        prefixArray[1] = arr[1];

        for (int i=1; i<= arr.length; i++){
            prefixArray[i] = prefixArray[i-1] + arr[i -1];
        }

        return prefixArray;
    }

    public static void main(String[] args) {
        int[] arr = InputUtils.readIntArray();
        int[] prefixArray = makePreFixQuery(arr);
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter how many time Query run");
        int query =sc.nextInt();
        while (query > 0){
            System.out.println("Please enter Left side Query");
            int left = sc.nextInt();
            System.out.println("Please enter Right side Query");
            int right = sc.nextInt();

            int ans = prefixArray[right] - prefixArray[left -1];
            System.out.println("Your Answer is "+ ans);
            query--;
        }
        PrintUtils.printArray(prefixArray);
    }
}
