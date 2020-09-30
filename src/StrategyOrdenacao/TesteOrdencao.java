/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StrategyOrdenacao;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class TesteOrdencao {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sortAlgo;
        int[] arr = {4, 2, 3, 6, 7, 2, 10, 5, 11, 30, 50, 0};

        System.out.println("Escolha o algoritmo de ordenação (SELECTION, INSERTION, BUBBLE): ");
        sortAlgo = sc.next().toUpperCase();

        switch (sortAlgo) {
            case "SELECTION":
                ContextoOrdenacao.SELECTION.ordenar(arr);
                break;
            case "INSERTION":
                ContextoOrdenacao.INSERTION.ordenar(arr);
                break;
            case "BUBBLE":
                ContextoOrdenacao.BUBBLE.ordenar(arr);
                break;
            default:
                throw new AssertionError();
        }

        System.out.println(Arrays.toString(arr));
    }

}
