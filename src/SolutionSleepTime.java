import java.time.LocalDateTime;
import java.util.*;

public class SolutionSleepTime {
    public int solution(String S){
        int maxTimeToSleep = 0;
        int timeToSleep = 0;
        ArrayList<String> scheduleLast = new ArrayList<>();
        ArrayList<String>[] Days = new ArrayList[7];
        for (int i =0; i<7;i++){
            Days[i] = new ArrayList<>();
        }
        String [] trim = S.split("\\r?\\n");
        for (String line:trim){
            if (line.substring(0,3).equals("Mon")){
                Days[0].add(line);
                Days[0] = arrange(Days[0]);
            }
            if(line.substring(0,3).equals("Tue")){
                Days[1].add(line);
                Days[1] = arrange(Days[1]);
            }
            if(line.substring(0,3).equals("Wed")){
                Days[2].add(line);
                Days[2] = arrange(Days[2]);
            }
            if(line.substring(0,3).equals("Thu")){
                Days[3].add(line);
                Days[3] = arrange(Days[3]);
            }
            if(line.substring(0,3).equals("Fri")){
                Days[4].add(line);
                Days[4] = arrange(Days[4]);
            }
            if(line.substring(0,3).equals("Sat")){
                Days[5].add(line);
                Days[5] = arrange(Days[5]);
            }
            if(line.substring(0,3).equals("Sun")){
                System.out.println(line.substring(0,3));
                Days[6].add(line);
                Days[6] = arrange(Days[6]);
            }
        }
        for (int i = 0;i<Days.length;i++){
            for (String line : Days[i]){
                scheduleLast.add(line);
            }
        }
        for (int i =0;i<scheduleLast.size();i++){
            if(i==0){
                maxTimeToSleep = Integer.parseInt(scheduleLast.get(i).substring(4,6))*60+ Integer.parseInt(scheduleLast.get(i).substring(7,9));
            }
            if(i== scheduleLast.size()-1){
                timeToSleep = (24 - (Integer.parseInt(scheduleLast.get(i).substring(10,12))))*60 - (Integer.parseInt(scheduleLast.get(i).substring(13,15)));
                if(timeToSleep > maxTimeToSleep)
                    maxTimeToSleep = timeToSleep;
                return maxTimeToSleep;
            }
            if(scheduleLast.get(i).substring(0,3).equals(scheduleLast.get(i+1).substring(0,3))){
                timeToSleep = (Integer.parseInt(scheduleLast.get(i+1).substring(4,6))-Integer.parseInt(scheduleLast.get(i).substring(10,12)))*60+(Integer.parseInt(scheduleLast.get(i+1).substring(7,9))-Integer.parseInt(scheduleLast.get(i).substring(13,15)));
                if(timeToSleep > maxTimeToSleep)
                    maxTimeToSleep = timeToSleep;
            }
            else {
                timeToSleep = (24 - (Integer.parseInt(scheduleLast.get(i).substring(10,12))))*60 - (Integer.parseInt(scheduleLast.get(i).substring(13,15)))+ Integer.parseInt(scheduleLast.get(i+1).substring(4,6))*60+ Integer.parseInt(scheduleLast.get(i+1).substring(7,9));
                if(timeToSleep > maxTimeToSleep)
                    maxTimeToSleep = timeToSleep;
            }
        }

        return maxTimeToSleep;
    }
    private ArrayList<String> arrange(ArrayList<String> a){
        if(a.size()>1){
            for (int i = 0; i< a.size() -1;i++){
                if (Integer.parseInt(a.get(i).substring(4,6))>Integer.parseInt(a.get(i+1).substring(4,6))){
                    Collections.swap(a,i,i+1);
                }
                if (Integer.parseInt(a.get(i).substring(4,6))==Integer.parseInt(a.get(i+1).substring(4,6))){
                    if(Integer.parseInt(a.get(i).substring(7,9))>Integer.parseInt(a.get(i+1).substring(7,9))){
                        Collections.swap(a,i,i+1);
                    }
                }
            }
        }
        return a;
    }
}
