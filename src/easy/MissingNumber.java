package easy;

public class MissingNumber {
    public static int missingNumberXor(int[] nums) {
        int n = nums.length;
        int xor = 0;
        for (int i = 0; i <= n; i++) xor ^= i;
        for (int x : nums) xor ^= x;
        return xor;
    }
    public static void main(String[] args) {
        int[] a = {3, 0, 1};
        int[] b = {0, 1};
        int[] c = {9,6,4,2,3,5,7,0,1};
        int[] d = {};

        System.out.println(missingNumberXor(a));
        System.out.println(missingNumberXor(b));
        System.out.println(missingNumberXor(c));
        System.out.println(missingNumberXor(d));
    }

}
