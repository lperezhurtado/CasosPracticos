package UD6_POO.Coche;

public class Coche {
    
    private String modelo;
    private String color;
    private boolean pinturametal;
    private String matricula;
    private final tipo tipo;
    private final seguro seguro;
    private int año;
    
    //enum
    public enum tipo{MINI, UTILITARIO, FAMILIAR, DEPORTIVO;}
    public enum seguro{TERCEROS, TODO_RIESGO}
    
    //constructor
    public Coche(String modelo, String color,boolean pinturametal,
                 String matricula,tipo tipo,seguro seguro,int año){
        this.modelo = modelo;
        this.color = color;
        this.pinturametal = pinturametal;
        this.matricula = matricula;
        this.tipo = tipo;
        this.seguro = seguro;
        this.año = año; 
        
    }
    
    //set y get de modelo
    public void setModelo(String mod){
        modelo = mod;
    }
    public String getModelo(){
        return modelo;
    }
    
    //set y get de color
    public void setColor(String col){
        color = col;
    }
    public String getColor(){
        return color;
    }
    
    //set y get de pintura
    public void setPintura(boolean pint){
        pinturametal = pint;
    }
    public boolean getPintura(){
        return pinturametal;
    }
    
    //set y get de matricula
    public void setMatricula(String mat){
        matricula = mat;
    }
    public String getMatricula(){
        return matricula;
    }
    
    //set y get de año
    public void setAño(int a){
        año = a;
    }
    public int getAño(){
        return año;
    }
    
    public void imprimir(){
        System.out.println("Modelo: "+modelo+"\n"+
                           "Color: "+color+"\n"+
                           "Pintura metalizada: "+pinturametal+"\n"+
                           "Matricula "+matricula+"\n"+
                           "Tipo: "+tipo+"\n"+
                           "Seguro: "+seguro+"\n"+
                           "Año: "+año+"\n");
    } 
}
