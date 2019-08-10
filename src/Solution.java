import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scan = new Scanner(System.in);
        int counter = 0;

        int n = scan.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }

        for(int i=1; i<=n; i++){

            for(int j=0; j<=n-i; j++){

                int sum =0;
                for(int k=j; k<j+i; k++){
                    sum = sum + arr[k];
                }
                if(sum<0){
                    counter++;
                }
            }

        }

        System.out.println(counter);
    }
}

