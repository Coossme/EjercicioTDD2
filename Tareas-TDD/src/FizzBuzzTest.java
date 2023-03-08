import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    @Test
    void textPasoDevuelve1EnCadena(){
        //Arrange
        FizzBuzz fiz = new FizzBuzz();

        //Act
        String resultado = fiz.calcula(1);
        String esperado = "1";

        //Assert
        System.out.println("Esperado: " + esperado + "Resultado " + resultado);
        assertEquals(esperado, resultado);
    }
    @Test
    void textPasoDevuelve2EnCadena(){
        //Arrange
        FizzBuzz fiz = new FizzBuzz();

        //Act
        String resultado = fiz.calcula(2);
        String esperado = "2";

        //Assert
        System.out.println("Esperado: " + esperado + "Resultado " + resultado);
        assertEquals(esperado, resultado);
    }

    @Test
    void testTestear3(){
        //Arrange
        FizzBuzz fiz = new FizzBuzz();

        //Act
        String resultado = fiz.calcula(3);
        String esperado = "FIZZ";

        //Assert
        System.out.println("Esperado: " + esperado + "Resultado " + resultado);
        assertEquals(esperado, resultado);
    }
}