package one;

/**
 * @author dyh
 * @date 2020/5/20
 */
public class Test2 {
    public static void main(String[] args) {
        String s = String.valueOf(10230);
        System.out.println(isPalindrome(-12321));
        System.out.println(5/2);

    }

    public static boolean isPalindrome(int x) {
        if(x<0||(x>0&&x%10==0)) {
            return false;
        }
        String s = String.valueOf(x);
        for (int i = 0; i < s.length(); i++) {
            char k = s.charAt(i);
            char y = s.charAt(s.length() - i - 1);
            if(k!=y){
                return false;
            }
        }
        return true;
    }
}
