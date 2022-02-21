
package UD7_Excepciones;

public class Cuenta {

        private String titular;
        private double saldo;
        private final double minimo = -100;
        
        //añadido Exception
        public Cuenta(String nombre, double saldo) throws CuentaException{
            
            if(saldo < 0){
                CuentaException error = new CuentaException("No se pueden abrir cuenta con saldo negativo");
                throw error;
            }
            setTitular(nombre);
            this.saldo = saldo;
        }
        
        public void setTitular(String nombre){
            this.titular = nombre;
        }
        public String getTitular(){
            return titular;
        }
        public double getSaldo(){
            return saldo;
        }
        
        //Añadida exception 
        public void ingresar(double saldo) throws CuentaException{
            
            if(saldo <= 0){
                CuentaException error = new CuentaException("No se pueden ingresar cantidades negativas");
                throw error;
            }
            this.saldo = this.saldo + saldo;
        }
        
        //Añadida exception
        public void retirar(double saldo) throws CuentaException{
            
            if(this.saldo == minimo || (this.saldo - saldo) < minimo){
                CuentaException error = new CuentaException("Error: no se puede retirar dicha cantidad");
                throw error;
            }
      
            this.saldo = this.saldo - saldo;
             
        }
        
        public void imprimir(){
            System.out.println("Titular: "+ titular+" Saldo: "+ saldo+" €" );
            
        }
            
}
