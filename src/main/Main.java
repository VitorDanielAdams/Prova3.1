package main;

import java.text.DecimalFormat;
import java.util.*;


public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        List<String> listaNumeros = new ArrayList<>();

        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);

        System.out.println("digite a quantidade de valores");
        int tamanho = entrada.nextInt();
        float media = 0,maior = 0, menor = 0;

        for(int i = 0;i < tamanho;i++){
            System.out.println("Digite o "+ (i+1) +" Valor");
            listaNumeros.add(String.valueOf(entrada.nextInt()));
        }

        System.out.println("Sua lista:");
        for (int i = 0;i < tamanho;i++){
            System.out.println(listaNumeros.get(i));
            media += Float.valueOf(listaNumeros.get(i));

            if(i == 0){
                maior = Float.valueOf(listaNumeros.get(i));
                menor = Float.valueOf(listaNumeros.get(i));
            }
            if(maior < Float.valueOf(listaNumeros.get(i))){
                maior = Float.valueOf(listaNumeros.get(i));
            }
            if(menor > Float.valueOf(listaNumeros.get(i))){
                menor = Float.valueOf(listaNumeros.get(i));
            }
        }

        media = media/tamanho;

        System.out.println("A média dos valores é: " + df.format(media));
        System.out.println("O maior valor da lista é:" + maior);
        System.out.println("O menor valor da lista é:" + menor);

    }
}
