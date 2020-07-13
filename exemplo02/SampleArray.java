package exemplo02;

import java.util.ArrayList;

public class SampleArray {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();

        lista.add(12);
        lista.add(7);
        lista.add(35);
        lista.add(198);

        lista.remove((Integer)35);
        lista.remove(1);

        System.out.println(lista);


    }
}