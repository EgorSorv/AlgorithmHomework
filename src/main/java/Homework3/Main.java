package Homework3;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        for (int i = 0; i < 20; i++) {
            list.add(new Random().nextInt(20));
        }

        System.out.print("Исходный список => ");
        list.print();

        System.out.println();

        list.revert();
        System.out.print("Развернутый список => ");
        list.print();
    }
}

