public class Persone {
    private String nominativi;
    private int punteggi;

    public Persone() {}

    public Persone(String nominativi, int punteggi){
        this.nominativi=nominativi;
        this.punteggi=punteggi;
    }

    public Persone (Persone p){
        this.nominativi=p.nominativi;
        this.punteggi=p.punteggi;
    }

    public String getNominatini(){
        return nominativi;
    }
    public void setNominativi(){
        this.nominativi=nominativi;
    }
    public int getPunteggi(){
        return punteggi;
    }
    public void setPunteggi(){
        this.punteggi=punteggi;
    }

    public String toString(){
        String s="";
        s= "Nominatino: " + nominativi + "Punteggi: " + punteggi;
    }


}
