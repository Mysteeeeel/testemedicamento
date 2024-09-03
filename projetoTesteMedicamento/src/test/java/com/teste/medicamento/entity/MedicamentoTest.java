package com.teste.medicamento.entity;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MedicamentoTest {
	
	private Medicamento medicamento;
	
	@BeforeEach
	void setup() {
		//Arrange
		medicamento = new Medicamento(1l, "Abner","Paracetamol","12/09/2024");
	}

	@Test
	@DisplayName("Testando o getter e setter do campo ID")
	void testId() {
		//Act
		medicamento.setId(2l);
		//Assert
		assertEquals(2L, medicamento.getId());
	}
	
	@Test
	@DisplayName("Testando o getter e setter do campo nome")
	void testNome() {
		//Act
		medicamento.setNome("Marcelo Rogerio");
		//Assert
		assertEquals("Marcelo Rogerio", medicamento.getNome());
	}
	
	@Test
	@DisplayName("Testando o getter e setter do campo bula")
	void testBula() {
		//Act
		medicamento.setBula("antibiotico");
		//Assert
		assertEquals("antibiotico", medicamento.getBula());
	}
	
	@Test
	@DisplayName("Testando o getter e setter do campo data de validade")
	void testDataValidade() {
		//Act
		medicamento.setDataValidade("13/04/2024");
		//Assert
		assertEquals("13/04/2024", medicamento.getDataValidade());
	}
	
	@Test
	@DisplayName("Testando o getter e setter de todos os campos")
	void testConstructorALL() {
		//Act
		Medicamento novoMedicamento = new Medicamento(3L, "Matheus", "remedio para gripe", "16/12/2024");
		//Assertion
		assertAll("novoMedicamento",
				()-> assertEquals(3L, novoMedicamento.getId()),
				()-> assertEquals("Matheus", novoMedicamento.getNome()),
				()-> assertEquals("remedio para gripe", novoMedicamento.getBula()),
				()-> assertEquals("16/12/2024", novoMedicamento.getDataValidade())
	);
	
	}
	
	
};
