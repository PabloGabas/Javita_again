/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package laboratoriopoli;

/**
 *
 * @author dng
 */
import java.util.Scanner;


/**
 * 
 * @author dng
 * Esta es la clase del Laboratorio sobre polinomios 
 */
public class LaboratorioPoli {

    /**
     * esta instancia es la que apunta al inicio de los nodos 
     */
    private LDA head;
    
    /**
     * metodo que funciona para insetar los valores en la lista y recibe
     * de parametros a los nodos de Coeficiente y Exponente
     * @param Co es el nodo coeficiente
     * @param Ex es el nodo de exponente
     */
    public void inserter(double Co, int Ex) {
        LDA za = new LDA(Co, Ex); //nuevo nodito
        if (head == null) {
            head = za;
            return;
        }
        LDA current;
        for (current = head; current.next != null; current = current.next) {
        }
        current.next = za;
    }
    
    
    /**
     *  metodo para realizar los calculos de las x del polinomio
     * @param x recibe una  x para realizar los calculos 
     * @return 
     */
    public double calcult(double x) {
        double resul = 0.0;
        for (LDA actual = head; actual != null; actual = actual.next) {
            resul += actual.Co * Math.pow(x, actual.Ex);
        }
        return resul;
    }

    /**
     * metodo para mostrar los resultados de calcut
     * @param constants recibe el arreglo de las constantes
     */
    public void result(double[] constants) {
        System.err.println("Resultados");
        System.out.println("----------------------");
        for (double x : constants) {
            double factor = calcult(x);
            System.out.println(x + "\t| " + factor);
            System.out.println("-----------------");
        }
    }

    public static void main(String[] args) {
        double[] constants = {0.0, 0.5, 1.0, 1.5, 2.0, 2.5, 3.0, 3.5, 4.0, 4.5,
            5.0};
        Scanner az = new Scanner(System.in);

        LaboratorioPoli lab = new LaboratorioPoli();

        System.err.println("Defini que sea un polinomio de 2\n"
                + "elementos Profe. (lo puede cambiar en la linea 56");
        int poliFor = 2;
        String polinomio = "Polinomio formado: ";
        for (int i = 0; i < poliFor; i++) {
            System.out.println("Ingrese el coeficiente " + (i + 1) + ":");
            double Co = az.nextDouble();
            System.out.println("Ingrese el exponente " + (i + 1) + ":");
            int Ex = az.nextInt();
            lab.inserter(Co, Ex);
            polinomio += Co + "x^" + Ex;
            if (i < poliFor - 1) {
                polinomio += " + ";
            }
        }

        System.err.println("------------------------");
        System.out.println(polinomio);
        lab.result(constants);

        az.close();
    }
}
