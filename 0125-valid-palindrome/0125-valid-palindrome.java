class Solution {
    public boolean isPalindrome(String s) {
        String clean = s.replaceAll("[^a-zA-Z0-9]", "");
        String reverse = new StringBuilder(clean).reverse().toString();
        if(clean.toLowerCase().equals(reverse.toLowerCase())){
            return true;
        }return false;
    }
}