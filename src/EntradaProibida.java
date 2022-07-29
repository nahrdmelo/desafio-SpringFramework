/* Desafio
O objetivo deste desafio é resolvê-lo utilizando o seu conhecimento sobre Arrays,
uma estrutura de dados que armazena uma coleção de dados em um bloco de memória.
Você está desenvolvendo um sistema para um local de eventos, neste local, é
necessário que a entrada seja permitida apenas para pessoas acima de 18 anos.
Faça um programa para ler um número N, a idade de N pessoas. Depois disso,
coloque a idade mínima permitida  para se entrar no local, conforme exemplo.
Retorne às idades de quem não puder entrar. */


import java.util.Scanner;

public class EntradaProibida {
    public static void EntradaProibida (String[] args){
        var publico = new Scanner(System.in);

        int N= publico.nextInt();
        int idade = 0;

        System.out.println("Não poderão entrar as idades: ");
        while (N-->0){
            idade=publico.nextInt();
            if (idade <18) {
                System.out.println(idade);
            }
        }
    }
}
