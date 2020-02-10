import java.util.HashSet;
import java.util.Set;

public class SolutionCountPoint {
    public int solution(String [] T, String [] R){
        Set<Integer> groups = new HashSet<>();
        Set<Integer> pass = new HashSet<>();
        Set<Integer> fail = new HashSet<>();
        for(int i = 0;i<T.length;i++){
            int gr = Integer.parseInt(T[i].replaceAll("\\D+",""));
            groups.add(gr);
            if(R[i].equals("OK")){
                pass.add(gr);
            }
            else {
                fail.add(gr);
            }
        }
        for(Integer pas:pass){
            if (fail.contains(pas)){
                pass.remove(pas);
            }
        }
        int percent = pass.size()*100/groups.size();
        return percent;
    }
}
