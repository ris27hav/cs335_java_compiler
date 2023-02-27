public class SyntaxCheck {
    public static void main(String[] args) {
        int a;
        a = 5;
        a++;
        printFunc(a);

        float b = 3.14f; // Default to a float type
        printFunc(b);

        long val = 100L;
        printFunc(val);

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }
    }

    static void printFunc(float val) {
        System.out.println(val);
    }

    static void printFunc(int val) {
        System.out.println(val);
    }

    static void printFunc(long val) {
        System.out.println(val);
    }
}
