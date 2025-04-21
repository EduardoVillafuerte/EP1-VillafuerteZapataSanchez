package Clases;

import javax.swing.*;
import java.util.LinkedList;
import java.util.Queue;

public class ColaDigimon {
    private Queue<Digimon> cola = new LinkedList<>();

    public ColaDigimon(Queue<Digimon> cola) {
        this.cola.add(new Digimon());
        this.cola.add(new Digimon());
        this.cola.add(new Digimon());
        this.cola.add(new Digimon());
        this.cola.add(new Digimon());
    }

    public void actualizarTabla(JTextArea txtArea){
        while(!cola.isEmpty())
            txtArea.append(cola.poll().toString());
    }

}
