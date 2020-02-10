public class SolutionCheckers {
    public int solution(String [] B){
        int count = 0;
        int countMax = 0;
        int indexOfO = 0;
        int rowHasO = 0;
        for(int i =0;i<B.length;i++){
            if (B[i].contains("O")){
                indexOfO = B[i].indexOf("O");
                rowHasO = i;
            }
        }
        for (int i = rowHasO-1;i>=0;i--){
            if(B[i].contains("X")){
                if(B[i].indexOf("X") == indexOfO-1){
                    if (B[i-1].contains("X")){
                        if(B[i-1].indexOf("X") != indexOfO -2){
                            count ++;
                            if(count > countMax)
                                countMax = count;

                            rowHasO = i;
                            B[i-2].replace('X','O');
                            continue;
                        }
                    }
                }
            }
            else
                return countMax;
        }
        return countMax;
    }
}
