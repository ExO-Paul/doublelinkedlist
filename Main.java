package sokolchik.pavel.doublelinkedlist;

import java.awt.geom.Line2D;

public class Main {

    public static void main(String[] args) {

        List<Integer> list = new List<Integer>();
        for (int i = 0; i < 7; i++) {
            list.add(i);
        }

        for (int i = 0; i < 7; i++) {
            System.out.println(list.get(i));
        }
        System.out.println(list.get(2));
        System.out.println();
        list.print();
        System.out.println();
        list.printReverse();
    }


}
