/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lcs_;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 *
 * @author nuhin13
 */
public class LCS_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        System.out.println("\nEnter string 1:");
        String str1 = br.readLine();
 
        System.out.println("\nEnter string 2:");
        String str2 = br.readLine();
 
        LongestCommonSubsequence obj = new LongestCommonSubsequence(); 
        String result = obj.lcs(str1, str2);
 
        System.out.println("\nLongest Common Subsequence : "+ result);
    }
}
