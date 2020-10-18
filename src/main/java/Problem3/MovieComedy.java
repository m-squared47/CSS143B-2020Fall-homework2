package Problem3;

public class MovieComedy extends Movie {
    private int lateFeePerDayInDollar = 3;

    public MovieComedy(String rating, String title) {
        super(rating, title);
    }

    public MovieComedy(MovieComedy anotherMovie) {
        super(anotherMovie);
    }

    @Override
    public int getLateFeeInDollar() {
        return lateFeePerDayInDollar;
    }

    @Override
    public int calcLateFees(int numOfDaysPastDue) {
        if(numOfDaysPastDue > 0) {                              //if late, fee
            return numOfDaysPastDue * lateFeePerDayInDollar;
        }else{                                                  //if not late, no fee
            return 0;
        }
    }
}
