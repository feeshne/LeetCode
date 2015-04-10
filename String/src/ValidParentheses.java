import java.util.Stack;

/**
 * Created by Feeshne on 2015/4/7.
 */
public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("]"));
    }

    public static boolean isValid(String s) {
        if(s==null){
            return true;
        }
        Stack<Character> tmp = new Stack<Character>();
        char[] sChars = s.toCharArray();
        for (int i = 0; i < sChars.length; i++) {
            char j = sChars[i];
            switch (j) {
                case '(':
                case '[':
                case '{':
                    tmp.push(j);
                    break;
                case ')':
                    if (tmp.isEmpty()||tmp.pop() != '(') {
                        return false;
                    }
                    break;
                case ']':
                    if (tmp.isEmpty()||tmp.pop() != '[') {
                        return false;
                    }
                    break;
                case '}':
                    if (tmp.isEmpty()||tmp.pop() != '{') {
                        return false;
                    }
                    break;
            }
        }
        if (tmp.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
