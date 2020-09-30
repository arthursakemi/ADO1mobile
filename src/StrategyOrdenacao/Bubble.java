/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StrategyOrdenacao;

/**
 *
 * @author Arthur
 */
public class Bubble implements Ordenador {

    @Override
    public void sort(int[] arr) {
        int i, j;
        int temp;
        for (j = 0; j < arr.length - 1; j++) {
            for (i = 0; i < arr.length - 1 - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }

    }

}
