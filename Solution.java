import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //int sum= 0; 
        int maxSum = -1000000;
        int arr[][] = new int[6][6];
        for(int arr_i=0; arr_i < 6; arr_i++){
            for(int arr_j=0; arr_j < 6; arr_j++){
                arr[arr_i][arr_j] = in.nextInt();
            }
        }
        for(int i = 0; i < 6; i++){
        for(int j = 0; j < 6; j++){
            if(i+2<6 && j+2<6){
                int sum = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                if(sum > maxSum)maxSum = sum;
            }
        }
    }
        System.out.println(maxSum);
    }
}
