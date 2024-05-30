/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparatorpractica;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorPractica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Perro> perros = new ArrayList();
        Perro p1, p2, p3;
        p1 = new Perro("rufus", "caniche", 10);
        p2 = new Perro("firulais", "salchica", 11);
        p3 = new Perro("Bobi", "comun", 2);

        perros.add(p1);
        perros.add(p2);
        perros.add(p3);

        //antes de ordenar
        for (Perro p : perros) {
            System.out.println(p);
        }
        
        //forma 1 usando clase auxiliar
//        Collections.sort(perros, new EdadAscendente());
//        
//        for(Perro p: perros){
//            System.out.println(p);
//        }
        

//        forma 2 con metodo de clase interna anonima
//        Collections.sort(perros, new Comparator<Perro>() {
//            @Override
//            public int compare(Perro p1, Perro p2) {
//                if (p1.getEdad() < p2.getEdad()) {
//                    return -1;
//                }
//                if (p1.getEdad() == p2.getEdad()) {
//                    return 0;
//                }
//                return 1;
//            }
//        });
//        for (Perro p : perros) {
//            System.out.println(p);
//        }
        
        //        forma 3 con metodo de clase interna anonima
        Collections.sort(perros, p1.compararEdad);
        for (Perro p : perros) {
            System.out.println(p);
        }
        
        
    }

}
