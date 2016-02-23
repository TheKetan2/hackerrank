import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CaesarCipher {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int k = in.nextInt();
        char ch;
        int flag = 0;
        for(int i = 0; i<n; i++){
            ch = s.charAt(i);
            if(((int)ch>=97 && (int)ch <=122) ||((int)ch >=65 && (int)ch <=90)){
                if((int)ch >=97 && (int)ch <=122)
                    flag = 0;  //small
                if((int)ch >=65 && (int)ch <=90)
                    flag = 1;  //cap
                for(int j = 0; j <k; j++){
                    ch++;
                    if(flag==1){
                    if(ch >90)
                        ch = 65;
                    }
                    else if(flag == 0){
                        if(ch >122)
                            ch = 97;
                    }
                }
                
            }
            System.out.print(ch);
        }
        
       
    }
}
