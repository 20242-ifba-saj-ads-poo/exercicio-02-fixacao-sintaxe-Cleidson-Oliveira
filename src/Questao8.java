public class Questao8 {
    public static void main (String[] args) throws Exception {
        int size = 10;
        for(int i = 1; i <= size; i++){
            for(int j = 1; j <= size; j++){
                System.out.printf("%d ", i * j);
                if (i == j) {
                    System.out.printf("\n");
                    break;
                }
            }
        }
    }
}
