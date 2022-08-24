package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> numDigitado = new ArrayList<>();


        System.out.println("##############################");
        System.out.println("Bem Vindo ao sorteio do SENAI!");
        System.out.println("##############################");
        System.out.println("Boa sorte");

        System.out.println("1 2 3 4" + "\n" + "5 6 7 8" + "\n" + "9 10 11 12 " + "\n" + "13 14 15 16" + "\n" + "17 18 19 20");
        System.out.println("---------------------------------------------------------------");


        Set<Integer> numeros = new HashSet<>();
        Random random = new Random();
        for (int i = 0; i < 15; i++) {
            int n = random.nextInt(20);
            numeros.add(n);
        }
        Integer[] resultado = numeros.toArray(new Integer[numeros.size()]);

        for (int i = 0; i < 13; i++) {
            System.out.println("Digite o " + (i+1) + "° Número de 1 a 20");
            Scanner nmD = new Scanner(System.in);
            numDigitado.add(nmD.nextInt());


        }if (numDigitado.equals(resultado)){
            System.out.println("Você ganhou ");
            System.out.println("Escolha seu premio" + "/n" + "1 - Um beijo do professor" + "\n" + "2 - 10 pontos a mais" + "3 - Um bombom do Tito de graça");
        }else {
            System.out.println("Tente outra vez!");
            System.out.println(numeros);
        }
    }
}
