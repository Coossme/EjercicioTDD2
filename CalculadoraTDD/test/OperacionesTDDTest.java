import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperacionesTDDTest {

    @Test
    void testeo0DevuelveNada() {
        //Arrange
        OperacionesTDD calculadora = new OperacionesTDD();

        //Act
        int numero = calculadora.operacion("");

        //Assert
        assertEquals(0, numero);
        System.out.println(numero);
    }
    @Test
    void testeo1Devuelve1() {
        //Arrange
        OperacionesTDD calculadora = new OperacionesTDD();

        //Act
        int numero = calculadora.operacion("1");

        //Assert
        assertEquals(1, numero);
        System.out.println(numero);
    }
}