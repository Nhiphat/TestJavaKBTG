import java.util.ArrayList;
import java.util.List;

public class SolutionCountDiverse {
    public String solution(int A, int B, int C){
        String s = "";
        for (int i = 0; i < A; i++, s += 'a');
        for (int i = 0; i < B; i++, s += 'b');
        for (int i = 0; i < C; i++, s += 'c');
        String answer = "";
        List<String> stringPermutations = permutations(s);
        int i = 0;
        do{
            String diverseString = longestDiverseSubstr(stringPermutations.get(i));
            if(diverseString.length() > answer.length())
                answer = diverseString;
            i++;
        }while (i< stringPermutations.size());
        return answer;
    }
    private String longestDiverseSubstr(String s) {
        //baaabbabbb
        String resMax = "";
        String res = "";
        int hook = 0;
        for(int i =1;i<s.length()-1;i++){

            if(s.charAt(i-1) != s.charAt(i) || s.charAt(i) != s.charAt(i+1)){
                hook++;
                res = s.substring(i-hook,i+2);
                if(res.length()>resMax.length()){
                    resMax = res;
                }
            }
            else
                hook = 0;
        }
        return resMax;
    }

    private List<String> permutations(String s) {
        List<String>listPermutation=new ArrayList<>();
        if(s.length()==1){
            listPermutation.add(s);
        }
        else{
            for(int i=0;i<s.length();i++){
                List<String> temp = permutations(s.substring(0, i)+s.substring(i+1));
                for (String string : temp) {
                    listPermutation.add(s.charAt(i)+string);
                }
            }
        }
        return listPermutation;
    }
}
