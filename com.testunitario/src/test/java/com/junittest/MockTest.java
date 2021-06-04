package com.junittest;

import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MockTest {

    @Test
    public void testSomar(){
        Calculadora c = new Calculadora();
        int soma = c.somar("1+4");
        Assert.assertEquals(5, soma);
    }

    @Test
    public void testeSomarComMock(){
        Calculadora calc = mock(Calculadora.class);
        when(calc.somar("1+2")).thenReturn(10);
        int resul = calc.somar("1+2");
        Assert.assertEquals(10, resul);
    }
}
