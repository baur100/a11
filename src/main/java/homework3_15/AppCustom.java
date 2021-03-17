package homework3_15;

import java.util.ArrayList;
import java.util.List;

public class AppCustom {
    public static void main(String[] args) {
        List<Printer> printers=new ArrayList<>();
        printers.add(new Printer("Laser","HP","Black"));
        printers.add(new Printer("Photo","Canon","White"));
        System.out.println(printers.size());
        System.out.println(printers);
        printers.add(1,new Printer("Inkjet","Epson","Grey"));
        System.out.println(printers);
        printers.set(0,new Printer("LASER","Brother","Light-Black"));
        System.out.println(printers);
        printers.remove(2);
        System.out.println(printers);
        System.out.println(printers.get(1).getType());

        for(Printer v:printers){
            System.out.println(v);
        }
        for(int i=0;i<printers.size();i++){
            System.out.println(printers.get(i));
        }

    }
}
