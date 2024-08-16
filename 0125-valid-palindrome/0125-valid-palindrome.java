class Solution {
    /*
        1. Empty string- true
        2. Mixed cases
    */
    public boolean isPalindrome(String s) {
        
        String sanitised = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        
        int l = sanitised.length();
        for(int i=0; i<l; i++) {
            if(sanitised.charAt(i) != sanitised.charAt(l-i-1)) {
                return false;
            }
        }
        return true;
    }
}