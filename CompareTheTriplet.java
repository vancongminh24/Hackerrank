import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
/** The question is too long so I just copy the link
 * link: https://www.hackerrank.com/challenges/compare-the-triplets/problem
 * **/

public class Solution {

    /*
     * Complete the solve function below.
     */
    static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2) {
        /*
         * Write your code here.
         */
        int a = 0, b = 0;
        if(a0>b0){
            a++;
        }else if (a0<b0){
            b++;
        }else{ 
        }
        if(a1>b1){
            a++;
        }else if (a1<b1){
            b++;
        }else{   
        }
         if(a2>b2){
            a++;
        }else if (a2<b2){
            b++;
        }else{
            
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

        int[] result = solve(a0, a1, a2, b0, b1, b2);

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