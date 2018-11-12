package collections;

import java.util.Set;

public class HashSet {

    public static void main(String args[]){

        Set myHashSet = new java.util.HashSet();

        System.out.println(myHashSet.add("Mary"));
        System.out.println(myHashSet.add("Mary"));
        System.out.println(myHashSet.size());

    }
}
