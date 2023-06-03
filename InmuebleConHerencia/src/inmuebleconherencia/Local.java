/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inmuebleconherencia;

/**
 *
 * @author santi
 */
public class Local extends Inmueble {
    enum Tipo {INTERNO, CALLE}; /* Tipo de inmueble especificado como un valor enumerado */
    protected Tipo tipoLocal; /* Atributo que identifica el tipo de inmueble */

    /**
     * Constructor de la clase Local
     * @param identificadorInmobiliario Parámetro que define el identificador inmobiliario de un local
     * @param área Parámetro que define el área de un local
     * @param dirección Parámetro que define la dirección donde se encuentra localizado un local
     * @param tipoLocal Parámetro que define el tipo de local (interno o que da a la calle)
     */
    public Local(int identificadorInmobiliario, int área, String dirección, Tipo tipoLocal) {
        // Invoca al constructor de la clase padre
        super(identificadorInmobiliario, área, dirección);
        this.tipoLocal = tipoLocal;
    }

    /**
     * Método que muestra en pantalla los datos de un local
     */
    @Override
    public void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println("Tipo de local = " + tipoLocal);
    }
}

