/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparatorpractica;

import java.util.Comparator; //agregado en caso de usar forma 3




public class Perro {
    String nombre;
    String raza;
    int edad;

    public Perro(String nombre, String raza, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }

    public Perro() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
//descomentar en caso que uses metodo 3
    Comparator<Perro> compararEdad = new Comparator<Perro>() {
        @Override
        public int compare(Perro p1, Perro p2) {
            if (p1.getEdad() < p2.getEdad()) {
                return -1;
            }
            if (p1.getEdad() == p2.getEdad()) {
                return 0;
            }
            return 1;
        }
    };
    
    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + '}';
    }
    
    
}
