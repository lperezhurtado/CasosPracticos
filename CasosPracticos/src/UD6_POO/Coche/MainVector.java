
package UD6_POO.Coche;

import UD6_POO.Coche.Coche.seguro;
import UD6_POO.Coche.Coche.tipo;
import java.util.Scanner;

public class MainVector {
    
    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        Coche[] coches = new Coche[3];
        
        /*coches[0]=new Coche("Audi", "rojo", true, "1234flg",tipo.DEPORTIVO, Coche.seguro.TERCEROS, 2000);
        coches[1]=new Coche("Peugeot","gris",false,"9876asd",tipo.UTILITARIO,Coche.seguro.TODO_RIESGO, 2005);
        coches[2]=new Coche("ford", "negro", false, "5678fgl",tipo.FAMILIAR, Coche.seguro.TERCEROS, 2007);*/
        
        
        for (int i = 0; i < coches.length; i++) {
            lector.nextLine();
            System.out.println("Modelo?");
            String m = lector.nextLine();
            
            System.out.println("Color?");
            String c = lector.nextLine();
            
            System.out.println("Pintura metalizada? (true o false)");
            boolean p = lector.nextBoolean();
            
            System.out.println("Matricula?");
            String mat = lector.nextLine();
            
            System.out.println("Tipo de coche?");
            int tipo;
            tipo=lector.nextInt();
            tipo t=null;
            
            switch (tipo) {
                case 1:
                    t = Coche.tipo.MINI;
                    break;
                case 2:
                    t = Coche.tipo.UTILITARIO;
                    break;
                case 3:
                    t = Coche.tipo.FAMILIAR;
                    break;
                case 4:
                    t = Coche.tipo.DEPORTIVO;
                    break;
            }
            
            System.out.println("Seguro?");
            int tiempo;
            tiempo = lector.nextInt();
            
            seguro s = null;
            switch (tiempo) {
                case 1:
                    s = seguro.TERCEROS;
                    break;
                case 2:
                    s = seguro.TODO_RIESGO;
            }
            
            System.out.println("Año?");
            int año = lector.nextInt();
            
           coches[i]= new Coche(mat, c, p, mat, t, s, año);
           
           lector.nextLine();
        }
        
        for (int i = 0; i < coches.length; i++) {
            coches[i].imprimir();
        }
        
    }

}
