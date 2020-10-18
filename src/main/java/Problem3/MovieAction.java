package Problem3;

public class MovieAction extends Movie {

    private int lateFeePerDayInDollar = 5;

    public MovieAction(String rating, String title) {
        super(rating, title);
    }

    public MovieAction(MovieAction anotherMovie) {
        super(anotherMovie);
    }

    @Override
    public int getLateFeeInDollar() {
        return lateFeePerDayInDollar;
    }

    @Override
    public int calcLateFees(int numOfDaysPastDue) {
        if(numOfDaysPastDue < 5){                               //if days late is less than 5
            if(numOfDaysPastDue <= 0){                          //if not late, no fee
                return 0;
            }else {                                             //if late, fee
                return numOfDaysPastDue * lateFeePerDayInDollar;
            }
        }else{                                                  //if over 5 days late
            return 2 * numOfDaysPastDue * lateFeePerDayInDollar;
        }
    }
}
