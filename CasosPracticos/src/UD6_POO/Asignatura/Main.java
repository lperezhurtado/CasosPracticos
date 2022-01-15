
package UD6_POO.Asignatura;

public class Main {
    
    public static void main(String[] args) {
        
        Asignatura as1 = new Asignatura("Mates",1017,1);
        Asignatura as2 = new Asignatura("Programacion",1018,2);
        Asignatura as3 = new Asignatura("Sistemas",1019,3);
        
        as1.imprimir();
        as2.imprimir();
        as3.imprimir();
    }
    
}
