package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.BuyPredictor;

public class User {
    String userName;
    protected SocialPublisher socialPublisher;

    public User(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public String SharePost(){
        return socialPublisher.share();
    }
    public void setSharingPost(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }
}
