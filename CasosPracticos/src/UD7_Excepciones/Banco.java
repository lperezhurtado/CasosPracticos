
package UD7_Excepciones;

import java.util.InputMismatchException;
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
        
        try{
            if(cuantos < max){
                cuentas[cuantos] = new Cuenta(nombre, saldo);
                cuantos++;
            }
        }
        catch(CuentaException e){
            System.out.println(e);
        }
        catch(IndexOutOfBoundsException index){
            System.out.println("Error: limite de cuenta alcanzado");
        }
       
         
    }
    //metodo para eliminar cuenta
    public void eliminarCuenta(int pos){
        try{
            for (int i = pos; i < (cuantos-1); i++) {
                cuentas[i] = cuentas[i+1];
            }
            cuantos--;
        }
        catch(InputMismatchException i){
            System.out.println("Formato de posicion no valida");
        }
        catch(IndexOutOfBoundsException index){
            System.out.println("Posicion fuera de rango");
        }
    }
    
    //metodo para imprimir todas las cuentas
    public void imprimirTodo(){
        if(cuentas.length==0){
            System.out.println("No hay cuentas");
        }
        else{
            for (int i = 0; i < cuantos; i++) {
                cuentas[i].imprimir();
            }
        }
    }
    
    //metodo para buscar una cuenta
    public void buscarCuenta(String nombre){
        for (int i = 0; i < cuantos; i++) {
            
            if(cuentas[i].getTitular().toUpperCase().contains(nombre.toUpperCase()))
                cuentas[i].imprimir();
        }
    }
    
    //metodo para ingresar
    public void ingresar(int pos, double saldo){
        
        try{
            cuentas[pos].ingresar(saldo);
        }
        catch(CuentaException error){
            System.out.println(error);
        }
        catch(IndexOutOfBoundsException index){
            System.out.println("Posicion fuera de rango");
        }
    }
    
    //metodo para retirar
    public void retirar(int pos, double saldo){
        
        try{
            cuentas[pos].retirar(saldo);
        }
        catch(CuentaException error){
            System.out.println(error);
        }
        catch(IndexOutOfBoundsException index){
            System.out.println("Posicion fuera de rango");
        }
    }
    
    // metodo para transferencia
    public void transferencia(int posI, int posD, double saldo){
        
            try{
                cuentas[posI].retirar(saldo);
                cuentas[posD].ingresar(saldo);
            }
            catch(CuentaException error){
                System.out.println(error);
            }
            catch(IndexOutOfBoundsException index){
                 System.out.println("Posicion fuera de rango");
            }
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
