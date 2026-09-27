class Solution {
    public boolean isPalindrome(String s) {
        char[] pal = s.toLowerCase().replaceAll("[^A-Za-z0-9]","").toCharArray();
        int i=0;
        int j=pal.length-1;
        while(i<j){
            if(pal[i]!=pal[j]) return false;
            i++;
            j--;
        }
        return true;
    }
}
