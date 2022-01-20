public class Reloj {

    // ATRIBUTOS
    private int hora;
    private int minutos;
    private int segundos;

    // CONSTRUCTOR
    public Reloj(int hora, int minutos, int segundos) {
        setHora(hora);
        setMinutos(minutos);
        setSegundos(segundos);
    }

    // GETTERS
    public int getHora() {
        return hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    // SETTERS
    public void setHora(int hora) {
        if (hora >= 0 && hora <= 23) {
            this.hora = hora;
        } else {
            System.err.println("ERROR: hora no válida");
        }
    }

    public void setMinutos(int minutos) {
        if (minutos >= 0 && minutos <= 59) {
            this.minutos = minutos;
        } else {
            System.err.println("ERROR: minutos no válido");
        }
    }

    public void setSegundos(int segundos) {
        if (segundos >= 0 && segundos <= 59) {
            this.segundos = segundos;
        } else {
            System.err.println("ERROR: segundos no válido");
        }
    }

    public void setReloj(int hora, int minutos, int segundos) {
        setHora(hora);
        setMinutos(minutos);
        setSegundos(segundos);
    }

    // OTROS MÉTODOS
    public String dimeHora() {
        return (hora + ":" + minutos + ":" + segundos);
    }

    public String dimeHora12() {
        if (hora < 12) {
            return (hora + ":" + minutos + ":" + segundos + " AM");
        } else {
            return ((hora - 12) + ":" + minutos + ":" + segundos + " PM");
        }
    }

    public void imprimeHora() {
        System.out.println(dimeHora());
    }

    public void imprimeHora12() {
        System.out.println(dimeHora12());
    }
    
    public void tick() {
        segundos++;
        if (segundos == 60) {
            segundos = 0;
            minutos++;
        }
        if (minutos == 60) {
            minutos = 0;
            hora = (hora + 1) % 24;
        }
    }
}
