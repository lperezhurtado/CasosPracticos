
package UD6_POO.Asignatura;

public class MainVector {
    
    public static void main(String[] args) {
        
        Asignatura[] asignaturas = new Asignatura[5];
        
        asignaturas[0]=new Asignatura("mates",1,1);
        asignaturas[1]=new Asignatura("ingles",2,2);
        asignaturas[2]=new Asignatura("programacion",3,3);
        asignaturas[3]=new Asignatura("sistemas",4,4);
        asignaturas[4]=new Asignatura("fol",5,5);
        
        for (Asignatura asignatura : asignaturas) {
            asignatura.imprimir();
        }
        
    }

}
