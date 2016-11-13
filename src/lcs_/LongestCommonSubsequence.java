/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lcs_;

/**
 *
 * @author nuhin13
 */
public class LongestCommonSubsequence {
     public String lcs(String str1, String str2)
    {
        int length1 = str1.length();
        int length2 = str2.length();
 
        int[][] arr = new int[length1 + 1][length2 + 1];
 
        for (int i = length1 - 1; i >= 0; i--)
        {
            for (int j = length2 - 1; j >= 0; j--)
            {
                if (str1.charAt(i) == str2.charAt(j))
                    arr[i][j] = arr[i + 1][j + 1] + 1;
                else 
                    arr[i][j] = Math.max(arr[i + 1][j], arr[i][j + 1]);
            }
        }
 
        int i = 0, j = 0;
        StringBuffer sb = new StringBuffer();
        while (i < length1 && j < length2) 
        {
            if (str1.charAt(i) == str2.charAt(j)) 
            {
                sb.append(str1.charAt(i));
                i++;
                j++;
            }
            else if (arr[i + 1][j] >= arr[i][j + 1]) 
                i++;
            else
                j++;
        }
        return sb.toString();
    }
}
