package calculadora.logica;

import calculadora.operaciones.*;

public class Calculadora {

    public Double calcular(Double numero1, Double numero2, String simbolo) {
        Operacion operacion = simbolo.equals("+") ? new Suma() :
                                simbolo.equals("-") ? new Resta() :
                                simbolo.equals("*") ? new Multiplicacion() :
                                simbolo.equals("/") ? new Division() : null;

        return operacion.calcular(numero1, numero2);
    }
}
