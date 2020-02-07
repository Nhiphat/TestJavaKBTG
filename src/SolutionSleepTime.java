import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.TreeSet;

public class SolutionSleepTime {
    private TreeSet<Calendar> dateTimes = new TreeSet<>();

    public TreeSet<Calendar> getDateTimes() {
        return dateTimes;
    }

    public void setDateTimes(TreeSet<Calendar> dateTimes) {
        this.dateTimes = dateTimes;
    }
}
