package exemploTeste;

import java.util.TreeSet;

public class Teste {
    public static void main(String[] args) {
        TreeSet<Integer> numContasGeral = new TreeSet<>();
        int numAleatorio;
        boolean validacaoNum;

        do{
            numAleatorio=100 + (int) (Math.random() * 999);
            validacaoNum=numContasGeral.add(numAleatorio);
        }while(validacaoNum!=true);
        
        System.out.println(numAleatorio);
        for (Integer i : numContasGeral) {
            System.out.println(i);
        }
    }
}