package br.com.gustavohmdm.teste.simples;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author gustavohmdm
 */

public class SegundoTeste {

    @Test
    public void test() {
        String nome = "Rodrigo";
        Assert.assertEquals("Rodrigo", nome);
    }
}
