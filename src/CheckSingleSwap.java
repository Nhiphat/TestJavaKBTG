public class CheckSingleSwap {
    public boolean solution(int[] A){
        for (int i = 0;i<A.length -1 ;i++){
            for (int j =i+1;j< A.length;j++){
                if (A[j]<A[i]){
                    int temp = A[j];
                    A[j] = A[i];
                    A[i] = temp;
                    if (checkIncrease(A)){
                        return true;
                    }
                    reverse(A,i,j);
                }
            }
        }
        return false;
    }

    private boolean checkIncrease(int[] A){
        for (int i =0; i< A.length-1;i++){
            if (A[i]> A[i+1])
                return false;
        }
        return true;
    }
    private void reverse(int []A, int i, int j){
        int temp = A[j];
        A[j] = A[i];
        A[i] = temp;
    }
}
