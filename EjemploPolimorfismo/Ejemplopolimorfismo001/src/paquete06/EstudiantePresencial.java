/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete06;

public class EstudiantePresencial extends Estudiante {

    /*1.  Declarar
        numeroCreditos: Entero 
        costoCredito: Real 
     */
    int numeroCreditos;
    double costoCredito;

    public EstudiantePresencial(String nombre, String apellido, String i, int e,
            int nC, double cC) {

        super(nombre, apellido, i, e);
        numeroCreditos = nC;
        costoCredito = cC;
    }

    //  Métodos establecer y calcular para los datos o atributos de la clase
    // 2.  Método establecerNumeroCreditos(numero: Real)
    public void establecerNumeroCreditos(int numero) {
        numeroCreditos = numero;
    }

    // 3.  Método establecerCostoCredito(valor: Real)
    public void establecerCostoCredito(double valor) {
        costoCredito = valor;
    }

    // 4.  
    // Se implementa el método abstracto declarado en la superclase,
    // bajo las condiciones propias de la subclase
    @Override
    public void calcularMatricula() {
        matricula = numeroCreditos * costoCredito;
    }

    //  Métodos obtener para los datos o atributos de la clase
    // 5. Método obtenerNumeroCreditos() : Entero
    public int obtenerNumeroCreditos() {
        return numeroCreditos;
    }

    // 6. Método obtenerCostoCredito() : Real
    public double obtenerCostoCredito() {
        return costoCredito;
    }

    @Override
    public String toString() {

        String mensaje = super.toString();

        mensaje = String.format("%sNumero créditos: %d\n"
                + "Costo créditos: %.2f\n", mensaje,
                numeroCreditos,
                costoCredito);

        return mensaje;

    }

}
