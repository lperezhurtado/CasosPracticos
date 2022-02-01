
package POO_CuentasBancarias;

import java.util.Scanner;

public class Banco {
    
    Scanner lector = new Scanner(System.in);
    
    Cuenta[] cuentas;
    int cuantos = 0;
    int max = 100;
    
    //Constructor
    public Banco(){
        
        cuentas = new Cuenta[max];
    }
    //metodo Agregar cuenta
    public void agregarCuenta(String nombre, double saldo){
        
        if(cuantos < max){
            cuentas[cuantos] = new Cuenta(nombre, saldo);
            cuantos++;
        }
        
        else{
            System.out.println("Error: limite de cuentas alcanzado");
        }
         
    }
    //metodo para eliminar cuenta
    public void eliminarCuenta(int pos){
        
        for (int i = 0; i < (cuantos-1); i++) {
            cuentas[i] = cuentas[i+1];
        }
        cuantos--;
    }
    //metodo para imprimir todas las cuentas
    public void imprimirTodo(){
        
        for (int i = 0; i < cuantos; i++) {
            cuentas[i].imprimir();
        }
    }
    //metodo para buscar una cuenta
    public void buscarCuenta(String nombre){
        for (int i = 0; i < cuantos; i++) {
            
            if(cuentas[i].getTitular().equalsIgnoreCase(nombre))
                cuentas[i].imprimir();
        }
    }
    //metodo para ingresar
    public void ingresar(int pos, double saldo){
        cuentas[pos].ingresar(saldo);
    }
    //metodo para retirar
    public void retirar(int pos, double saldo){
        cuentas[pos].retirar(saldo);
    }
    
    public void transferencia(int posI, int posD, double saldo){
        
        cuentas[posI].retirar(saldo);
        cuentas[posD].ingresar(saldo);
    }
    
    public void morosos(){
        System.out.println("LISTA DE MOROSOS \n");
        
        for (int i = 0; i < cuantos; i++) {
            
            if(cuentas[i].getSaldo() < 0){
                cuentas[i].imprimir();
            }
        }
    }

}