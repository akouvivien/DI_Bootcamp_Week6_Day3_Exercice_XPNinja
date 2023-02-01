public class word {
    public int warOfNumber(int[] tab) {
        int sumOfNbrePair = 0, sumOfNbreImpair = 0;
        for(int i = 0; i < tab.length; i++) {
            if(tab[i] % 2 == 0) {
                sumOfNbrePair+=tab[i];
            }else {
                sumOfNbreImpair+=tab[i];
            }
        }
        
        int sumNbreDiff = (sumOfNbreImpair < sumOfNbrePair) ? sumOfNbrePair - sumOfNbreImpair : sumOfNbreImpair - sumOfNbrePair;
        
        return sumNbreDiff;
    }
}