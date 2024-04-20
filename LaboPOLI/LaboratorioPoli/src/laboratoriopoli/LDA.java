/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratoriopoli;

/**
 *
 * @author dng
 */

/**
 * Esta es la clase para los nodos, la que llame LDA en honor al mejor equipo 
 * del pais
 * @author dng
 */
public class LDA {
    double Co;
    int Ex;
    LDA next;

    /**
     * Constructor de los nodos
     * @param Co recibe los coeficientes
     * @param Ex recibe los Exponentes
     */
    public LDA(double Co, int Ex) {
        this.Co = Co;
        this.Ex = Ex;
        this.next = null;
    }
}

