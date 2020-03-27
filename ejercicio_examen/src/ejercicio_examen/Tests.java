package ejercicio_examen;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.*;

import EjercicioJunit;


public class Tests {
	static EjercicioJunit e;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Comienzan los test...");
		e = new EjercicioJunit();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("Finalizan los test...");
	}

	@BeforeEach
	void setUp() throws Exception {
		e.setA(100);
		e.setB(20);
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	@Test
	void suma() {
		assertEquals(120 , e.sumar());
	}
	
	@Test
	void restar() {
		assertEquals(80 , e.restar());
	}
	
	@Test
	void multiplicar() {
		assertEquals(2000 , e.multiplicar());
	}
	
	@Test
	void dividir() {
		assertEquals(5 , e.dividir());
	}
}




