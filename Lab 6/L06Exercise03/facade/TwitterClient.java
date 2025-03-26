

import java.util.ArrayList;
import java.util.List;

public class TwitterClient {

  private ArrayList<Tweet> myList = new ArrayList<Tweet>(); 


  public ArrayList<Tweet> getRecentTweets(String accessToken) {
    System.out.println("Getting recent tweets");

    return myList;
  }

  public void addTweet(Tweet tweet){

    myList.add(tweet); 
  }

}
