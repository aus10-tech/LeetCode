class Solution {
    public int romanToInt(String s) {
        char[] num = s.toCharArray();
        int sum = 0;
        for(int i = 0; i<num.length; i++){
            if(num[i] == 'M'){
                sum+=1000;
            }else if(num[i] == 'D'){
                sum+=500;
            }else if(i <= num.length-2 && num[i] == 'C' && (num[i+1] == 'D' || num[i+1] == 'M')){
                sum-=100;
            }else if(num[i] == 'C'){
                sum += 100;
            }else if(num[i] == 'L') {
                sum +=50;
            }else if(i <= num.length-2 && num[i] == 'X' && (num[i+1] == 'L' || num[i+1] == 'C')){
                sum -= 10;
            }else if(num[i] == 'X'){
                sum += 10;
            }else if(i <= num.length-2 && num[i] == 'I' && (num[i+1] == 'X' || num[i+1] == 'V')){
                sum -= 1;
            }else if(num[i] == 'I'){
                sum += 1;
            }else if(num[i] == 'V'){
                sum += 5;
            }
        }return sum;
    }
}