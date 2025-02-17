package com.hemmersonrosa.desconto.strategy;

import com.hemmersonrosa.desconto.model.Venda;

/**
 * Para fins de uso adequado, declarar implementação da classe
 * com DescontoStrategy+nomeDaStrategia
 */
@FunctionalInterface
public interface DescontoStrategy {
    double calculoDesconto(Venda venda);
}
