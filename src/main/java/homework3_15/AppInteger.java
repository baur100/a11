package homework3_15;

import java.util.ArrayList;
import java.util.List;

public class AppInteger {
    public static void main(String[] args) {
        List<Integer> temperature=new ArrayList<>();
        temperature.add(50);
        temperature.add(58);
        temperature.add(62);
        temperature.add(72);
        temperature.add(-2);
        System.out.println(temperature);
        temperature.set(3,-5);
        System.out.println(temperature);
        temperature.remove(1);
        System.out.println(temperature);
        System.out.println(temperature.get(3));
        Integer removedElement= temperature.set(1,15);
        System.out.println(temperature);
        System.out.println(removedElement);

        for(int t:temperature){
            System.out.println(t);
        }
        for (int i=0;i<temperature.size();i++){
            System.out.println(temperature.get(i));
        }
    }
    }
