import services.TrendingService;
import models.Hashtag;

public class Main {
    public static void main(String[] args) {
        TrendingService tracker = new TrendingService();

        // Simulate incoming hashtags
        String[] hashtags = {"#java", "#python", "#java", "#dsa", "#python", "#java", "#algo"};

        for (String tag : hashtags) {
            tracker.addHashtag(tag);
        }

        System.out.println("Top 3 Trending Hashtags:");
        for (Hashtag trend : tracker.getTopTrending()) {
            System.out.println(trend.getName() + " (" + trend.getCount() + " mentions)");
        }
    }
}