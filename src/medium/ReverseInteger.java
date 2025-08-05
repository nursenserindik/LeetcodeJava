package medium;

public class ReverseInteger {
        public int reverse(int x) {

            boolean isNegative = x < 0;
            int absX =Math.abs(x);
            int reversed =0;

            while(absX !=0){
                int digit = absX %10;
                absX = absX /10;

                if(reversed > (Integer.MAX_VALUE - digit) / 10){
                    return 0;
                }

                reversed =reversed * 10 + digit;
            }

            if(isNegative){
                reversed = -reversed;
            }
            return reversed;
        }

        public static void main(String[] args) {
            ReverseInteger reverseInt = new ReverseInteger();

            int input1 = 123;
            int input2 = -123;
            int input3 = 120;

            System.out.println("Input: " + input1 + " → Output: " + reverseInt.reverse(input1));
            System.out.println("Input: " + input2 + " → Output: " + reverseInt.reverse(input2));
            System.out.println("Input: " + input3 + " → Output: " + reverseInt.reverse(input3));
        }
}

