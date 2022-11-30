import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] array="Lore impsulm imput termo centrum coletoman mankote".split(" ");
        String symbol ="#"; //символ на который заменяем
        int p=5;
//у кожному слові k-ю букву замінити заданим символом.Якщо k більше довжини слова,коригування не виконувати
        for(int i=0;i<array.length;i++){
            if(array[i].length()>=p){
                array[i]=array[i].substring(0,p-1)+symbol+array[i].substring(p);
            }
        }
        System.out.println(String.join(" ",array));


    }
}





