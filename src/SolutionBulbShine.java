import java.util.ArrayList;
import java.util.List;

public class SolutionBulbShine {
    public int solution(int [] a){
        int count = 0;
        List<Bulb> bulbArrayList = new ArrayList<>();
        for (int i = 0; i <a.length;i++){
            bulbArrayList.add(new Bulb());
        }
        for (int i = 0;i<a.length;i++){
            boolean isAllOk = true;
            bulbArrayList.get(a[i]-1).isOn = true;
            if((a[i] == 1))
                bulbArrayList.get(0).isShine = true;
            for (int j = 0; j < a.length; j++){
                if(checkCanShine(a[j],bulbArrayList))
                    bulbArrayList.get(j).isShine = true;
            }

            for (int k = 0; k < a.length;k++){
                if(bulbArrayList.get(k).isOn && !bulbArrayList.get(k).isShine)
                    isAllOk = false;
            }
            if (isAllOk)
                count++;
        }
        return count;
    }
    private boolean checkCanShine(int a, List<Bulb> arrayList){
        boolean check = false;
        boolean allOnBefore = true;
        for (int i = 0; i< a; i ++){
            if(!arrayList.get(i).isOn){
                allOnBefore = false;
            }
        }
        if(allOnBefore)
            return true;
        return false;
    }
    class Bulb {
        private boolean isOn = false;
        private boolean isShine = false;
    }
}