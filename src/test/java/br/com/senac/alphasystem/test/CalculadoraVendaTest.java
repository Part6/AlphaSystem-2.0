package br.com.senac.alphasystem.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraVendaTest {

    @Test
    public void deveCalcularTotalDaVenda() {

        CalculadoraVenda calculadora = new CalculadoraVenda();

        double resultado = calculadora.calcularTotal(20.0, 3);

        assertEquals(60.0, resultado);
    }

    @Test
    public void deveCalcularVendaComUmaUnidade() {

        CalculadoraVenda calculadora = new CalculadoraVenda();

        double resultado = calculadora.calcularTotal(50.0, 1);

        assertEquals(50.0, resultado);
    }

    @Test
    public void deveRecusarQuantidadeZero() {

        CalculadoraVenda calculadora = new CalculadoraVenda();

        assertThrows(
            IllegalArgumentException.class,
            () -> calculadora.calcularTotal(20.0, 0)
        );
    }

    @Test
    public void deveRecusarPrecoNegativo() {

        CalculadoraVenda calculadora = new CalculadoraVenda();

        assertThrows(
            IllegalArgumentException.class,
            () -> calculadora.calcularTotal(-20.0, 2)
        );
    }

    @Test
    public void deveRecusarPrecoNegativoEQuantidadeZero() {

        CalculadoraVenda calculadora = new CalculadoraVenda();

        assertThrows(
            IllegalArgumentException.class,
            () -> calculadora.calcularTotal(-20.0, 0)
        );
    }
    
    @Test
    public void diminiuirEstoque() {

        CalculadoraVenda calculadora = new CalculadoraVenda();

        double resultado = calculadora.calcularEstoque(15, 30);

        assertEquals(15, resultado);
    }

    @Test
    public void deveCalcularComUmaUnidade() {

        CalculadoraVenda calculadora = new CalculadoraVenda();

        double resultado = calculadora.calcularEstoque(1, 1);

        assertEquals(0, resultado);
    }

    @Test
    public void ErroQuantidadeZeroEstoque() {

        CalculadoraVenda calculadora = new CalculadoraVenda();

        assertThrows(
            IllegalArgumentException.class,
            () -> calculadora.calcularEstoque(5, 0)
        );
    }

    @Test
    public void deveRecusarItensNegativo() {

        CalculadoraVenda calculadora = new CalculadoraVenda();

        assertThrows(
            IllegalArgumentException.class,
            () -> calculadora.calcularEstoque(-20.0, 2)
        );
    }
    
    @Test
    public void deveRecusarItensNoEstoqueNegativo() {

        CalculadoraVenda calculadora = new CalculadoraVenda();

        assertThrows(
            IllegalArgumentException.class,
            () -> calculadora.calcularEstoque(20, -1)
        );
    }

    @Test
    public void deveRecusarNovoEstoqueNegativo() {

        CalculadoraVenda calculadora = new CalculadoraVenda();

        assertThrows(
            IllegalArgumentException.class,
            () -> calculadora.calcularEstoque(10, 5)
        );
    }
    
    
}