
public class SolutionCountWeekOfVacation {
    public int solution(int Y, String A, String B, String W){
        int maxDayOfVacation = 0;
        int maxWeek = 0;
        int [] dayOfMonth = new int[] {31,28,31,30,31,30,31,31,30,31,30,31};
        if(isLeap(Y)){
            dayOfMonth[1] = 29;
        }
        int[] firstMonAndIndex = findMonFirstMonth(A,W,dayOfMonth);
        int[] lastSunAndIndex = findSunLastMonth(B,W,dayOfMonth);
        int firstMon = firstMonAndIndex[1];
        int lastSun = lastSunAndIndex[1];
        int aIndex = firstMonAndIndex[0];
        int bIndex = lastSunAndIndex[0];
        for(int i = aIndex;i<= bIndex;i++){
            if(i == aIndex) {
                maxDayOfVacation = maxDayOfVacation + dayOfMonth[i] - firstMon + 1;
            }
            if(i == bIndex){
                maxDayOfVacation = maxDayOfVacation + lastSun;
            }
            if(i!= aIndex && i!= bIndex) {
                maxDayOfVacation = maxDayOfVacation + dayOfMonth[i];
            }
        }
        return maxDayOfVacation/7;
    }
    private int[] findMonFirstMonth(String A, String W, int [] dayOfMonth){//tìm t
        int [] dayAndindex = new int[2];
        int dayOfFirstMon = 1;
        if(A.equals("January")){
            dayAndindex[0] = 0;
            dayAndindex[1] = 0;
        }
        if(A.equals("Febuary")){
            int dayOfFirstdayMonth = (addDay(W,(dayOfMonth[0])%7));
            dayOfFirstMon = findNumDayToMon(dayOfFirstdayMonth) + 1;
            dayAndindex[0] = 1;
            dayAndindex[1] = dayOfFirstMon;
        }
        if(A.equals("March")){
            int dayOfFirstdayMonth = (addDay(W,((dayOfMonth[0])+dayOfMonth[1])%7));
            dayOfFirstMon = findNumDayToMon(dayOfFirstdayMonth) + 1;
            dayAndindex[0] = 2;
            dayAndindex[1] = dayOfFirstMon;
        }
        if(A.equals("April")){
            int dayOfFirstdayMonth = (addDay(W,((dayOfMonth[0])+dayOfMonth[1]+dayOfMonth[2])%7));// thứ
            dayOfFirstMon = findNumDayToMon(dayOfFirstdayMonth) + 1;
            dayAndindex[0] = 3;
            dayAndindex[1] = dayOfFirstMon;
        }
        if(A.equals("May")){
            int dayOfFirstdayMonth = (addDay(W,((dayOfMonth[0])+dayOfMonth[1]+dayOfMonth[2]+dayOfMonth[3])%7));
            dayOfFirstMon = findNumDayToMon(dayOfFirstdayMonth) + 1;
            dayAndindex[0] = 4;
            dayAndindex[1] = dayOfFirstMon;
        }
        if(A.equals("June")){
            int dayOfFirstdayMonth = (addDay(W,((dayOfMonth[0])+dayOfMonth[1]+dayOfMonth[2]+dayOfMonth[3]+dayOfMonth[4])%7));
            dayOfFirstMon = findNumDayToMon(dayOfFirstdayMonth) + 1;
            dayAndindex[0] = 5;
            dayAndindex[1] = dayOfFirstMon;
        }
        if(A.equals("July")){
            int dayOfFirstdayMonth = (addDay(W,((dayOfMonth[0])+dayOfMonth[1]+dayOfMonth[2]+dayOfMonth[3]+dayOfMonth[4]+dayOfMonth[5])%7));
            dayOfFirstMon = findNumDayToMon(dayOfFirstdayMonth) + 1;
            dayAndindex[0] = 6;
            dayAndindex[1] = dayOfFirstMon;
        }
        if(A.equals("August")){
            int dayOfFirstdayMonth = (addDay(W,((dayOfMonth[0])+dayOfMonth[1]+dayOfMonth[2]+dayOfMonth[3]+dayOfMonth[4]+dayOfMonth[5]+dayOfMonth[6])%7));
            dayOfFirstMon = findNumDayToMon(dayOfFirstdayMonth) + 1;
            dayAndindex[0] = 7;
            dayAndindex[1] = dayOfFirstMon;
        }
        if(A.equals("September")){
            int dayOfFirstdayMonth = (addDay(W,((dayOfMonth[0])+dayOfMonth[1]+dayOfMonth[2]+dayOfMonth[3]+dayOfMonth[4]+dayOfMonth[5]
                    +dayOfMonth[6]+dayOfMonth[7])%7));
            dayOfFirstMon = findNumDayToMon(dayOfFirstdayMonth) + 1;
            dayAndindex[0] = 8;
            dayAndindex[1] = dayOfFirstMon;
        }
        if(A.equals("October")){
            int dayOfFirstdayMonth = (addDay(W,((dayOfMonth[0])+dayOfMonth[1]+dayOfMonth[2]+dayOfMonth[3]+dayOfMonth[4]+dayOfMonth[5]
                    +dayOfMonth[6]+dayOfMonth[7]+dayOfMonth[8])%7));
            dayOfFirstMon = findNumDayToMon(dayOfFirstdayMonth) + 1;
            dayAndindex[0] = 9;
            dayAndindex[1] = dayOfFirstMon;
        }
        if(A.equals("November")){
            int dayOfFirstdayMonth = (addDay(W,((dayOfMonth[0])+dayOfMonth[1]+dayOfMonth[2]+dayOfMonth[3]+dayOfMonth[4]+dayOfMonth[5]
                    +dayOfMonth[6]+dayOfMonth[7]+dayOfMonth[8]+dayOfMonth[9])%7));
            dayOfFirstMon = findNumDayToMon(dayOfFirstdayMonth) + 1;
            dayAndindex[0] = 10;
            dayAndindex[1] = dayOfFirstMon;
        }
        if(A.equals("December")){
            int dayOfFirstdayMonth = (addDay(W,((dayOfMonth[0])+dayOfMonth[1]+dayOfMonth[2]+dayOfMonth[3]+dayOfMonth[4]+dayOfMonth[5]
                    +dayOfMonth[6]+dayOfMonth[7]+dayOfMonth[8]+dayOfMonth[9]+dayOfMonth[10])%7));
            dayOfFirstMon = findNumDayToMon(dayOfFirstdayMonth) + 1;
            dayAndindex[0] = 11;
            dayAndindex[1] = dayOfFirstMon;
        }
        return dayAndindex;
    }
    private int[] findSunLastMonth(String A, String W, int [] dayOfMonth){//tìm ngày chủ nhật cuối cùng của tháng nhập vào
        int [] dayAndindex = new int[2];
        int dayOfLastSun;
        int firstMonOfMonth = findMonFirstMonth(A,W,dayOfMonth)[1];
        dayAndindex[0] = findMonFirstMonth(A,W,dayOfMonth)[0];
        if(firstMonOfMonth <= 4)
            dayOfLastSun = firstMonOfMonth + 27;
        else
            dayOfLastSun = firstMonOfMonth + 20;
        dayAndindex[1] = dayOfLastSun;
        return dayAndindex;
    }

    private boolean isLeap(int Y){
        if (Y% 4== 0){
            return  true;
        }
        return false;
    }
    private int addDay(String oldDay,int numDay){// tìm thứ của ngày đầu tiên tháng nhập vào
        if(oldDay.equals("Monday"))
            oldDay ="1";
        if(oldDay.equals("TuesDay"))
            oldDay ="2";
        if(oldDay.equals("Wednesday"))
            oldDay = "3";
        if(oldDay.equals("Thursday"))
            oldDay = "4";
        if(oldDay.equals("Friday"))
            oldDay = "5";
        if(oldDay.equals("Saturday"))
            oldDay = "6";
        if(oldDay.equals("Sunday"))
            oldDay = "0";
        int newDay = Integer.parseInt(oldDay)+numDay;
        if(newDay>=7)
            newDay = newDay - 7;
        return newDay;
    }
    private int findNumDayToMon(int currentDay){// tìm số ngày cộng vào sẽ được thứ 2 đầu tiên của tháng nhập vào.
        int numDay;
        for(int i = 1; i <7;i++){
            numDay = currentDay+1;
            currentDay = currentDay +1;
            if(numDay>6)
                currentDay = 0;
            if(numDay == 1)
                return i;
        }
        return 0;
    }
}
