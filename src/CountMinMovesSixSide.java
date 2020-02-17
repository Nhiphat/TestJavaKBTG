public class CountMinMovesSixSide {
    public int solution(int [] A) {
        int countMin = Integer.MAX_VALUE;
        for (int i = 1 ; i <= 6;i++){
            if(countRotate(i,A) < countMin){
                countMin = countRotate(i,A);
            }
        }
        return countMin;
    }
    private int countRotate(int i, int [] A){
        int count = 0;
        for(int k = 0;k<A.length;k++){
            if(A[k] != i && ((A[k] + i) != 7)){
                count++;
            }
            if((A[k] + i) == 7){
                count = count + 2;
            }
        }
        return count;
    }
}
