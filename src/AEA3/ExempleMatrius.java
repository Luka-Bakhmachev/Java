public class ExempleMatrius {
    public static void main(String[] args) {
        // Declaració i inicialització d'una matriu de 2 dimensions (3x3)
        int[][] matriu = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("Elements de la matriu:");
        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                System.out.print(matriu[i][j] + " ");
            }
            System.out.println();
        }
        // Accés i impressió dels elements de la matriu
        
    }
}