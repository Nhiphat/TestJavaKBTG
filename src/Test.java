import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class Test {
    public static void main(String[] args) {
//        Solution solution = new Solution("0000000000000000");
//        solution.solution(solution.getS());


//        SolutionTreesOrder solutionTreesOrder = new SolutionTreesOrder();
//        solutionTreesOrder.setA(new int[] {1,3,2,5});
//        solutionTreesOrder.solution(solutionTreesOrder.getA());

        SolutionCalculateMemory solutionCalculateMemory = new SolutionCalculateMemory("my.song.mp3 11b"+"\n"+"myimage.jpg 22b"+"\n"+"myvideo 33b");
        String res = solutionCalculateMemory.solution("my.song.mp3 11b"+"\n"+"my.song2.mp3 11b"+"\n"+"myimage.jpg 22b"+"\n"+"myvideo.mp4 33b");
        System.out.println(res);

    }
}
