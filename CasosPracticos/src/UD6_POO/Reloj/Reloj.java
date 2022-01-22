
package UD6_POO.Reloj;

public class Reloj {
    
    private int hora;
    private int minuto;
    private int segundo;
    
    //constructores
    public Reloj(){
        hora = 0;
        minuto = 0;
        segundo = 0;
    }
    
    public Reloj (int hora,int minuto, int segundo){
        if(hora<0||hora>24||minuto<0||minuto>60||segundo<0||segundo>60){
            System.out.println("Hora no valida");
        }
        else{
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
        }
    }
    
    //setters
    public void setHora(int hora){
        if(hora>=0 && hora<24)
            this.hora = hora;
        else
            System.out.println("Hora no válida");
    }
    
    public void setMinuto(int minuto){
        if(minuto>=0 && minuto<=59)
            this.minuto = minuto;
        else
            System.out.println("Minuto no válido");
    }
    
    public void setSegundo(int segundo){
        if(segundo>=0 && segundo<=59)
            this.segundo = segundo;
        else
            System.out.println("Segundo no válido");
    }
    
    public void setReloj(int hora,int minuto,int segundo){
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }
    
    
    //getters
    public int getHora(){
        return hora;
    }
    public int getMinuto(){
        return minuto;
    }
    public int getSegundo(){
        return segundo;
    }
    
    public String dimeHora(){
        
        String ptos = ":";
        String h = String.valueOf(this.hora);
        String m = String.valueOf(this.minuto);
        String s = String.valueOf(this.segundo);
        
        String hora24 = h+ ptos + m + ptos + s;
        return hora24;
    }
    
    public String dimehora12(){
        String hora12;
        String ptos = ":";
        String h = String.valueOf(this.hora);
        String m = String.valueOf(this.minuto);
        String s = String.valueOf(this.segundo);
        
        if(hora>=0 && hora <=12){
            String am = "am";
            hora12 = h+am + ptos + m + ptos + s;
        }
        else{
            hora-=12;
            h = String.valueOf(this.hora);
            String pm = "pm";
            hora12 = h+pm + ptos + m + ptos + s;
        }
        return hora12;
    }
    
    public void tick(){
        
        segundo++;
        if (segundo == 60) {
            segundo = 0;
            minuto++;
        }
        if (minuto == 60) {
            minuto = 0;
            hora++;
        }
        if (hora == 24) {
            hora = 0;
        }  
    }
    
    public void tick(int s){
        for (int i = 0; i < s; i++) {
            segundo++;
           if (segundo == 60) {
                segundo = 0;
                minuto++;
            }
            if (minuto == 60) {
                minuto = 0;
                hora++;
            }
            if (hora == 24) {
                hora = 0;
            } 
        }  
    }
    
    //metodos imprime
    public void imprimeHora(){
        System.out.println(dimeHora());
    }
    
    public void imprimeHora12(){
        System.out.println(dimehora12());  
    }
     
}
