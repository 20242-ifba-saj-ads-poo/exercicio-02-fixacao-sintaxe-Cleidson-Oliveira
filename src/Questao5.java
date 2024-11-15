public class Questao5 {
    public static void main(String[] args) throws Exception {
        for(int i = 1; i <= 40; i++) {
            System.out.printf("O fatorial de %d é %d \n", i, fatorial(i));
        }
    }

    static long fatorial (int number) {
        long result = 1;

        for (int i = number; i > 0; i--) {
            result *= i;
        }

        return result;
    }
}

/***
 * 
 * O resultado começa a ser retornado errado porque excede o valor 
 * que a variá vel do tipo long pode comportar.
 */