/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questoes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author lod17
 *
 * 2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor
 * sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8,
 * 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado
 * um número, ele calcule a sequência de Fibonacci e retorne uma mensagem
 * avisando se o número informado pertence ou não a sequência.
 *
 *
 */
public class Fibonacci {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int primeiroTermo = 0, segundoTermo = 1, terceiroTermo, numeroUsuario;

        System.out.print("Informe um número: ");
        numeroUsuario = sc.nextInt();

        List listFibonacci = new ArrayList<>(numeroUsuario);

        listFibonacci.add(0);
        listFibonacci.add(1);

        for (int contador = 0; contador <= numeroUsuario; contador++) {
            terceiroTermo = primeiroTermo + segundoTermo;
            primeiroTermo = segundoTermo;
            segundoTermo = terceiroTermo;
            contador++;

            listFibonacci.add(terceiroTermo);
        }

        System.out.println(listFibonacci);

        if (listFibonacci.contains(numeroUsuario)) {
            System.out.println("esiste");
        } else {
            System.out.println("não existe");
        }

        sc.close();

    }

}
