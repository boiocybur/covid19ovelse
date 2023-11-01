public class Covid19Data {
    private String Region;
    private String Aldersgruppe;
    private int bekræftedeTilfælde;
    private int døde;
    private int IndlagtePåIntensivAfdeling;
    private String Dato;

    public Covid19Data(String region, String aldersgruppe, int bekræftedeTilfælde, int døde, int indlagtePåIntensivAfdeling, String dato) {
        this.Region = region;
        this.Aldersgruppe = aldersgruppe;
        this.bekræftedeTilfælde = bekræftedeTilfælde;
        this.døde = døde;
        this.IndlagtePåIntensivAfdeling = indlagtePåIntensivAfdeling;
        this.Dato = dato;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        Region = region;
    }

    public String getAldersgruppe() {
        return Aldersgruppe;
    }

    public void setAldersgruppe(String aldersgruppe) {
        Aldersgruppe = aldersgruppe;
    }

    public int getBekræftedeTilfælde() {
        return bekræftedeTilfælde;
    }

    public void setBekræftedeTilfælde(int bekræftedeTilfælde) {
        this.bekræftedeTilfælde = bekræftedeTilfælde;
    }

    public int getDøde() {
        return døde;
    }

    public void setDøde(int døde) {
        this.døde = døde;
    }

    public int getIndlagtePåIntensivAfdeling() {
        return IndlagtePåIntensivAfdeling;
    }

    public void setIndlagtePåIntensivAfdeling(int indlagtePåIntensivAfdeling) {
        IndlagtePåIntensivAfdeling = indlagtePåIntensivAfdeling;
    }

    public String getDato() {
        return Dato;
    }

    public void setDato(String dato) {
        Dato = dato;
    }

    @Override
    public String toString() {
        return "Covid19Data{" +
                "Region='" + Region + '\'' +
                ", Aldersgruppe='" + Aldersgruppe + '\'' +
                ", bekræftedeTilfælde=" + bekræftedeTilfælde +
                ", døde=" + døde +
                ", IndlagtePåIntensivAfdeling=" + IndlagtePåIntensivAfdeling +
                ", Dato='" + Dato + '\'' +
                '}';
    }
}