public class App {

       public static  int  warOfNumbers(int[] array) {
        int somOfnbrePair = 0;
        int somOfnbreImpair = 0;


        for (int b : array) {
            if (b % 2 == 0){
             somOfnbrePair   +=b; 
          }else  {
             somOfnbreImpair +=b;
        }
    }
           //si 
        int difference = (somOfnbrePair > somOfnbreImpair)?somOfnbrePair - somOfnbreImpair:somOfnbreImpair - somOfnbrePair;
        // System.out.println(difference);
        return difference;

    // if ( somOfnbrePair  > somOfnbreImpair) {
    //     System.out.println(somOfnbrePair+" is larger than "+somOfnbreImpair);
    //     difference = somOfnbrePair - somOfnbreImpair;
    //     System.out.println("la difference est "+difference);
    // } else {
    //     System.out.println(somOfnbreImpair+" is larger than "+somOfnbrePair);
    //     difference = somOfnbreImpair - somOfnbrePair;
    //     System.out.println("la difference est "+difference);
    // }

  }

    public static void main(String[] args) throws Exception {
        int[] array = { 5, 9, 45, 6, 2, 7, 34, 8, 6, 90, 5, 243 };
         warOfNumbers(array);
    }


}
