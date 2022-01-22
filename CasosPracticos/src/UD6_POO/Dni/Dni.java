
package UD6_POO.Dni;

public class Dni {
    
    private int dni;
    
    
    public Dni newRandomDNI(){
        dni = (int)(11111111 + Math.random() * (99999999 - 11111111 + 1));
        Dni Dni = new Dni();
        return Dni;
        
    }
    public void setDni(int dni){
        this.dni = dni;
    }
    
    public int getDni(){
        return dni;
    }
    
    public char getLetra(){
        int resto = dni % 23;
        char letra = ' ' ;
        switch(resto){
            case 0:
                letra = 'T';
                break;
            case 1:
                letra = 'R';
                break;
            case 2:
                letra = 'W';
                break;
            case 3:
                letra = 'A';
                break;
            case 4:
                letra = 'G';
                break;
            case 5:
                letra = 'M';
                break;
            case 6:
                letra = 'Y';
                break;
            case 7:
                letra = 'F';
                break;
            case 8:
                letra = 'P'; 
                break;
            case 9:
                letra = 'D';   
                break;
            case 10:
                letra = 'X';  
                break;
            case 11:
                letra = 'B';  
                break;
            case 12:
                letra = 'N';
                break;
            case 13:
                letra = 'J';
                break;
            case 14:
                letra = 'Z';
                break;
            case 15:
                letra = 'S';
                break;
            case 16:
                letra = 'Q';
                break;
            case 17:
                letra = 'V';
                break;
            case 18:
                letra = 'H';
                break;
            case 19:
                letra = 'L';
                break;
            case 20:
                letra = 'C';
                break;
            case 21:
                letra = 'K';
                break;
            case 22:
                letra = 'E';
                break;
        }
        return letra;  
    }
    
    public String getNIF(){
        String nif = String.valueOf(getDni()+ String.valueOf(getLetra()));
        
        return nif;
    }
    
    public void imprime(){
        System.out.println(getNIF());
    }
    
}
