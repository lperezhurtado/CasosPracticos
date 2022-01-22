
package UD6_POO.Cuenta;

public class Cuenta {
    
    private int numero;
    private double saldo;
    
    //constructor
    public Cuenta(int numero,double saldo){
        if (saldo <0){
            this.numero = numero;
            System.out.println("No puedes abrir la cuenta con saldo negativo");
        }
        else{
            this.numero = numero;
            this.saldo = saldo;}
    
    }
    public Cuenta(){
        
    }
    
    //set y get de numero de cuenta
    public void setNumero(int numero){
        this.numero = numero;
    }
    public int getNumero(){
        return numero;
    }
    
    //set y get de saldo
    public void setSaldo(double saldo){
        if(saldo < 0){
            System.out.println("No se puede abrir la cuenta con un saldo negativo"+"\n");
        }
        else
        this.saldo = saldo;
    }
    public double getSaldo(){
        return saldo;
    }
    //metodo para ingresar 
    public void ingresar(double saldo){
        
        if(saldo >0){
            this.saldo += saldo;
        }
        else if(saldo <= 0){
            System.out.println("No puedes ingresar cantidades negativas o guales a 0"+"\n");
        }
        imprimir();
    }
    
    //metodo para retirar
    public boolean retirar(double saldo){
        
        if(this.saldo>=saldo && saldo > 0){
            this.saldo-=saldo;
            
        }
        else if(this.saldo <saldo || saldo <= 0){
            System.out.println("No se puede retirar esa cantidad");
            System.out.println("Se puede retirar como mucho "+this.saldo+"\n");
        }
        
        imprimir();
        
        if(this.saldo>=saldo)
            return true;
        else 
            return false;  
    }
    
    public void imprimir(){
        System.out.println("Saldo actual de la cuenta "+numero+": "+saldo +"\n");
    }
    
    public void menu(){
        System.out.println("  MENU  \n"+
                "1. Ver cuentas \n"
                + "2. Ingresar \n"
                + "3. Retirar \n"
                + "4. Transferencia \n"
                + "5. Salir \n");
    }
    
}
