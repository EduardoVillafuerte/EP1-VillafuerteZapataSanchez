package Clases;

public class Digimon {
    private String nombre; //El nombre del Digimon (ej. "Agumon", "Gabumon", etc.)
    private String tipo; // El tipo de Digimon, el cual puede ser uno de los siguientes:▪ "Fuego", "Agua", "Planta", "Volador", "Luz", "Oscuridad", "Viento",
                         //"Eléctrico", "Místico", "Bestia", entre otros.
    private int nivelPoder; //Un valor entero que representa el nivel de poder base del Digimon
    private String habilidad; // La habilidad especial del Digimon, como "Flama Bebé","Llama Azul", "Electroshock", "Rayo Celestial", etc.
    private String estado; // Representa el estado del Digimon en combate (por ejemplo,"Activo", "Desmayado", "Evolucionando", "Curado", "Debilitado"

    public Digimon() {
        this.nombre = "Agumon";
        this.tipo = "Fuego";
        this.nivelPoder = 120;
        this.habilidad = "Flama Bebé";
        this.estado = "Activo";
    }

    public Digimon(String nombre, String tipo, int nivelPoder, String habilidad, String estado) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.nivelPoder = nivelPoder;
        this.habilidad = habilidad;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public int getNivelPoder() {
        return nivelPoder;
    }

    public String getHabilidad() {
        return habilidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Digimon" + '\n'+
                "nombre='" + nombre + '\n' +
                ", tipo='" + tipo + '\n' +
                ", nivelPoder=" + nivelPoder + '\n' +
                ", habilidad='" + habilidad + '\n' +
                ", estado='" + estado + '\n'+'\n';
    }
}


