public class Questao7 {
    public static void main (String[] args) throws Exception {
        int x = 17;

        while (x != 1) {
            if (x % 2 == 0) {
                x /= 2;
            } else {
                x = 3 * x + 1;
            }

            System.out.printf("%d ", x);
        }
    }
}
