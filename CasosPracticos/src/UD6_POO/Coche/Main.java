
package UD6_POO.Coche;

import UD6_POO.Coche.Coche.seguro;
import UD6_POO.Coche.Coche.tipo;

public class Main {
    
    public static void main(String[] args) {
        //objetos
        Coche c1 = new Coche("Audi","rojo",true,"1234flg",tipo.MINI,seguro.TERCEROS,2000);
        Coche c2 = new Coche("Porche","Gris",false,"12345dfg",tipo.DEPORTIVO,seguro.TODO_RIESGO,2010);
        Coche c3 = new Coche("Citroen","Azul",false,"12345asd",tipo.UTILITARIO,seguro.TERCEROS,2007);
        
        //mostrar datos de objetos
        c1.imprimir();
        c2.imprimir();
        c3.imprimir();   
    }
}
