public class Solution {

    public StringBuilder solution(String s){
        Integer numDash = 0;
        if(standalize(s).length()%3 != 0){
            numDash = standalize(s).length()/3;
        }
        else {
            numDash = standalize(s).length()/3 -1;
        }
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder finalString = new StringBuilder();
        stringBuilder.append(standalize(s));
        StringBuilder [] threeChar = new StringBuilder[numDash];
        for (int i =0;i <threeChar.length;i++){
            threeChar[i] = new StringBuilder();
        }
        for (int i = 0;i<numDash;i++){
            if(stringBuilder.toString().length() == 4){
                threeChar[i] = threeChar[i].append(stringBuilder.substring(0,2));
                stringBuilder = stringBuilder.delete(0,2);
                break;
            }
            if(stringBuilder.toString().length() == 5){
                threeChar[i] = threeChar[i].append(stringBuilder.substring(0,3));
                stringBuilder.delete(0,3);
                break;
            }
            threeChar[i] = threeChar[i].append(stringBuilder.substring(0,3));
            stringBuilder = stringBuilder.delete(0,3);
        }
        for (int i = 0;i<threeChar.length;i++){
            System.out.println(threeChar[threeChar.length-1]);
            threeChar[i] = insertDash(threeChar[i]);

        }
        for(int i = 0;i<threeChar.length;i++){
            if(i==threeChar.length-1){
                finalString = finalString.append(threeChar[i]);
                finalString = finalString.append(stringBuilder);
            }
            else {
                finalString = finalString.append(threeChar[i]);
            }
        }
        return finalString;

    }
    private StringBuilder insertDash(StringBuilder stringBuilder){
        stringBuilder.append("-");
        return stringBuilder;
    }
    private String standalize(String s){
        s = s.replaceAll(" ","");
        s = s.replaceAll("-","");
        return s;
    }
}