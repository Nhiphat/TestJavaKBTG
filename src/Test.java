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

//        SolutionCalculateMemory solutionCalculateMemory = new SolutionCalculateMemory("my.song.mp3 11b"+"\n"+"myimage.jpg 22b"+"\n"+"myvideo 33b");
//        String res = solutionCalculateMemory.solution("my.song.mp3 11b"+"\n"+"my.song2.mp3 11b"+"\n"+"myimage.jpg 22b"+"\n"+"myvideo.mp4 33b");
//        System.out.println(res);

//        SolutionCountWord solutionCountWord = new SolutionCountWord();
//        int sum = solutionCountWord.solution("i like clouds. i hate rocks. i hate question s s s s? i hate!");
//        System.out.println(sum+"      No word of Sentence");

//        CheckSingleSwap checkSingleSwap = new CheckSingleSwap();
//        boolean chẹck = checkSingleSwap.solution(new int[]{1,5,3,3,7});
//        boolean chẹck2 = checkSingleSwap.solution(new int[]{1,3,5,3,4});
//        System.out.println(chẹck+"   check");
//        System.out.println(chẹck2+"   check2");

//        SolutionCompareTwoString solutionCompareTwoString = new SolutionCompareTwoString();
//        System.out.println(solutionCompareTwoString.solution("nice", "nicer"));

//        SolutionBulbShine solutionBulbShine = new SolutionBulbShine();
//        System.out.println(solutionBulbShine.solution(new int[]{2,1,3,5,4}));
//        System.out.println(solutionBulbShine.solution(new int[]{2,3,4,1,5}));

        SolutionPeriodStable solutionPeriodStable = new SolutionPeriodStable();
        System.out.println(solutionPeriodStable.solution(new int[] {-1,1,3,3,3,2,3,2,1,0}));
    }
}
