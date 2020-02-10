import java.util.Set;

public class SolutionCompareTwoString {
    public String solution(String s, String t){
        int countDif = 0;
        int indexOfDifI = 0;
        if(t.length()-s.length()>=2){
            return "IMPOSSIBLE";
        }
        else
            if (t.length()-s.length()==1){
                if(s.equals(t.substring(0,t.length()-1)))
                return "ADD "+t.charAt(t.length()-1);
                else return "IMPOSSIBLE";
            }
            else
                for (int i = 0;i<s.length()-1;i++){
                    if (s.charAt(i)!=t.charAt(i)){
                        countDif++;
                        if (countDif==1){
                            indexOfDifI = i;
                        }
                    }
                }
                if(countDif == 1){
                    return "CHANGE "+ s.charAt(indexOfDifI)+" "+ t.charAt(indexOfDifI);
                }
                if(countDif>1){
                    return "MOVE "+ s.charAt(indexOfDifI);
                }
        return "IMPOSSIBLE";
    }
}
