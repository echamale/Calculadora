package calculadora.operaciones;

public class Multiplicacion extends Operacion {

    @Override
    public Double calcular(Double numero1, Double numero2) {
        validarEntradas(numero1, numero2);
        return numero1 * numero2;
    }
}
