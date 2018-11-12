package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

public class EnumDemo {

    public static void main(String args[]){

        List portfolios = new ArrayList();

        Portfolio pf1 = new Portfolio(1);
        Portfolio pf2 = new Portfolio(2);
        Portfolio pf3 = new Portfolio(3);
        Portfolio pf4 = new Portfolio(4);
        Portfolio pf5 = new Portfolio(5);

        portfolios.add(pf1);
        portfolios.add(pf2);
        portfolios.add(pf3);
        portfolios.add(pf4);
        portfolios.add(pf5);

        Enumeration enumpf = Collections.enumeration(portfolios);

        while (enumpf.hasMoreElements()){
            Portfolio currentpf = (Portfolio) enumpf.nextElement();
            System.out.println(currentpf.getClass());

        }
    }
}
