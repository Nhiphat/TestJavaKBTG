import java.util.ArrayList;
import java.util.Map;

public class SolutionCalculateMemory {
    private String s;

    public SolutionCalculateMemory(String s) {
        this.s = s;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public String solution(String s){
        ArrayList<String> ss= new ArrayList<>();
        int musicSize = 0;
        int imageSize = 0;
        int movieSize = 0;
        int otherSize = 0;
        String[] lines = s.split("\\r?\\n");
        for(String line:lines){
            System.out.println(line);
            if(line.substring(line.lastIndexOf('.')+1,line.indexOf(" ")).equals("mp3")){
                musicSize = musicSize + Integer.parseInt(line.substring(line.indexOf(" ")+1, line.length()-1));
            }
            if(line.substring(line.lastIndexOf('.'),line.indexOf(" ")).equals(".jpg")){
                imageSize = imageSize + Integer.parseInt(line.substring(line.indexOf(" ")+1, line.length()-1));
            }
            if(line.substring(line.lastIndexOf('.'),line.indexOf(" ")).equals(".mp4")){
                movieSize = movieSize + Integer.parseInt(line.substring(line.indexOf(" ")+1, line.length()-1));
            }
            if(line.substring(line.lastIndexOf('.'),line.indexOf(" ")).equals(".7z")){
                otherSize = otherSize + Integer.parseInt(line.substring(line.indexOf(" ")+1, line.length()-1));
            }
        }
        return "music "+musicSize+"b"+"\n" +
                "images "+imageSize+"b"+"\n"+
                "movies "+movieSize+"b"+"\n"+
                "other "+otherSize+"b"+"\n";
    }
}
