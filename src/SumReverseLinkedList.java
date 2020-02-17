import java.util.LinkedList;

public class SumReverseLinkedList {
    public LinkedList<Integer> solution(LinkedList<Integer> A, LinkedList<Integer> B){
        LinkedList<Integer> Sum = new LinkedList<>();
        double a = 0;
        double b = 0;
        for (int i = A.size() - 1; i>=0; i --){
            System.out.println(A.get(i));
            a = a + A.get(i)*Math.pow(10,i);
        }
        for (int i = B.size() - 1; i>=0; i --){
            b = b + B.get(i)*Math.pow(10,i);
        }

        double sum = a+b;


        return A;
    }
}
