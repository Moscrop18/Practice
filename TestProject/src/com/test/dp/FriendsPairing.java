package com.test.dp;

public class FriendsPairing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {		
		System.out.println(countFriendsPairings(4));	

	}
	static int countFriendsPairings(int n) 
    { 
		
    
        int dp[] = new int[n + 1]; 
      
        // Filling dp[] in bottom-up manner using 
        // recursive formula explained above. 
        for (int i = 0; i <= n; i++) 
        { 
            if (i <= 2) 
                dp[i] = i; 
            else
                dp[i] = dp[i - 1] + (i - 1)  
                                * dp[i - 2]; 
        } 
        return dp[n]; 
        
    } 
}
