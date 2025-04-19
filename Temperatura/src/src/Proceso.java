/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

import java.util.Scanner;

/**
 *
 * @author rober
 */
public class Proceso {

    Inicio objeto = new Inicio();
    Scanner read = new Scanner(System.in);

    public void llenarArreglo() {
        for (int i = 0; i < objeto.getArreglo().length; i++) {
            System.out.println("Proporcioname la temperatura del día " + objeto.getDias(i) + ": ");
            objeto.setArreglo(i, read.nextInt());
        }
    }

    public void mostrarArreglo() {
        int i = 0;
        System.out.println("Temperaturas de la semana");
        for (int grados : objeto.getArreglo()) {
            System.out.print(objeto.getDias(i) + ": " + grados + "°C ");
            i++;
        }
    }

    public void promedio() {
        objeto.setPromedio(0);
        for (int i = 0; i < objeto.getArreglo().length; i++) {
            objeto.setPromedio(objeto.getPromedio() + objeto.getArreglo(i));
        }
        System.out.println("\nEl promedio de temperatura es: "
                + objeto.getPromedio() / objeto.getArreglo().length + "°C");
    }

    public void temperaturaMayor() {
        int mayor;
        mayor = Integer.MIN_VALUE;
        for (int i = 0; i < objeto.getArreglo().length; i++) {
            if (objeto.getArreglo(i) > mayor) {
                mayor = objeto.getArreglo(i);
                objeto.setDia(i);
            }
        }
        System.out.println("La temperatura más alta registrada es: " + mayor + "°C \n"
                + "Registrada el día: " + objeto.getDias(objeto.getDia()));
    }

    public void temperaturaMenor() {
        int menor;
        menor = Integer.MAX_VALUE;
        for (int i = 0; i < objeto.getArreglo().length; i++) {
            if (objeto.getArreglo(i) < menor) {
                menor = objeto.getArreglo(i);
                objeto.setDia(i);
            }
        }
        System.out.println("La temperatura más baja registrada es: " + menor + "°C \n"
                + "registrada el día: " + objeto.getDias(objeto.getDia()));
    }

    public void temperaturaRepetida() {
        int temperatura, cont = 0;
        System.out.println("Proporciona una temperatura para saber cuantas veces se obtuvo en la semana: ");
        temperatura = read.nextInt();
        for (int i = 0; i < objeto.getArreglo().length; i++) {
            if (objeto.getArreglo(i) == temperatura) {
                cont++;
            }
        }
        if (cont == 0) {
            System.out.println("Esa temperatura no se obtuvo en la semana");
        } else {
            System.out.println("La temperatura proporcionada se repitio un total de: " + cont + " veces.");
        }
    }

}
