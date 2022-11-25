public class Book extends Printed_edition {
    private String genre;
    private int numstr;

    public Book(){
        super();
        genre="";
        numstr=100;
    }

    public Book(String named, int series, String rod, int n){
        super(named,series);
        genre=rod;
        numstr=n;
    }
    public void SetGenre(String rod){
        genre=rod;
    }

    public String getGenre(){
        return genre;
    }
    public void SetNumstr(int n){
        numstr=n;
    }
    public int getNumstr(){
        return numstr;
    }
    public String toString(){
        return getName()+" "+getNumstr()+" "+genre+" "+numstr+" ";
    }
}