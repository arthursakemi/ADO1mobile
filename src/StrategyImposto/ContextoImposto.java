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
public enum ContextoImposto {
    IP1(new Ip1()),
    IP2(new Ip2()),
    IP3(new Ip3());

    CalculoImposto imposto;

    ContextoImposto(CalculoImposto imposto) {
        this.imposto = imposto;
    }

    public double calcularImposto(double valor) {
        return imposto.calculaImposto(valor);
    }

    public double calcularValorFinal(double valor) {
        return imposto.calculaValorFinal(valor);
    }
}
