class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        char[] num = Integer.toString(x).toCharArray();
        for(int i = 0; i<num.length/2; i ++){
            if(num[i] != num[(num.length-1)-i]){
                return false;
            }
        }return true;
    }
}