import java.util.ArrayList;

public class SolutionTreesOrder {
    private int [] A;

    public int[] getA() {
        return A;
    }

    public void setA(int[] a) {
        A = a;
    }

    public int solution (int [] a){
        ArrayList<Integer> found = new ArrayList<>();
        int count =0;
        getNewArray(a,3);
        for (int i =0;i<a.length;i++){
            if (isOrder(getNewArray(a,i))){
                found.add(i);
            }
        }
        return found.size();
    }

    private boolean isOrder(int [] a){
        for (int i =0;i<a.length-1;i++){
            if (a[i] > a[i+1])
                return false;
        }
        return true;
    }

    private int [] getNewArray(int [] a, int j){
        int [] res =new int[a.length-1];
        int k =0;
        boolean isIncreaseK = false;
        for(int i = 0;i<res.length;i++){
            k=i;
            if (isIncreaseK){
                k++;
            }
            if (i != j){
                res[i] = a[k];
            }
            else {
                j=-1;
                k = i+1;
                res[i] = a[k];
                isIncreaseK = true;
            }
        }
        return res;
    }
}
