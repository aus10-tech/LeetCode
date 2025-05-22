class Solution {
    public int lengthOfLastWord(String s) {
        int length = s.length();
        if(s.contains(" ")){
        String[] words = s.split(" ");
            length = words[words.length-1].length();
        }
        return length;
    }
}