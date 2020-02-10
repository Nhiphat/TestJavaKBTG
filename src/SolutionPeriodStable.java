public class SolutionPeriodStable {
    public int solution(int []A){
        int firstVelocity = A[1]-A[0];
        int periods = 0;
        for(int i = 0;i<A.length-1;i++){
            for(int j = i+1;j<A.length-1;j++){
                int velocity = A[j+1]-A[j];
                if(velocity == firstVelocity){
                    periods++;
                }
                else {
                    firstVelocity = velocity;
                    i = j-1;
                    break;
                }
            }
        }
        return periods;
    }
}
