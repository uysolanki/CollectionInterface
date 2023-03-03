import java.util.*;  
class Book implements Comparable<Book>{  
int id;  
String name,author,publisher;  
int quantity;
  
public Book(int id, String name, String author, String publisher, int quantity) {  
    this.id = id;  
    this.name = name;  
    this.author = author;  
    this.publisher = publisher;  
    this.quantity = quantity;  
}  
/*public int compareTo(Book b) {  
    if(quantity<b.quantity){  
        return 1;  
    }else if(quantity>b.quantity){  
        return -1;  
    }else{  
    return 0;  
    }  
}*/  

public int compareTo(Book b) {  
    return(quantity-b.quantity);
}  

}  
public class PriorityQueueDemo {  
public static void main(String[] args) {  
    Queue<Book> queue=new PriorityQueue<Book>();  
    //Creating Books  
    Book b1=new Book(121,"Let us C","Yashwant Kanetkar","BPB",6);  
    Book b2=new Book(233,"Operating System","Galvin","Wiley",8);  
	Book b4=new Book(887,"RDBMS","Galvin","Wiley",35);  
    Book b3=new Book(101,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
    //Adding Books to the queue  
    queue.add(b1);  
    queue.add(b2);  
    queue.add(b3);  
	queue.add(b4);
    System.out.println("Traversing the queue elements:");  
    //Traversing queue elements  
    for(Book b:queue){  
    System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
    }  
    queue.remove();  
    System.out.println("After removing one book record:");  
    for(Book b:queue){  
        System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
        }  
}  
}  