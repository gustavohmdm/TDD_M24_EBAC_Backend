package br.com.gustavohmdm.teste.simples;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author gustavohmdm
 */

public class PrimeiroTeste {

    @Test
    public void test() {
        String nome = "Rodrigo";
        Assert.assertEquals("Rodrigo", nome);
    }

    @Test
    public void testNotEquals() {
        String nome = "Rodrigo";
        Assert.assertNotEquals("Rodrigo2", nome);
    }
}
