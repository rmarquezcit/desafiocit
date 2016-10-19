

import org.junit.Test;

import excecoes.QuantidadeVizinhosException;
import junit.framework.TestCase;

public class JogoTest extends TestCase {

	private Jogo jogo;
	
	@Test
	public void testLogicaMorto() {
		jogo = new Jogo();
		assertEquals("0", jogo.logicaMorto(1));
		assertEquals("0", jogo.logicaMorto(4));
		assertEquals("X", jogo.logicaMorto(2));
		assertEquals("X", jogo.logicaMorto(3));
	}
	
	@Test(expected=QuantidadeVizinhosException.class)
	public void testLogicaMortoVizinhoException() {
		jogo.logicaMorto(-1);
	}
	
	@Test(expected=QuantidadeVizinhosException.class)
	public void testLogicaVivoVizinhoException() {
		jogo.logicaVivo(-1);
	}
	
	@Test
	public void testLogicaVivo() {
		assertEquals("X", jogo.logicaVivo(2));
		assertEquals("X", jogo.logicaVivo(3));
		assertEquals("0", jogo.logicaVivo(4));
	}
}
