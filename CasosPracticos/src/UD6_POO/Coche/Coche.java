
package UD6_POO.Coche;

public class Coche {
    
    private String modelo;
    private String color;
    private boolean pinturametal;
    private String matricula;
    private enum tipo{MINI, UTILITARIO, FAMILIAR, DEPORTIVO;}
    private int año;
    private enum seguro{TERCEROS, TODO_RIESGO}
    //constructor
    public Coche(){
        modelo = null;
        color = null;
        pinturametal = false;
        matricula = null;
        año = 0;      
    }
    
    public void setTipo(enum t){
        
        
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
}
