import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class KhoaDiverse {
    static class Element {
        public int count = 0;
        public String c;
        public int total;

        public Element(int total, String c) {
            this.total = total;
            this.c = c;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public String getC() {
            return c;
        }

        public void setC(String c) {
            this.c = c;
        }

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }
    }

    static class Solution {
        public String solution(int a, int b, int c) {
            List<Element> elements = new ArrayList<>();

            elements.add(new Element(a, "a"));
            elements.add(new Element(b, "b"));
            elements.add(new Element(c, "c"));

            elements.sort((o1, o2) -> o2.getTotal() - o1.getTotal());

            int total = a + b + c;

            StringBuilder builder = new StringBuilder();

            for (int i = 0; i < total; i++) {
                Element elOne = elements.get(0);
                Element elTwo = elements.get(1);
                Element elThree = elements.get(2);

                if (elOne.getCount() < 2 && elOne.getTotal() > 0) {
                    builder.append(elOne.getC());
                    elOne.setCount(elOne.getCount() + 1);
                    elOne.setTotal(elOne.getTotal() - 1);
                    elTwo.setCount(0);
                    elThree.setCount(0);
                } else if (elTwo.getCount() < 2 && elTwo.getTotal() > 0) {
                    builder.append(elTwo.getC());
                    elTwo.setCount(elTwo.getCount() + 1);
                    elTwo.setTotal(elTwo.getTotal() - 1);
                    elOne.setCount(0);
                    elThree.setCount(0);
                } else if (elThree.getCount() < 2 && elThree.getTotal() > 0) {
                    builder.append(elThree.getC());
                    elThree.setCount(elThree.getCount() + 1);
                    elThree.setTotal(elThree.getTotal() - 1);
                    elOne.setCount(0);
                    elTwo.setCount(0);
                } else {
                    break;
                }
            }

            return builder.toString();
        }
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        String result = solution.solution(0, 1, 8);
        System.out.println(result);
    }
}
