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
// 1� Teste: compila��o passando String
// 2� Teste: Testar Potz V�lidos e invalidos
//
//
//
