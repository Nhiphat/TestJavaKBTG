public class SolutionCountPair {
    public int solution(int [][] A){
        int count = 0;
        for (int i =0; i<A.length;i++){
            for (int j =0;j<A[i].length;j++){
                if (checkPair(i,j,A) == true)
                    count++;
            }
        }
        return count;
    }
    private boolean checkPair(int p,int q,int [][] A){
        boolean checkAboveBelow = false;
        boolean checkLeftRight = false;
        int sumAbove = 0;
        int sumBelow = 0;
        int sumLeft = 0;
        int sumRight = 0;
        if(p ==0 ){
            sumAbove = 0;
        }
        else {
            for (int i = p-1;i>=0;i--){
                for (int j =0;j<A[i].length;j++){
                    sumAbove = sumAbove+A[i][j];
                }
            }
        }
        if(p == A.length-1){
            sumBelow = 0;
        }
        else {
            for(int i = p+1; i <A.length;i++){
                for (int j = 0;j<A[0].length;j++){
                    sumBelow = sumBelow + A[i][j];
                }
            }
        }
        if(q == 0){
            sumLeft = 0;
        }
        else {
            for (int i = q-1;i>=0;i--){
                for (int j = 0;j<A.length;j++){
                    sumLeft = sumLeft + A[j][i];
                }
            }
        }
        if(q == A[0].length-1){
            sumRight = 0;
        }
        else {
            for(int i = q +1; i <A[0].length;i++){
                for (int j = 0; j<A.length;j++){
                    sumRight = sumRight + A[j][i];
                }
            }
        }

        if(sumAbove == sumBelow)
            checkAboveBelow = true;
        if(sumLeft == sumRight)
            checkLeftRight = true;
        if(checkAboveBelow && checkLeftRight)
            return true;
        return false;
    }
}
