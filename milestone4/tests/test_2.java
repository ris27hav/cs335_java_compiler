public class SyntaxCheck {
    static void printFunc(int val,int c) {
        System.out.println(c);
    }

    public static void main() {
        int a;int k;
        a = 1;
        boolean f;
        f = true || false;
        if (f) {

            k = a + 20;
            a = a + 12;
        }

        while (a < 100) {
            a = a + 1;
            // f = f && false;
            printFunc((float) a);
        }
        a=!a;
        printFunc(a,8);
    }
}
