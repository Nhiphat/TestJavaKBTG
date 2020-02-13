public class SolutionPrintTable {
    public void solution (int []A, int K){
        int numRow = A.length/K == 0 ? A.length/K : A.length/K+1;
        int [][] chidA = new int[numRow][];
        for (int i =0;i<numRow;i++){
            if(i == numRow-1 && A.length/K != 0){
                chidA[i] = new int[A.length%K];
            }
            else {
                chidA[i] = new int[K];
            }
        }
        int increase = 0;
        for (int i =0;i<numRow;i++){
            for (int j = 0;j<chidA[i].length;j++){
                chidA[i][j] = A[increase];
                increase ++;
                System.out.println(chidA[i][j]);
            }
        }
//        for(int i = 0;i <  7 * size ;i++){
//            System.out.print("-");
//        }
//        System.out.println("-");
//
//        for(int i = 1;i <= matrix[row].length;i++){
//            System.out.printf("| %4d ",matrix[row][i - 1]);
//        }
//        System.out.println("|");
//
//
//        if(row == size -  1){
//
//            // when we reach the last row,
//            // print bottom line "---------"
//
//            for(int i = 0;i <  7 * size ;i++){
//                System.out.print("-");
//            }
//            System.out.println("-");
//
//        }
    }
}
