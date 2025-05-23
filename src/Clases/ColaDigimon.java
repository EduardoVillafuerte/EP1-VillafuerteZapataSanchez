package Clases;

import java.util.LinkedList;
import java.util.Queue;

public class ColaDigimon {

    private Queue<Digimon> cola = new LinkedList<>();

    //Se crean los digimones con construtors por defecto y valores predefinidos
    public ColaDigimon() {
        this.cola.add(new Digimon());
        this.cola.add(new Digimon("Patamon","Volador",100,"Toque pluma","Debilitado"));
        this.cola.add(new Digimon("Veemon","Agua",150,"Aletazo","Curado"));
        this.cola.add(new Digimon("Turtlemon","Bestia",200,"Coraza celestial","Evolucionando"));
        this.cola.add(new Digimon("Elecmon","Electrico",175,"Chispazo","Desmayado"));
    }


    // Se presentan los datos en el Text Area
    public StringBuilder actualizarTabla(){

        StringBuilder sb = new StringBuilder();
        while(!cola.isEmpty())
            sb.append(cola.poll().toString());

        return sb;
    }

    // Se suma el poder de los digimon segun los tipos se suman un nivel extra
    public StringBuilder poderTotalR2() {
        StringBuilder sb = new StringBuilder();
        while (!cola.isEmpty()) {
            Digimon digimon = cola.poll();
            sb.append(digimon.getNombre())
                    .append("\n")
                    .append("Nivel de poder actual: ");
            if(digimon.getTipo().equalsIgnoreCase("fuego")){
                sb.append(String.format("%.2f", digimon.getNivelPoder() * 1.3));
            } else if ( digimon.getTipo().equalsIgnoreCase("Agua")) {
                sb.append(String.format("%.2f", digimon.getNivelPoder() * 1.5));
            } else if (digimon.getTipo().equalsIgnoreCase("Planta")) {
                sb.append(String.format("%.2f", digimon.getNivelPoder() * 1.2));
            }else
                sb.append(digimon.getNivelPoder());
            sb.append("\n")
                    .append("\n");
        }
        return sb;
    }


    //Se crea una nueva cola segun la habilidad que se desdea buscar, y se añade en una nueva cola
    public StringBuilder colaPorHabilidad(String habilidad){
        StringBuilder sb = new StringBuilder();
        Queue<Digimon> colaHabilidad = new LinkedList<>();

        while(!cola.isEmpty()){
            Digimon digimon = cola.poll();
            if(digimon.getHabilidad().equalsIgnoreCase(habilidad)){
                colaHabilidad.add(digimon);
            }
        }

        while(!colaHabilidad.isEmpty()){
            sb.append(colaHabilidad.poll().toString());
        }

        return sb;
    }


    // Según el nivel de poder que sea mayor a 150 se puede evoliucionar y cambia el estado a Evolucionado
    public StringBuilder evolucionar(){
        StringBuilder sb = new StringBuilder();
        while(!cola.isEmpty()){
            Digimon digimon = cola.poll();
            if(digimon.getNivelPoder() > 150){
                digimon.setEstado("Evolucionado");
                sb.append(digimon.getNombre())
                        .append("Evo")
                        .append("\n")
                        .append("Nuevo nivel de poder: ")
                        .append(digimon.getNivelPoder()*1.20)
                        .append("\nEstado: \n")
                        .append(digimon.getEstado())
                        .append("\n");
            }
        }
        return sb;
    }

}
