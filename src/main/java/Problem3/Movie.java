package Problem3;

import java.util.UUID;

public abstract class Movie implements StoreMediaOperations {
    String rating;
    String title;
    UUID id;

    public Movie(String rating, String title) {     //constructor
        this.id = UUID.randomUUID();
        this.rating = rating;
        this.title = title;
    }

    public Movie(Movie anotherMovie) {             //copy constructor
        this.rating = anotherMovie.rating;
        this.title = anotherMovie.title;
        this.id = anotherMovie.id;
    }

    @Override
    public boolean equals(Object obj) {
        Movie other = (Movie)obj;       //Object parameter to Movie object

        if(this.id == other.id){        //if the id's are the same, they are equal
            return true;
        }else{                          //if not, they are not equal
            return false;
        }
    }
}
