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
    @Test
    void testTestear4(){
        //Arrange
        FizzBuzz fiz = new FizzBuzz();

        //Act
        String resultado = fiz.calcula(4);
        String esperado = "4";

        //Assert
        System.out.println("Esperado: " + esperado + "Resultado " + resultado);
        assertEquals(esperado, resultado);
    }
    @Test
    void testTestear5(){
        //Arrange
        FizzBuzz fiz = new FizzBuzz();

        //Act
        String resultado = fiz.calcula(5);
        String esperado = "BUZZ";

        //Assert
        System.out.println("Esperado: " + esperado + "Resultado " + resultado);
        assertEquals(esperado, resultado);
    }
    @Test
    void testTestear6(){
        //Arrange
        FizzBuzz fiz = new FizzBuzz();

        //Act
        String resultado = fiz.calcula(6);
        String esperado = "FIZZ";

        //Assert
        System.out.println("Esperado: " + esperado + "Resultado " + resultado);
        assertEquals(esperado, resultado);
    }
    @Test
    void testTestear7(){
        //Arrange
        FizzBuzz fiz = new FizzBuzz();

        //Act
        String resultado = fiz.calcula(7);
        String esperado = "7";

        //Assert
        System.out.println("Esperado: " + esperado + "Resultado " + resultado);
        assertEquals(esperado, resultado);
    }
    @Test
    void testTestear8(){
        //Arrange
        FizzBuzz fiz = new FizzBuzz();

        //Act
        String resultado = fiz.calcula(8);
        String esperado = "8";

        //Assert
        System.out.println("Esperado: " + esperado + "Resultado " + resultado);
        assertEquals(esperado, resultado);
    }
    @Test
    void testTestear9(){
        //Arrange
        FizzBuzz fiz = new FizzBuzz();

        //Act
        String resultado = fiz.calcula(9);
        String esperado = "FIZZ";

        //Assert
        System.out.println("Esperado: " + esperado + "Resultado " + resultado);
        assertEquals(esperado, resultado);
    }
    @Test
    void testTestear10(){
        //Arrange
        FizzBuzz fiz = new FizzBuzz();

        //Act
        String resultado = fiz.calcula(10);
        String esperado = "BUZZ";

        //Assert
        System.out.println("Esperado: " + esperado + "Resultado " + resultado);
        assertEquals(esperado, resultado);
    }
}