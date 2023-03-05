/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questoes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author lod17 5) Escreva um programa que inverta os caracteres de um string.
 * IMPORTANTE: a) Essa string pode ser informada através de qualquer entrada de
 * sua preferência ou pode ser previamente definida no código; b) Evite usar
 * funções prontas, como, por exemplo, reverse;
 *
 */
public class reverseString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String palavraUsuario, palavraInverso = "";

        System.out.println("Digite uma palavra");
        palavraUsuario = sc.nextLine();

        for (int i = palavraUsuario.length() - 1; i >= 0; i--) {
            palavraInverso += Character.toString(palavraUsuario.charAt(i));
        }

        System.out.println(palavraInverso);

    }

}
