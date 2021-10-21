package ServicePackage;

import java.util.ArrayList;
import java.util.Iterator;

public class ServiceClass {

    ArrayList<Integer> list = new ArrayList<Integer>();
    int maxValue;

    public void function(ArrayList<Integer> arr, int size) {

        Iterator<Integer> itr = arr.iterator();
        while (itr.hasNext()) {
            int x = itr.next();
            list.add(x);
        }

        maxValue = maxElement(list);

        for (int i = 0; i < size; i++) {
            System.out.println("Day " + (i + 1) + " : ");
            if (arr.get(i) == maxValue) {
                System.out.print(maxValue + " ");
                process(maxValue - 1, list.indexOf(maxValue));
                System.out.println("");
                Object z = (Integer) maxValue;
                list.remove(z);
                if (list.size() != 0) {
                    maxValue = maxElement(list);
                }

            } else {
                System.out.println("");
            }
        }
    }

    public void process(int maxValue, int bound) {
        Iterator<Integer> itr = list.iterator();
        int count = 0;
        while (count <= bound) {
            int x = itr.next();
            if (x == maxValue) {
                System.out.print(maxValue + " ");
                process(maxValue - 1, bound);
                Object z = (Integer) x;
                list.remove(z);
                break;
            }
            count++;
        }
    }

    public int maxElement(ArrayList<Integer> arr) {
        Iterator<Integer> itr = arr.iterator();
        int x = 0;

        while (itr.hasNext()) {
            int y = itr.next();
            if (y > x) {
                x = y;
            }
        }
        return x;
    }

}
