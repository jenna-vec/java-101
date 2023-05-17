class Solution {
    public String longestPalindrome(String s) {

        int length = s.length();
        String palindrome = "";

        //checks for odd length palindrome
        for(int i=1; i<length-1; i++){
            int leftIndex = i-1;
            int rightIndex = i+1;
            while(leftIndex>=0 && rightIndex<length && s.charAt(leftIndex) == s.charAt(rightIndex)){
                leftIndex--;
                rightIndex++;
            }
            String current = s.substring(leftIndex+1, rightIndex);
            if(current.length()>palindrome.length()){
                palindrome = current;
            }
        }
      
        //checks for even length palindrome
        for(int i=0; i<length; i++){
            int leftIndex = i;
            int rightIndex = i+1;
            while(leftIndex>=0 && rightIndex<length && s.charAt(leftIndex) == s.charAt(rightIndex)){
                leftIndex--;
                rightIndex++;
            }
            String current = s.substring(leftIndex+1, rightIndex);
            if(current.length()>palindrome.length()){
                palindrome = current;
            }
        }

        //first letter is given if no palindrome is present
        if(palindrome.length()==0){
            palindrome = s.substring(0,1);
        }

        return palindrome;

    }
}
