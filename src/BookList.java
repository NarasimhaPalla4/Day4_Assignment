import java.util.*;
public class BookList {
    public static void main(String[] args) {
        HashMap<Integer,String> book = new HashMap<>();
        String inputBook;
        Scanner s = new Scanner(System.in);
        book.put(101,"Wings Of Fire");
        book.put(102,"Garuda Purana");
        book.put(103,"Bhagavad Gita");
        book.put(104,"Lord of the Kings");
        book.put(105,"A Tale of Two Cities");
        System.out.println("BookList: ");
        for(Map.Entry<Integer,String> iterator: book.entrySet())
        {
            System.out.println(iterator.getKey()+" "+iterator.getValue());
        }

        inputBook=s.nextLine();
        float price=100;
        if(book.containsValue(inputBook)){
            System.out.println("Price of the book: "+price);
        }
        else{
            System.out.println("This book is currently Out of stock");
        }
    }
}
