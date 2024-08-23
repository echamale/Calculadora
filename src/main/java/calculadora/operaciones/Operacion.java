package calculadora.operaciones;

import calculadora.interfaces.IOperacion;

public abstract class Operacion implements IOperacion {

    public void validarEntradas(Double numero1, Double numero2) throws NullPointerException {
        if (numero1 == 0 || numero2 == 0) {
            throw new NullPointerException("El numero no puede ser nulo");
        }
    }

    public abstract Double calcular(Double numero1, Double numero2);
}
