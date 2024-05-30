/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparatorpractica;

import java.util.Comparator;


public class EdadAscendente implements Comparator<Perro> {

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
}
