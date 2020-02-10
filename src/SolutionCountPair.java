public class SolutionCountPair {
    public int solution(int [][] A){
        for (int i =0; i<A.length;i++){
            for (int j =i;j<A[0].length;j++){

            }
        }
    }
    private boolean checkPair(int p,int q,int [][] A){
        boolean checkAbove = false;
        boolean checkBelow = false;
        boolean checkLeft = false;
        boolean checkRight = false;
        int sumAbove = 0;
        int sumBelow = 0;
        int sumLeft = 0;
        int sumRight = 0;
        if(p ==0 || p == A.length-1 ){
            sumAbove = 0;
        }
        else {
            for(int i = p+1; i <A.length;i++){
                for (int j = i;j<A[0].length;j++){
                    sumBelow = sumBelow + A[i][j];
                }
            }
        }
        if(sumAbove == sumBelow)
            checkAbove = true;
        if(q ==0 || q ==A.length-1){
            sumLeft = 0;
        }
    }
}
