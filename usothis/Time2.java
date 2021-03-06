package usothis;

public class Time2 {

    private int hour;
    private int minute;
    private int second;

    public Time2() {

        this(0, 0, 0); //invocar o método do construtor so é permitido
//se for a 1º instrução após declaração do construtor. Aqui os 4 construtores invocam 5. É feito p evitar que repetimos o cod de validação em cada construtor
    }

    public Time2(int hour) {
        this(hour, 0, 0); // construtor só c hora, ai minuto e segundo são inicializados com 0
    }

    public Time2(int hour, int minute) {
        this(hour, minute, 0);
    }

    public Time2(Time2 time) {

        this(time.getHour(), time.getMinute(), time.getSecond());
    }

    public Time2(int hour, int minute, int second) {

        if (hour < 0 || hour >= 24) {
            throw new IllegalArgumentException("A hora deve estar na faixa 0-23");
        }

        if (minute < 0 || minute >= 60) {
            throw new IllegalArgumentException("Os minutos devem estar na faixa 0-59");
        }

        if (second < 0 || second >= 60) {
            throw new IllegalArgumentException("Os segundos devem estar na faixa 0-59");
        }

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {
        
        if (hour < 0 || hour >= 24) {
            throw new IllegalArgumentException("A hora deve estar na faixa 0-23");
        }

        if (minute < 0 || minute >= 60) {
            throw new IllegalArgumentException("Os minutos devem estar na faixa 0-59");
        }

        if (second < 0 || second >= 60) {
            throw new IllegalArgumentException("Os segundos devem estar na faixa 0-59");
        }

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setHour(int hour) {
        
        if (hour < 0 || hour >= 24) {
            throw new IllegalArgumentException("A hora deve estar na faixa 0-23");
        }
        this.hour = hour;
    }

    public void setMinute(int minute) {
        
        if (minute < 0 || minute >= 60) {
            throw new IllegalArgumentException("Os minutos devem estar na faixa 0-59");
        }
        this.minute = minute;
    }

    public void setSecond(int second) {
        
        if (second < 0 || second >= 60) {
            throw new IllegalArgumentException("Os segundos devem estar na faixa 0-59");
        }

        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public String toUniversalString() {
        
        return String.format(
                "%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }

    public String toString() {
        
        return String.format("%d:%02d:%02d %s",
                ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
                getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
    }
}

/*Quando um objeto de uma classe contém uma referência a um outro objeto da mesma classe, o primeiro objeto pode acessar todos os dados e métodos do segundo objeto, incluindo os privates*/
 /*Sempre use a arquitetura set e get, pq se acessarmos as var diretamente*/
