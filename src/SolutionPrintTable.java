public class SolutionPrintTable {
    public void solution (int []A, int K){
        int numRow = A.length/K == 0 ? A.length/K : A.length/K+1;
        int [][] chidA = new int[numRow][];
        int increase = 0;
        int maxLength = 0;
        for (int i =0;i<numRow;i++){
            if(i == numRow-1 && A.length/K != 0){
                chidA[i] = new int[A.length%K];
            }
            else {
                chidA[i] = new int[K];
            }
        }
        for (int i =0;i< A.length;i++){
            if(String.valueOf(A[i]).length() > maxLength)
                maxLength = String.valueOf(A[i]).length();
        }

        for (int i =0;i<numRow;i++){
            for (int j = 0;j<chidA[i].length;j++){
                chidA[i][j] = A[increase];
                increase ++;
                System.out.println(chidA[i][j]);
            }
        }
        for (int k = 0; k<chidA.length;k++){
            printTable(chidA[k].length,k,chidA, maxLength);
        }
    }
    private void printTable(int size, int row, int[][] matrix, int maxLength) {

        if (row == matrix.length - 1) {

            for (int i = 0; i < (maxLength + 1) * matrix[row - 1].length; i++) {
                if (i % (maxLength + 1) == 0)
                    System.out.print("+");
                else
                    System.out.print("-");
            }
            System.out.println("+");

            for (int i = 0; i < matrix[row].length; i++) {
                System.out.printf("|%" + maxLength + "d", matrix[row][i]);
            }
            System.out.println("|");
            for (int i = 0; i < (maxLength + 1) * size; i++) {
                if (i % (maxLength + 1) == 0)
                    System.out.print("+");
                else
                    System.out.print("-");
            }
            System.out.println("+");

        } else {
            for (int i = 0; i < (maxLength + 1) * size; i++) {
                if (i % (maxLength + 1) == 0) {
                    System.out.print("+");
                } else
                    System.out.print("-");
            }
            System.out.println("+");

            for(int i = 0;i < matrix[row].length;i++){
                System.out.printf("|%"+maxLength+"d",matrix[row][i]);
            }
            System.out.println("|");

            }
        }

    }

