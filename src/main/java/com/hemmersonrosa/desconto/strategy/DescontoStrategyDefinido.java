package com.hemmersonrosa.desconto.strategy;

import com.hemmersonrosa.desconto.model.Venda;

public class DescontoStrategyDefinido implements DescontoStrategy {

    private double percentual;

    public DescontoStrategyDefinido(double percentual) {
        this.percentual = percentual;
    }

    @Override
    public double calculoDesconto(Venda venda) {
        return venda.getValorTotal() * (percentual / 100);
    }
}
