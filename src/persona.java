package src;

public class persona {
    int balones = 0;

    public persona(int balones) {
        this.balones = balones;
    }

    public int getBalones() {
        return balones;
    }

    public void setBalones(int balones) {
        this.balones = balones;
    }
    int pelotas = 0;
    int ratones = 0;

    public persona(int pelotas, int ratones) {
        this.pelotas = pelotas;
        this.ratones = ratones;
    }
}
