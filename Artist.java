public class Artist {

    private String name;
    private String nationality;
    private int rank;

    public Artist(String name, String nationality, int rank) {
        this.name = name;
        this.nationality = nationality;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String addArt(){
        String print = String.format("%s/%s/%d",name,nationality,rank);
        return print;
    }
}
