/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

/**
 *
 * @author rober
 */
public class Inicio {

    private final int[] arreglo = new int[7];
    private int promedio;
    private int dia;
    private String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};

    public Inicio() {

    }

    public int getArreglo(int index) {
        return arreglo[index];
    }

    public int[] getArreglo() {
        return arreglo;
    }

    public void setArreglo(int index, int elemento) {
        this.arreglo[index] = elemento;
    }

    public int getPromedio() {
        return promedio;
    }

    public void setPromedio(int promedio) {
        this.promedio = promedio;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public String[] getDias() {
        return dias;
    }

    public String getDias(int index) {
        return dias[index];
    }

    public void setDias(String[] dias) {
        this.dias = dias;
    }

}
