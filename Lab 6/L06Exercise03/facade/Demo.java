import java.util.ArrayList;
import java.util.List;

public class Demo {

  public static void main(String[] args) {
    show();
  }

  public static void show() {

    var oauth = new OAuth();
    var requestToken = oauth.requestToken("appKey", "secret");
    var accessToken = oauth.getAccessToken(requestToken);

    var twitterClient = new TwitterClient();

    

    Tweet firstTweet = new Tweet("Hello World"); 
    twitterClient.addTweet(firstTweet); 

    Tweet secondTweet = new Tweet("IF YOU DONT VOTE FOR ************* YOU ARE STUPID "); 
    twitterClient.addTweet(secondTweet); 
    
    ArrayList<Tweet> tweets = twitterClient.getRecentTweets(accessToken);

    for(var tweetElement : tweets)
    {
      System.out.println(tweetElement.getTweet());
    }
  }
}
