public class Covid19Data {
    private String region;
    private String ageGroup;
    private int confirmedCases;
    private int deaths;
    private int intensiveCare;
    private String Dato;

    public Covid19Data(String region, String ageGroup, int confirmedCases, int deaths, int intensiveCare, String dato) {
        this.region = region;
        this.ageGroup = ageGroup;
        this.confirmedCases = confirmedCases;
        this.deaths = deaths;
        this.intensiveCare = intensiveCare;
        this.Dato = dato;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getAgeGroup() {
        return ageGroup;
    }

    public void setAgeGroup(String ageGroup) {
        this.ageGroup = ageGroup;
    }

    public int getConfirmedCases() {
        return confirmedCases;
    }

    public void setConfirmedCases(int confirmedCases) {
        this.confirmedCases = confirmedCases;
    }

    public int getDeaths() {
        return deaths;
    }

    public void setDeaths(int deaths) {
        this.deaths = deaths;
    }

    public int getIntensiveCare() {
        return intensiveCare;
    }

    public void setIntensiveCare(int intensiveCare) {
        this.intensiveCare = intensiveCare;
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
                "Region='" + region + '\'' +
                ", Aldersgruppe='" + ageGroup + '\'' +
                ", bekræftedeTilfælde=" + confirmedCases +
                ", døde=" + deaths +
                ", IndlagtePåIntensivAfdeling=" + intensiveCare +
                ", Dato='" + Dato + '\'' +
                '}';
    }
}