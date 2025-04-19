/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package src;

/**
 *
 * @author rober
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Proceso proceso = new Proceso();
        proceso.llenarArreglo();
        proceso.mostrarArreglo();
        proceso.promedio();
        proceso.temperaturaMayor();
        proceso.temperaturaMenor();
        proceso.temperaturaRepetida();
    }

}
