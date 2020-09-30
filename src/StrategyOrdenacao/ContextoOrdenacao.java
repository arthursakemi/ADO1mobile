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
public enum ContextoOrdenacao {
    SELECTION(new Selection()),
    INSERTION(new Insertion()),
    BUBBLE(new Bubble());

    Ordenador ordenador;

    ContextoOrdenacao(Ordenador ordenador) {
        this.ordenador = ordenador;
    }

    public void ordenar(int[] arr) {
        ordenador.sort(arr);
    }

}
