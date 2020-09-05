/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Solution
{
    
    public static class pair{
        int first,second;
        pair(int a , int b){
            first = a;
            second = b;
        }
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		 Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		ArrayList<pair> arr = new ArrayList<pair>();
		
		arr.add(new pair(3,5));
		arr.add(new pair(9,5));
		
		System.out.println(arr.get(0).first);
		System.out.println(arr.get(1).first);
		System.out.println(arr.get(0).second);
		System.out.println(arr.get(1).second);
	}
}
