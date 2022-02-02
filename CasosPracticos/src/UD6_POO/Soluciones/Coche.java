package UD6_POO.Soluciones;

public class Coche {

    // ENUMS
    enum tipoCoche {
        MINI, UTILITARIO, FAMILIAR, DEPORTIVO
    }

    enum modalidadSeguro {
        TERCEROS, TODO_RIESGO
    }

    // ATRIBUTOS
    private String modelo;
    private String color;
    private boolean pinturaMetalizada;
    private String matricula;
    private int anyoFabricacion;
    private tipoCoche tipo;
    private modalidadSeguro seguro;

    // CONSTRUCTOR
    public Coche(String modelo, String color, boolean pinturaMetalizada, String matricula, int anyoFabricacion, tipoCoche tipo, modalidadSeguro seguro) {
        this.modelo = modelo;
        this.color = color;
        this.pinturaMetalizada = pinturaMetalizada;
        this.matricula = matricula;
        this.anyoFabricacion = anyoFabricacion;
        this.tipo = tipo;
        this.seguro = seguro;
    }

    // GETTERS
    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public boolean getPintura() {
        return pinturaMetalizada;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getAnyoFabricacion() {
        return anyoFabricacion;
    }

    public tipoCoche getTipo() {
        return tipo;
    }

    public modalidadSeguro getSeguro() {
        return seguro;
    }

    // SETTERS
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPinturaMetalizada(boolean pinturaMetalizada) {
        this.pinturaMetalizada = pinturaMetalizada;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setAnyoFabricacion(int anyoFabricacion) {
        this.anyoFabricacion = anyoFabricacion;
    }

    public void setTipo(tipoCoche tipo) {
        this.tipo = tipo;
    }

    public void setSeguro(modalidadSeguro seguro) {
        this.seguro = seguro;
    }

    // OTROS MÉTODOS
    public void imprime() {
        System.out.println("MODELO: " + modelo + "\n"
                + "COLOR: " + color + "\n"
                + "PINTURA METALIZADA: " + pinturaMetalizada + "\n"
                + "MATRÍCULA: " + matricula + "\n"
                + "AÑO FABRICACIÓN: " + anyoFabricacion + "\n"
                + "TIPO COCHE: " + tipo + "\n"
                + "MODALIDAD SEGURO: " + seguro + "\n"
                + "");
    }

}
