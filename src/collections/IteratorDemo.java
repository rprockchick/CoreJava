package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String args[]){
        ArrayList alist = new ArrayList();
        Portfolio pf1 = new Portfolio(1);
        Portfolio pf2 = new Portfolio(200);
        Portfolio pf3 = new Portfolio(3);
        Portfolio pf4 = new Portfolio(400);
        Portfolio pf5 = new Portfolio(5);

        alist.add(pf1);
        alist.add(pf2);
        alist.add(pf3);
        alist.add(pf4);
        alist.add(pf5);

        System.out.println("Size of Alist before remove "+alist.size());

        Iterator ipf = alist.iterator();


        while (ipf.hasNext()){
            Portfolio currentpf = (Portfolio) ipf.next();
            System.out.println(currentpf.getId());

            if(currentpf.getId() == 200){
                ipf.remove();
            }

        }

        System.out.println("Size of Alist after remove "+alist.size());








    }
}
