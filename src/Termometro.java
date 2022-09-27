public class Termometro {

    private Integer temperatura;

    public Termometro(Integer temperatura) {
        this.temperatura = temperatura;
    }

    public Integer getTemperatura() {
        return temperatura;
    }

    public boolean medirTemperatura (){
        if (getTemperatura() < 98) return false;
        return true;
    }
}
