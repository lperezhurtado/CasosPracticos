
package UD6_POO.Dni;

public class MainVector {
    
    public static void main(String[] args) {
        
        Dni[] DNIs = new Dni[10000];
        
        int a = 0,e = 0,i = 0,o = 0,u = 0;
        for (int j = 0; j < DNIs.length; j++) {
            
            DNIs[j] = new Dni();
            DNIs[j].newRandomDNI();
            DNIs[j].imprime();
            
            switch (DNIs[j].getLetra()) {
                case 'A':
                    a++;
                    break;
                case 'E':
                    e++;
                    break;
                case 'I':
                    i++;
                    break;
                case 'O':
                    o++;
                    break;
                case 'U':
                    u++;
                    break;
            }
                
        }
        System.out.println(a +" DNIS con la letra A");
        System.out.println(e +" DNIS con la letra E");
        System.out.println(i +" DNIS con la letra I");
        System.out.println(o +" DNIS con la letra O");
        System.out.println(u +" DNIS con la letra U");
    }
        
       
}

