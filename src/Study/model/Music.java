package Study.model;

public class Music {
    public String title;
    public String artist;
    public int yearRelease;
    public double ratingSum;
    public int totalRating;

    public void showInfo(){
        System.out.println("Music: "+ title);
        System.out.println("Artist: "+ artist);
        System.out.println("Year of release: "+ yearRelease);
        System.out.println("Rating: "+ calculateRatingMedia());
    }

    public void evaluateMusic(double rating){
        ratingSum += rating;
        totalRating++;
    }

    double calculateRatingMedia() {
        return ratingSum/totalRating;
    }
}
