import java.util.Set;
import java.util.TreeSet;

public class SolutionCountInteresting {
    public int solution(String S, String T){
        int count = 0;
        if(checkInterest(S))
            count++;
        do {
            if (checkInterest(addSec(S)))
                count++;
            S = addSec(S);
            System.out.println(S);
        }while (!(S.equals(T)));
        return count;
    }

        private boolean checkInterest(String t){
            Set<Integer> set = new TreeSet<>();
            for (int i = 0; i<t.length();i++){
                if(i!=2 && i!=5){
                    set.add(Integer.parseInt(String.valueOf(t.charAt(i))));
                }
            }
            if(set.size() > 2)
                return false;
            return true;
        }

        private String addSec(String t){
            String newSecond = String.valueOf(Integer.parseInt(t.substring(6))+1);
            if(Integer.parseInt(t.substring(6))+1 <10){
                newSecond ="0"+newSecond;
            }
            String newTime = t.substring(0,6).concat(newSecond);
            if(Integer.parseInt(newTime.substring(6)) > 59){
                String tNotss = newTime.substring(0,6);
                newTime = tNotss.concat("00");
                String mm = String.valueOf(Integer.parseInt(newTime.substring(3,5))+1);
                if(Integer.parseInt(mm) < 10)
                    mm = "0"+mm;
                newTime = newTime.substring(0,3).concat(mm).concat(":00");
            }
            if(Integer.parseInt(newTime.substring(3,5)) > 59){
                String tNewmm = "00";
                String tNewhh = String.valueOf(Integer.parseInt(newTime.substring(0,2))+1);
                if(Integer.parseInt(tNewhh) < 10)
                    tNewhh = "0"+tNewhh;
                newTime = tNewhh.concat(":00:00");
            }
            return newTime;
        }
}
