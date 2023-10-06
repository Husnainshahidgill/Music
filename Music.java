public class Music {

    private String mName;
    private int duration;
    private String mAlbum;
    private Date mfc ;
    private String genre;
    //private String artist;
    private Artist art;



    public Music(String mName, int duration, String mAlbum, Date mfc, String genre, Artist art) {
        this.mName = mName;
        this.art = art;
        this.duration = duration;
        this.mAlbum = mAlbum;
        this.mfc = mfc;
        this.genre = genre;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public Artist getArt() {
        return art;
    }

    public void setArt(Artist art) {
        this.art = art;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getmAlbum() {
        return mAlbum;
    }

    public void setmAlbum(String mAlbum) {
        this.mAlbum = mAlbum;
    }

    public Date getMfc() {
        return mfc;
    }

    public void setMfc(Date mfc) {
        this.mfc = mfc;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    public String toString(){
        String Print = String.format("Title: %s, Date: %s , Duration: %d, Genre: %s,Album: %s, Artist: %s,",mName,mfc.addDate(),duration,genre,mAlbum,art.addArt());
        return Print;
    }
    public boolean equals(Music m1){
        return this.mName.equals(m1.mName)?true:false;
    }
}
