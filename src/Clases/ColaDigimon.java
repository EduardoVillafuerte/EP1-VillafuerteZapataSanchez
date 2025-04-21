package Clases;

import javax.swing.*;
import java.util.LinkedList;
import java.util.Queue;

public class ColaDigimon {
    private Queue<Digimon> cola = new LinkedList<>();

    public ColaDigimon() {
        this.cola.add(new Digimon());
        this.cola.add(new Digimon("Patamon","Volador",100,"Toque pluma","Debilitado"));
        this.cola.add(new Digimon("Veemon","Agua",150,"Aletazo","Curado"));
        this.cola.add(new Digimon("Turtlemon","Bestia",200,"Coraza celestial","Evolucionando"));
        this.cola.add(new Digimon("Elecmon","Electrico",175,"Chispazo","Desmayado"));
    }

    public StringBuilder actualizarTabla(){

        StringBuilder sb = new StringBuilder();
        while(!cola.isEmpty())
            sb.append(cola.poll().toString());

        return sb;
    }


}
