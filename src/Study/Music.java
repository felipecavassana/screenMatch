package Study;

public class Music {
    String title;
    String artist;
    int yearRelease;
    double ratingSum;
    int totalRating;

    void showInfo(){
        System.out.println("Music: "+ title);
        System.out.println("Artist: "+ artist);
        System.out.println("Year of release: "+ yearRelease);
        System.out.println("Rating: "+ calculateRatingMedia());
    }

    void evaluateMusic(double rating){
        ratingSum += rating;
        totalRating++;
    }

    double calculateRatingMedia() {
        return ratingSum/totalRating;
    }
}
