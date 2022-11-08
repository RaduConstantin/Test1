import java.util.Comparator;

public abstract class Aliment implements Comparable<Aliment>{

    private String nume;
    private int stoc;
    private double pret;


    public abstract double ValoareStoc(int stoc, double pret);

    public Aliment(String nume, int stoc, double pret) {
        this.nume = nume;
        this.stoc = stoc;
        this.pret = pret;
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

    @Override
    public String toString() {
        return "Aliment{" +
                "nume='" + nume + '\'' +
                ", stoc=" + stoc +
                ", pret=" + pret +
                '}';
    }



    public int compareTo(Aliment b){
        return Comparator.comparing(Aliment::getNume)
                .thenComparingDouble(Aliment::getPret)
                .thenComparingInt(Aliment::getStoc)
                .compare(this, b);

    }

    ///nu sunt sigur ca CompareTo se implementeaza asa

}
