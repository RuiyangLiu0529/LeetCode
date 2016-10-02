public class ReverseString {
    public String reverseString(String s) {
        if(s == "" || s.length() == 0) {
            return s;
        }
        char [] chars = s.toCharArray();
        int left = 0;
        int right = chars.length-1;
        while(left < right) {
            swap(chars, left, right);
            left++;
            right--;
        }
        return new String(chars);
    }
    private void swap(char[] a, int i, int j) {
        char temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    
}