//99+1 = 100

public class PlusOne {
    public int[] plusOne(int[] digits) {
        ArrayList<Integer> result = new ArrayList<>();
        int carry = 1;
        for(int i=digits.length-1; i>=0&&carry!=0; i--) {
            int sum = digits[i]+carry;
            digits[i] = sum%10;
            carry = sum/10;
        }
        if(carry == 0) return digits;
        int[] rst = new int[digits.length+1];
        rst[0] = 1;
        for(int i=1; i<rst.length; i++) {
            rst[i] = digits[i-1];
        }
        return rst;
    }
}