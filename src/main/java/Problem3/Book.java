package Problem3;

import java.util.UUID;

public abstract class Book implements StoreMediaOperations {
    UUID id;
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.id = UUID.randomUUID();
    }

    // copy constructor
    public Book(Book anotherBook) {             //void return type not needed for copy constructor
        this.title = anotherBook.title;
        this.author = anotherBook.author;
        this.id = anotherBook.id;
    }

    @Override
    public boolean equals(Object obj) {
        Book other = (Book)obj;             //Object parameter to Book object

        if(this.id == other.id){            //if the id's are the same, they are equal
            return true;
        }else{                              //if not, they are not equal
            return false;
        }
    }
}
