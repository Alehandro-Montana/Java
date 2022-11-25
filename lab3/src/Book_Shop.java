import java.util.ArrayList;

public class Book_Shop {
    private ArrayList<Printed_edition> masBook=new ArrayList<Printed_edition>();//massiv s knigami i magazine

    public void addBook(Printed_edition m){  //method dobavleniyz book in massive
        masBook.add(m);
    }

    public Book_Shop(){

    }
    public Boolean findBook(Printed_edition m){  //выяснение есть ли в магазине книги
        return masBook.contains(m);
    }
    public Book_Shop(ArrayList<Printed_edition> n){
        masBook=n;
    }

    public void printBook(){
        System.out.println("В магазине:");
        for(Printed_edition a:masBook){
            if(a instanceof Book){
                System.out.println("Это книга(проверка");
            }
        }
        for (Printed_edition a:masBook){
            if(a instanceof Magazine){
                System.out.println("Это журнал(проверка)");
            }
        }
    }
}
