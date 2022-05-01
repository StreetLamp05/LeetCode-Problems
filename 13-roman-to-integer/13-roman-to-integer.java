class Solution {
    public int romanToInt(String s) {
        int total = 0;
        int test = 0;
        
        for (int i = s.length()-1; i >=00; i--){
            switch(s.charAt(i)) {
                case 'I': test = 1; break;
                case 'V': test = 5; break;
                case 'X': test = 10; break;
                case 'L': test = 50; break;
                case 'C': test = 100; break;
                case 'D': test = 500; break;
                case 'M': test = 1000; break;
            }
            if (4 * test < total) total -= test;
            else total += test;
        }
        return total;
    }

}