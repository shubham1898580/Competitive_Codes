
    
    
    public static long polynomialRollingHash( String  str) 
{ 
    // P and M 
    int p = 31; 
    int m = 1000000009; 
     long power_of_p = 1; 
     long hash_val = 0; 
  
    // Loop to calculate the hash value 
    // by iterating over the elements of string 
    for (int i = 0; i < str.length(); i++) { 
        hash_val 
            = (hash_val 
               + (str.charAt(i) - 'a' + 1) * power_of_p) 
              % m; 
        power_of_p 
            = (power_of_p * p) % m; 
    } 
    return hash_val; 
} 
    
    
    