package com.hemmersonrosa.desconto.strategy;

import com.hemmersonrosa.desconto.model.Venda;

public class DescontoStrategyProgressivo implements DescontoStrategy {
    @Override
    public double calculoDesconto(Venda venda) {
        double desconto = venda.getValorTotal() / 25;
        return Math.min(desconto, venda.getValorTotal() * (20.0 / 100));
    }
}
