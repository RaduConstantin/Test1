import java.util.ArrayList;

public class Lactat extends Aliment implements Manipulare{

    public final String dataExpirare;
    public final String numeProducator;

    ArrayList<Bautura> lactateDeBaut = new ArrayList<>();


    public void AddToList(Bautura bautura){
        lactateDeBaut.add(bautura);
        System.out.println(lactateDeBaut.toString());
    }


    @Override
    public double ValoareStoc(int stoc, double pret) {
        return stoc*pret;
    }

    public Lactat(String nume, int stoc, double pret, String dataExpirare, String numeProducator) {
        super(nume, stoc, pret);
        this.dataExpirare = dataExpirare;
        this.numeProducator = numeProducator;
    }


    @Override
    public String MutaIn(String loc) {
        return loc;
    }

    @Override
    public String toString() {
        return "Lactat{" +
                "dataExpirare='" + dataExpirare + '\'' +
                ", numeProducator='" + numeProducator + '\'' +
                ", lactateDeBaut=" + lactateDeBaut +
                '}';
    }

    public String getDataExpirare() {
        return dataExpirare;
    }

    public String getNumeProducator() {
        return numeProducator;
    }

    public ArrayList<Bautura> getLactateDeBaut() {
        return lactateDeBaut;
    }

    public void setLactateDeBaut(ArrayList<Bautura> lactateDeBaut) {
        this.lactateDeBaut = lactateDeBaut;
    }

    @Override
    public int compareTo(Aliment o) {
        return 0;
    }
}
