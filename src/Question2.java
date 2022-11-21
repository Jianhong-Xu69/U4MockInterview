public class Question2 {
    public static void main(String[] args) {
        System.out.println(createSequence(0, 2, 10));
        System.out.println(createSequence(5, 3, 5));
    }

    public static String createSequence(int a, int b, int n) {
        String result = "";
        int temp = a;
        for (int i = 0; i < n; i++) {
            temp += Math.pow(2,i) * b;
            result += " " + temp;
        }
        return result;
    }
}