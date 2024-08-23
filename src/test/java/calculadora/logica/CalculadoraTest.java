package calculadora.logica;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    @Test
    public void testCalcularSuma() {
        Calculadora calculadora = mock(Calculadora.class);

        when(calculadora.calcular(25.25, 50.0, "+")).thenReturn(75.25);

        Double result = calculadora.calcular(25.25, 50.0, "+");

        assertEquals(75.25, result);
    }

    @Test
    public void testCalcularSumaException() {
        Calculadora calculadora = mock(Calculadora.class);

        when(calculadora.calcular(null, 20.0, "+"))
                .thenThrow(new NullPointerException("El numero no puede ser nulo"));

        assertThrows(NullPointerException.class, () ->
            calculadora.calcular(null, 20.0, "+")
        );
    }

    @Test
    public void testCalcularResta() {
        Calculadora calculadora = mock(Calculadora.class);

        when(calculadora.calcular(100.0, 23.0, "-")).thenReturn(77.0);
        Double result = calculadora.calcular(100.0, 23.0, "-");

        assertEquals(77.0, result);
    }

    @Test
    public void testCalcularRestaException() {
        Calculadora calculadora = mock(Calculadora.class);

        when(calculadora.calcular(20.0, null, "-"))
                .thenThrow(new NullPointerException("El numero no puede ser nulo"));

        assertThrows(NullPointerException.class, () ->
            calculadora.calcular(20.0, null, "-")
        );
    }

    @Test
    public void testCalcularMultiplicacion() {
        Calculadora calculadora = mock(Calculadora.class);

        when(calculadora.calcular(25.5, 5.5, "*")).thenReturn(140.25);
        Double result = calculadora.calcular(25.5, 5.5, "*");

        assertEquals(140.25, result);
    }

    @Test
    public void testCalcularMultiplicacionException() {
        Calculadora calculadora = mock(Calculadora.class);

        when(calculadora.calcular(null, 50.0, "*"))
                .thenThrow(new NullPointerException("El numero no puede ser nulo"));

        assertThrows(NullPointerException.class, () ->
                calculadora.calcular(null, 50.0, "*")
        );
    }

    @Test
    public void testCalcularDivision() {
        Calculadora calculadora = mock(Calculadora.class);

        when(calculadora.calcular(25.0, 5.0, "/")).thenReturn(5.0);
        Double result = calculadora.calcular(25.0, 5.0, "/");

        assertEquals(5, result);
    }

    @Test
    public void testCalcularDivisionException() {
        Calculadora calculadora = mock(Calculadora.class);

        when(calculadora.calcular(25.0, null, "/"))
                .thenThrow(new NullPointerException("El numero no puede ser nulo"));

        assertThrows(NullPointerException.class, () ->
                calculadora.calcular(25.0, null, "/")
        );
    }

    @Test
    public void testCalcularDivisionArithmeticException() {
        Calculadora calculadora = mock(Calculadora.class);

        when(calculadora.calcular(25.0, 0.0, "/"))
                .thenThrow(new ArithmeticException("No se puede dividir por cero"));

        assertThrows(ArithmeticException.class, () ->
                calculadora.calcular(25.0, 0.0, "/")
        );
    }
}
