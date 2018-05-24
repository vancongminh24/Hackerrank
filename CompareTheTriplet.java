import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
/** The question is too long so I just copy the link
 * link: https://www.hackerrank.com/challenges/compare-the-triplets/problem
 * **/

public class Solution {

    static int[] solve(int[] arr1,  int[] arr2) {
       
        //initially, Alice and  Bob have 0-point at first
        int a = 0, b = 0;
        
        for (int i = 0; i < arr1.length; i++){
            if (arr1[i] > arr2[i]){
                a++;
            } else if (arr1[i] < arr2[i]) {
                b++;
            }
        }

        return new int[] {a,b};
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] a0A1A2 = scan.nextLine().split(" ");

        int a0 = Integer.parseInt(a0A1A2[0].trim());

        int a1 = Integer.parseInt(a0A1A2[1].trim());

        int a2 = Integer.parseInt(a0A1A2[2].trim());

        String[] b0B1B2 = scan.nextLine().split(" ");

        int b0 = Integer.parseInt(b0B1B2[0].trim());

        int b1 = Integer.parseInt(b0B1B2[1].trim());

        int b2 = Integer.parseInt(b0B1B2[2].trim());

        int[] arr1 = {a0,a1,a2};
        int[] arr2 = {b0,b1,b2};

        int[] result = solve(arr1, arr2);

        for (int resultItr = 0; resultItr < result.length; resultItr++) {
            bw.write(String.valueOf(result[resultItr]));

            if (resultItr != result.length - 1) {
                bw.write(" ");
            }
        }

        bw.newLine();

        bw.close();
    }
}