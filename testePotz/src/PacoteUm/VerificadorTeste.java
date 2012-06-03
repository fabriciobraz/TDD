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
