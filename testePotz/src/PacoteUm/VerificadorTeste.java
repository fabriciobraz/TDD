package PacoteUm;

import junit.framework.Assert;

import org.junit.Test;


public class VerificadorTeste  {
	@Test
	public void testGetNumeroEqual(){
		Numero numero1 = new Numero();
		numero1.setNumero(123456);
		Assert.assertEquals(123456, numero1.getNumero());
	}
	

}

// Teste inicial do junit
// 1º Teste: compilação passando String
// 2º Teste: Testar Potz Válidos e invalidos
//
//
//
