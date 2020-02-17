import java.util.ArrayList;
import java.util.TreeSet;

public class SolutionSoliderReport {
    public int solution (int [] ranks){
        int count = 0;
        TreeSet<Integer> setInt = new TreeSet<>();
        for (int i = 0; i <ranks.length;i++ ){
            setInt.add(ranks[i]);
        }
        ArrayList<Integer> listInt = new ArrayList<>();
        for (Integer integer:setInt){
            listInt.add(integer);
        }
        for (int i =0;i<listInt.size();i++){
            if(listInt.get(i) +1 == listInt.get(i+1)){
                count += countNumOfInt(listInt.get(i),ranks);
            }
        }
        return count;
    }
    private int countNumOfInt(Integer q, int [] A){
        int count =0;
        for (int i =0;i<A.length;i++){
            if(A[i] == q)
                count++;
        }
        return count;
    }
}
