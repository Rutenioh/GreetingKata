import static org.junit.jupiter.api.Assertions.*;

import es.rutenioh.Greeting;
import org.junit.jupiter.api.Test;

public class GreetingTest {

    @Test
    void deberiaSaludarConNombre() {
        String name = "Hector";
        Greeting greeting = new Greeting();
        String greet = greeting.greet(name);
        assertEquals("Hello, "+ name +".", greet);
    }

    @Test
    void deberiaSaludarConNull() {
        String name = null;
        Greeting greeting = new Greeting();
        String greet = greeting.greet(name);
        assertEquals("Hello, my friend.", greet);
    }

    @Test
    void deberiaSaludarEnMayusculasSiNombreEnMayusculasEntero(){
        String name = "HECTOR";
        Greeting greeting = new Greeting();
        String greet = greeting.greet(name);
        assertEquals("HELLO "+ name +"!", greet);
    }

    @Test
    void deberiaSaludarNormalSiNombreCasiEnMayusculas(){
        String name = "HeCTOR";
        Greeting greeting = new Greeting();
        String greet = greeting.greet(name);
        assertEquals("Hello, "+ name +".", greet);
    }

    @Test
    void deberiaSaludarCuandoHayDosNombres() {
        String[] names = {"Hector", "Celia"};
        Greeting greeting = new Greeting();
        String greet = greeting.greet(names);
        assertEquals(String.format("Hello, %s and %s.",names[0],names[1]), greet);
    }

    @Test
    void deberiaSaludarCuandoHayVariosNombres() {
        String[] names = {"Hector", "Celia", "Tristán"};
        Greeting greeting = new Greeting();
        String greet = greeting.greet(names);
        assertEquals(String.format("Hello, %s, %s and %s.",names[0],names[1], names[2]), greet);
    }

    @Test
    void deberiaSaludarCuandoHayVariosNombresYConMayusculas() {
        String[] names = {"Hector", "CELIA", "Tristán"};
        Greeting greeting = new Greeting();
        String greet = greeting.greet(names);
        assertEquals(String.format("Hello, %s and %s. AND HELLO %s!",names[0],names[2], names[1]), greet);
    }


}
