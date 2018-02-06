package recursionlesson;

public class RecursionLesson {

    public static void main(String[] args) {
        // Given a string, compute recursively (no loops) the number of lowercase x's         
//Base case allows you to exit a recursive call.
        System.out.println (CountX("hsfcxxx"));

    }

    public static int CountX(String str) {
        if (str.length() == 0) {
            return 0;
        }
        if (str.substring(0, 1).equals("x")) {

            return 1 + CountX(str.substring(1)); // RECURSIVE CALL
        } else {

            return 0 + CountX(str.substring(1)); // RECURSIVE CALL
        }

    }

}
