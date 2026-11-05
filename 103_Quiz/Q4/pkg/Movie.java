package pkg;



public class Movie{
   
    //global variables
    String movieName;
    public double rating;
    int numRatings;
    int revenue;

    //default constructor
    public Movie(){
        movieName = "Avengers";
        rating = 8.0;
        numRatings = 33;
        revenue = 623357910;
    }

    // constructor with parameters
    public Movie(String name, double ratingRating, int numRatingnum, int profit){
        movieName = name;
        rating = ratingRating;
        numRatings = numRatingnum;
        revenue = profit;
    }

    //movieToString
    public void movieToString(){
        System.out.println("Movie: " + movieName);
        System.out.println("Rating: " + rating);
        System.out.println("Number of Ratings: " + numRatings);
        System.out.println("Revenue: " + revenue);
        System.out.println(" ");
    }

    //get
    public String getMovieName(){
        return movieName;
    }
    public int getRevenue(){
        return revenue;
    }

    //set
    public void addRating(double ratingyay){
        numRatings++;
        rating = ((rating*(numRatings-1))+ratingyay)/numRatings;
    }

    //compareRatings
    public boolean compareRatings(Movie movie){
        if(movie.rating>rating){
            return false;
        }
        else{
            return true;
        }
    }


    //revenuetoString

    //public String revenueToString(){
        
  //  }












}