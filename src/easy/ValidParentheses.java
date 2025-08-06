package easy;
import java.util.Stack;

class ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            }
            else{
                if(stack.isEmpty()) return false;

                char t = stack.pop();

                if((c == ')' && t !='(') ||
                        (c == '}' && t != '{') ||
                        (c == ']' && t != '[')){

                    return false;
                }
            }
        }

        return stack.isEmpty();

    }

    public static void main(String[] args) {
        System.out.println(isValid("()"));       // true
        System.out.println(isValid("()[]{}"));   // true
        System.out.println(isValid("(]"));       // false
    }
}
