public class Bautura {

    private String nume;
    private int stoc;
    private double pret;


    public Bautura(String nume, int stoc, double pret) {
        this.nume = nume;
        this.stoc = stoc;
        this.pret = pret;
    }

    public Bautura (Bautura b){
        this.nume = b.nume;
        this.stoc = b.stoc;
        this.pret = b.pret;
    }

    @Override
    public String toString() {
        return "Bautura{" +
                "nume='" + nume + '\'' +
                ", stoc=" + stoc +
                ", pret=" + pret +
                '}';
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getStoc() {
        return stoc;
    }

    public void setStoc(int stoc) {
        this.stoc = stoc;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }
}
