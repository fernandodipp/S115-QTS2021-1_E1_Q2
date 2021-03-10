package main;

import static org.junit.Assert.*;

import org.junit.Test;

import aula2.Calculadora;
import junit.framework.Assert;

public class TamanhoTextoTest {

	@Test
	public void TamanhoTextoTest1() {
		TamanhoTexto testcase = new TamanhoTexto();
		String inputuser = "Exemplo";
		int resultadoEsperado = 7;
		int resultadoPrograma = testcase.retornaTamanhoTexto(inputuser);
		Assert.assertEquals(resultadoEsperado, resultadoPrograma);
	}
	@Test
	public void TamanhoTextoTest2() {
		TamanhoTexto testcase = new TamanhoTexto();
		String inputuser = "";
		int resultadoEsperado = 0;
		int resultadoPrograma = testcase.retornaTamanhoTexto(inputuser);
		Assert.assertEquals(resultadoEsperado, resultadoPrograma);
	}
	@Test
	public void TamanhoTextoTest3() {
		TamanhoTexto testcase = new TamanhoTexto();
		String inputuser = "Qualidade e Teste de Software!";
		int resultadoEsperado = 30;
		int resultadoPrograma = testcase.retornaTamanhoTexto(inputuser);
		Assert.assertEquals(resultadoEsperado, resultadoPrograma);
	}
	@Test
	public void TamanhoTextoTest4() {
		TamanhoTexto testcase = new TamanhoTexto();
		String inputuser = "Aula3";
		int resultadoEsperado = 5;
		int resultadoPrograma = testcase.retornaTamanhoTexto(inputuser);
		Assert.assertEquals(resultadoEsperado, resultadoPrograma);
	}
	@Test
	public void TamanhoTextoTest5() {
		TamanhoTexto testcase = new TamanhoTexto();
		String inputuser = "email@dominio.com.br";
		int resultadoEsperado = 20;
		int resultadoPrograma = testcase.retornaTamanhoTexto(inputuser);
		Assert.assertEquals(resultadoEsperado, resultadoPrograma);
	}
}
