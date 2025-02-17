package com.hemmersonrosa.desconto.strategy;

import com.hemmersonrosa.desconto.model.Cliente;
import com.hemmersonrosa.desconto.model.Venda;

import java.time.LocalDate;

public class DescontoStrategyAniversario implements DescontoStrategy {
    @Override
    public double calculoDesconto(Venda venda) {
        LocalDate hoje = LocalDate.now();
        Cliente cliente = venda.getCliente();
        if (cliente.getDataNascimento().getDayOfMonth() == hoje.getDayOfMonth() &&
            cliente.getDataNascimento().getMonth() == hoje.getMonth()) {
            return venda.getValorTotal() * (15.0 / 100);
        }
        return 0;
    }
}
