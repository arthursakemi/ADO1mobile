/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StrategyImposto;

import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class CalculadoraDeImposto {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valor;
        String imposto;

        System.out.print("Digite o valor a ser calculado: ");
        valor = sc.nextDouble();
        System.out.print("Escolha o imposto a ser aplicado (IP1, IP2 ou IP3): ");
        imposto = sc.next();

        switch (imposto.toUpperCase()) {
            case "IP1":
                System.out.printf("Imposto: %.2f%n", ContextoImposto.IP1.calcularImposto(valor));
                System.out.printf("Valor Total: %.2f%n", ContextoImposto.IP1.calcularValorFinal(valor));
                break;
            case "IP2":
                System.out.printf("Imposto: %.2f%n", ContextoImposto.IP2.calcularImposto(valor));
                System.out.printf("Valor Total: %.2f%n", ContextoImposto.IP2.calcularValorFinal(valor));
                break;
            case "IP3":
                System.out.printf("Imposto: %.2f%n", ContextoImposto.IP3.calcularImposto(valor));
                System.out.printf("Valor Total: %.2f%n", ContextoImposto.IP3.calcularValorFinal(valor));
                break;
            default:
                System.out.println("Imposto não existente");
        }

    }

}
