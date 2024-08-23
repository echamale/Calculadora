package calculadora.operaciones;

public class Division extends Operacion {

    @Override
    public Double calcular(Double numero1, Double numero2) {
        if (numero2 == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return numero1 / numero2;
    }
}
