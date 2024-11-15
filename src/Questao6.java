public class Questao6 {
    public static void main(String[] args) throws Exception {
        int lastResult = 0;
        int currentResult = 1;
        int aux = 0;

        System.out.printf("%d ", lastResult);
        System.out.printf("%d ", currentResult);

        while (currentResult <= 100) {
            aux = currentResult;
            currentResult += lastResult;
            lastResult = aux;

            System.out.printf("%d ", currentResult);
        }
    }
}
