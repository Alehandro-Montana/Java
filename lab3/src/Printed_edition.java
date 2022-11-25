public class Printed_edition {

    private String name;
    private int maxseries;
    
    public void setName(String named){
        name=named;
    }
    public void setMaxseries(int series){
        maxseries=series;
    }
    public int getMaxseries(){
        return maxseries;
    }
    public String getName(){
        return name;
    }

    public  Printed_edition(){  //конструктор класса без параметров
        name="Без названия";
        maxseries=0;
    }
    public  Printed_edition(String named, int series){  //конструктор класса с параметрами
        name=named;
        maxseries=series;

    }

}
