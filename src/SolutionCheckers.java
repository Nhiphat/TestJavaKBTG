public class SolutionCheckers {
    public int solution(String [] B){
        int countMax;
        int [] pointO = findPointOfO(B);
        int i = pointO[0];
        int j = pointO[1];
        countMax = countPawn(B, i,j);
        return countMax;
    }
    private int countPawn(String [] B,int i, int j){
        if(!checkCanGo(B,i,j))
            return 0;
        else {
            if(!(checkCanGo(B,i-2,j-2)||checkCanGo(B,i-2,i+2))) {
                return 1;
            }
            return countPawn(B,i-2,j-2) + countPawn(B,i-2,i+2);
        }
    }
    private int[] findPointOfO(String []B){
        int [] point = new int[2];
        for(int i =0;i<B.length;i++){
            if (B[i].contains("O")){
                point[1] = B[i].indexOf("O");
                point[0] = i;
            }
        }
        return point;
    }
    private boolean checkCanGo(String [] B, int i, int j){
//        int [] pointO = findPointOfO(B);
//        int i = pointO[0];
//        int j = pointO[1];
        if(i<2){
            return false;
        }
        if(j <2){
            if(B[i-1].charAt(j+1) == '.' && B[i-2].charAt(j+2) =='X')
                return true;
            return false;
        }
        if(j > B[i].length()-2){
            if(B[i-1].charAt(j-1) == 'X' && B[i-2].charAt(j-2) == 'X'){
                return true;
            }
            return false;
        }
        if((B[i-1].charAt(j+1) == '.' && B[i-2].charAt(j+2) =='X') ||(B[i-1].charAt(j-1) == 'X' && B[i-2].charAt(j-2) == 'X'))
            return true;
        return false;
    }
}
