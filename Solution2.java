import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int sol = 0;
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int c = in.nextInt();
            int m = in.nextInt();
            sol = n/c;
            if(sol>=m)  
        {  
            int temp=sol;  
                do{  
                    temp-=m;  
                    sol++;
                    temp++;  
                  }while(temp>=m);  
            }
        System.out.print(sol+"\n");
        }
    }
}
