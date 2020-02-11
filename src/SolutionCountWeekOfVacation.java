public class SolutionCountWeekOfVacation {
    public int solution(int Y, String A, String B, String W){
        int maxWeek = 0;
        int [] dayOfMonth = new int[] {31,28,31,30,31,30,31,31,30,31,30,31};
        if(isLeap(Y)){
            dayOfMonth[1] = 29;
        }

        return maxWeek;
    }
    private int findMonFirstMonth(String A, String W, int [] dayOfMonth){
        int day = 1;
        if(A.equals("January")){

        }
        if(A.equals("Febuary")){
            int dayOfFirstdayMonth = (addDay(W,(dayOfMonth[0])%7));
            int dayOfFirstMon = findNumDayToMon(dayOfFirstdayMonth) + 1;
        }
        if(A.equals("March")){
            int dayOfFirstdayMonth = (addDay(W,((dayOfMonth[0])+dayOfMonth[1])%7));
            int dayOfFirstMon = findNumDayToMon(dayOfFirstdayMonth) + 1;
        }
        if(A.equals("April")){
            int dayOfFirstdayMonth = (addDay(W,((dayOfMonth[0])+dayOfMonth[1]+dayOfMonth[2])%7));
            int dayOfFirstMon = findNumDayToMon(dayOfFirstdayMonth) + 1;
        }
        if(A.equals("May")){
            int dayOfFirstdayMonth = (addDay(W,((dayOfMonth[0])+dayOfMonth[1]+dayOfMonth[2]+dayOfMonth[3])%7));
            int dayOfFirstMon = findNumDayToMon(dayOfFirstdayMonth) + 1;
        }
        if(A.equals("June")){
            int dayOfFirstdayMonth = (addDay(W,((dayOfMonth[0])+dayOfMonth[1]+dayOfMonth[2]+dayOfMonth[3]+dayOfMonth[4])%7));
            int dayOfFirstMon = findNumDayToMon(dayOfFirstdayMonth) + 1;
        }
        if(A.equals("July")){
            int dayOfFirstdayMonth = (addDay(W,((dayOfMonth[0])+dayOfMonth[1]+dayOfMonth[2]+dayOfMonth[3]+dayOfMonth[4]+dayOfMonth[5])%7));
            int dayOfFirstMon = findNumDayToMon(dayOfFirstdayMonth) + 1;
        }
        if(A.equals("August")){
            int dayOfFirstdayMonth = (addDay(W,((dayOfMonth[0])+dayOfMonth[1]+dayOfMonth[2]+dayOfMonth[3]+dayOfMonth[4]+dayOfMonth[5]+dayOfMonth[6])%7));
            int dayOfFirstMon = findNumDayToMon(dayOfFirstdayMonth) + 1;
        }
        if(A.equals("September")){
            int dayOfFirstdayMonth = (addDay(W,((dayOfMonth[0])+dayOfMonth[1]+dayOfMonth[2]+dayOfMonth[3]+dayOfMonth[4]+dayOfMonth[5]
                    +dayOfMonth[6]+dayOfMonth[7])%7));
            int dayOfFirstMon = findNumDayToMon(dayOfFirstdayMonth) + 1;
        }
        if(A.equals("October")){
            int dayOfFirstdayMonth = (addDay(W,((dayOfMonth[0])+dayOfMonth[1]+dayOfMonth[2]+dayOfMonth[3]+dayOfMonth[4]+dayOfMonth[5]
                    +dayOfMonth[6]+dayOfMonth[7]+dayOfMonth[8])%7));
            int dayOfFirstMon = findNumDayToMon(dayOfFirstdayMonth) + 1;
        }
        if(A.equals("November")){
            int dayOfFirstdayMonth = (addDay(W,((dayOfMonth[0])+dayOfMonth[1]+dayOfMonth[2]+dayOfMonth[3]+dayOfMonth[4]+dayOfMonth[5]
                    +dayOfMonth[6]+dayOfMonth[7]+dayOfMonth[8]+dayOfMonth[9])%7));
            int dayOfFirstMon = findNumDayToMon(dayOfFirstdayMonth) + 1;
        }
        if(A.equals("November")){
            int dayOfFirstdayMonth = (addDay(W,((dayOfMonth[0])+dayOfMonth[1]+dayOfMonth[2]+dayOfMonth[3]+dayOfMonth[4]+dayOfMonth[5]
                    +dayOfMonth[6]+dayOfMonth[7]+dayOfMonth[8]+dayOfMonth[9]+dayOfMonth[10])%7));
            int dayOfFirstMon = findNumDayToMon(dayOfFirstdayMonth) + 1;
        }
    }
    private boolean isLeap(int Y){
        if (Y% 4== 0){
            return  true;
        }
        return false;
    }
    private int addDay(String oldDay,int numDay){
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
    private int findNumDayToMon(int currentDay){
        int numDay = 0;
        for(int i = 1; i <7;i++){
            numDay = currentDay+1;
            if(numDay>6)
                currentDay = 0;
            if(numDay == 1)
                return i;
        }
        return 0;
    }
}
