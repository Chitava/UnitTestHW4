import BockService.Book;
import BockService.InMemoryBookRepository;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        InMemoryBookRepository repository = new InMemoryBookRepository();
        Iterator iter = repository.findAll().listIterator();
        while (iter.hasNext()){
            System.out.println(iter.next().toString());
        }
    }}