package com.junittest;

import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTest {

    @Test
    public void testSomar(){
        Calculadora c = new Calculadora();
        int soma = c.somar("1+4");
        Assert.assertEquals(5, soma);
    }
}
