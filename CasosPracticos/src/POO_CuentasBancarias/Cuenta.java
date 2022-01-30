
package POO_CuentasBancarias;

public class Cuenta {

        private String titular;
        private double saldo;
        private final double minimo = -100;
        
        public Cuenta(String nombre, double saldo){
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
        
        public void ingresar(double saldo){
            this.saldo = this.saldo + saldo;
        }
        
        public void retirar(double saldo){
            
            if(this.saldo == minimo || (this.saldo - saldo) < minimo){
                System.out.println("Error: no se puede retirar dicha cantidad");
            }
            else{
                this.saldo = this.saldo - saldo;
            }
            
        }
        
        public void imprimir(){
            System.out.println("Titular: "+ titular+" Saldo: "+ saldo+" €" );
            
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
}
