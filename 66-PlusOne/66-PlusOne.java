// Last updated: 5/25/2026, 11:12:45 AM
class Solution {
    public int[] plusOne(int[] arr) {
        int carry = 1;

        for(int i = arr.length - 1; i >= 0; i--) {
            int sum = arr[i] + carry;
            arr[i] = sum % 10;
            carry = sum / 10;
        }

        if(carry > 0) {
            int[] newArr = new int[arr.length + 1];
            newArr[0] = carry;
            System.arraycopy(arr, 0, newArr, 1, arr.length);
            return newArr;
        }

        return arr;
    }
}