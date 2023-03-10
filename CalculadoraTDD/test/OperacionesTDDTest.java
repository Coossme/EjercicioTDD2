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
    @Test
    void testeo1mas2Devuelve3() {
        //Arrange
        OperacionesTDD calculadora = new OperacionesTDD();

        //Act
        int numero = calculadora.operacion("1,2");

        //Assert
        assertEquals(3, numero);
        System.out.println(numero);

    }
    @Test
    void testeo1mas1mas2Devuelve4() {
        //Arrange
        OperacionesTDD calculadora = new OperacionesTDD();

        //Act
        int numero = calculadora.operacion("1,1,2");

        //Assert
        assertEquals(4, numero);
        System.out.println(numero);

    }

    @Test
    void testeo1mas2masNadaDevuelve4() {
        //Arrange
        OperacionesTDD calculadora = new OperacionesTDD();

        //Act
        int numero = calculadora.operacion("1,2,");

        //Assert
        assertEquals(-1, numero);
        System.out.println(numero);
    }
}