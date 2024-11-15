public class Questao4 {
    public static void main(String[] args) throws Exception {
        for(int i = 1; i <= 10; i++) {
            System.out.printf("O fatorial de %d é %d \n", i, fatorial(i));
        }
    }

    static int fatorial (int number) {
        int result = 1;

        for (int i = number; i > 0; i--) {
            result *= i;
        }

        return result;
    }
}
