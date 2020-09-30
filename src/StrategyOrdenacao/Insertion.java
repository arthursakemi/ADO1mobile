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
public class Insertion implements Ordenador {

    @Override
    public void sort(int[] arr) {
        int i, j;
        int temp;
        for (i = 1; i < arr.length; i++) {
            temp = arr[i];
            j = i;
            while (j > 0 && arr[j - 1] >= temp) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = temp;
        }

    }

}
