public class TrobarMaxMin {
    public static void main(String[] args) {
        int[] vector = {12, 3, 45, -3, 65, -5, 88, 99, 2, 23, 54, 33, 27, 53, 96, 0};

        int min = vector[0];
        int max = vector[0];

        // Recorrem el vector per trobar mínim i màxim
        for (int i = 1; i < vector.length; i++) {
            System.out.println(vector[i]);
            if (vector[i] < min) {
                min = vector[i];
            }
            if (vector[i] > max) {
                max = vector[i];
            }
        }

        // Mostrar resultats
        System.out.print("El vector és: {");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i]);
            if (i < vector.length - 1) System.out.print(", ");
        }
        System.out.println("}");

        System.out.println("El nombre més petit del vector és: " + min);
        System.out.println("El nombre més gran del vector és: " + max);
    }
}
