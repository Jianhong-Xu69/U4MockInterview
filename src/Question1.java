public class Question1 {
    public static void main(String[] args) {
        System.out.println(seriesUp(3));
        System.out.println(seriesUp(4));
        System.out.println(seriesUp(2));
    }

    public static String seriesUp(int n) {
        String result = "";
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                result += j + " ";
            }
        }
        return result;
    }
}