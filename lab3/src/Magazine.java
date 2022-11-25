import java.util.Scanner;

public class Magazine extends Printed_edition {
    private String genre;
    private int tiraj;

    public Magazine(String named, int series, String theme, int n){
        super(named, series);
        genre=theme;
        tiraj=n;

    }
    public Magazine(){
        super();
        genre="";
        tiraj=0;
    }
    public void SetGenre(String theme){
        genre=theme;
    }
    public String getGenre(){
        return genre;
    }
    public void setTiraj(int n){
        tiraj=n;
    }
    public int getTiraj(){
        return tiraj;
    }
public void setAllInfo(){
        Scanner in =new Scanner(System.in);
        System.out.print("Введитте название обложки:");
        String nazv=in.next();
        setName(nazv);
        System.out.print("Введите макс.колво стр.");
        int s=in.nextInt();
        setMaxseries(s);
        System.out.print("Введите жанр книги:");
        genre=in.next();
        System.out.print("Введите кол-во тиража:");
        tiraj=in.nextInt();
        System.out.println();
}
public String toString(){
        return "\n\tЖурнал"+"\n\t"+"Название:"+getName()+"\n\t"+"Max series:"+getMaxseries()+"\n\t"+"genre:"
                +genre+"\n\t"+"Tiraj:"+tiraj+"\n";
}
}
