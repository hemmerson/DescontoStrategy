package com.hemmersonrosa.desconto;

import com.hemmersonrosa.desconto.model.Cliente;
import com.hemmersonrosa.desconto.model.Venda;
import com.hemmersonrosa.desconto.strategy.DescontoStrategyAniversario;
import com.hemmersonrosa.desconto.strategy.DescontoStrategyDefinido;
import com.hemmersonrosa.desconto.strategy.DescontoStrategyProgressivo;

import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(1, "Hemmerson", LocalDate.of(1989, 2, 17));
        Venda venda = new Venda(cliente, LocalDate.now(), 1500.0);

        venda.setDescontoStrategy(new DescontoStrategyAniversario());
        if (venda.desconto() <= 0.0) {
            venda.setDescontoStrategy(new DescontoStrategyDefinido(12));
        }

        System.out.println("Valor original: " + venda.getValorTotal());
        System.out.println("Tipo de desconto: " + venda.tipoDesconto());
        System.out.println("Desconto: " + venda.desconto());
        System.out.println("Valor com desconto: " + (venda.calculaDesconto()));

        System.out.println("=========================================");
        venda.setDescontoStrategy(new DescontoStrategyProgressivo());
        System.out.println("Valor original: " + venda.getValorTotal());
        System.out.println("Tipo de desconto: " + venda.tipoDesconto());
        System.out.println("Desconto: " + venda.desconto());
        System.out.println("Valor com desconto: " + (venda.calculaDesconto()));

    }
}
