public class Solution {

    private String s;

    public Solution(String s) {
        this.s = s;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public StringBuilder solution(String s){
        Integer size = 5;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(s);
        for (int i = 1;i<=size;i++){
            if (i ==1){
                stringBuilder = insertDash(stringBuilder,3);
            }
            else
                if (i>=3) stringBuilder = insertDash(stringBuilder,3*i+i-1);
                else stringBuilder = insertDash(stringBuilder,3*i+1);

        }
        return stringBuilder;
    }
    private StringBuilder insertDash(StringBuilder stringBuilder, int quotient){
        stringBuilder.insert(quotient,"-");
        return stringBuilder;
    }
}