public class App {
    public static void main(String[] args) throws Exception {

        int[][] tab2D = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
            };
    
        int j,i= 0;
        //parcourt le tableau tab2D 
        for (int[] tab1D : tab2D) {
            j = 0;
            // affiche le contenu de chaque objet 
            for (int valeur : tab1D) {
                System.out.println(valeur);
                j++;
            }
            i++;
        }
    }
}
