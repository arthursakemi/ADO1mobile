/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StrategyImposto;

/**
 *
 * @author Arthur
 */
public class Ip1 implements CalculoImposto {

    private static final double taxa = 0.1;

    @Override
    public double calculaImposto(double valor) {
        return valor * taxa;
    }

    @Override
    public double calculaValorFinal(double valor) {
        return valor + valor * taxa;
    }

}
