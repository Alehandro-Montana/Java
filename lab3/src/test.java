public class test {
    public static void main(String[] args){
        Book_Shop mybshop = new Book_Shop();
        Book mybook1=new Book("Monte-Kristo",100,"roman",300);
        mybshop.addBook(mybook1);
        mybshop.addBook(new Book("Maugli",140,"skazka",320));
        Magazine mymag = new Magazine("TIME",150,"colon",220);
        mybshop.addBook(mymag);
        mybshop.printBook();
        if(mybshop.findBook(mybook1)){
            System.out.println("есть книги");
        }
        else{
            System.out.println("нет книги");
        }
        if(mybshop.findBook(mymag)){
            System.out.println("есть журнал");
        }
        else{
            System.out.println("нет журнала");
        }

    }
}
