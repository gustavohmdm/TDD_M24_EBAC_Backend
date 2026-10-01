package br.com.gustavohmdm.teste.simples;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * @author gustavohmdm
 */

@RunWith(Suite.class)
@SuiteClasses({ br.com.gustavohmdm.teste.simples.PrimeiroTeste.class, br.com.gustavohmdm.teste.simples.SegundoTeste.class })
public class AllTests {
}
