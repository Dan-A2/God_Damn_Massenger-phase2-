package org.openjfx.event;

import org.openjfx.models.User;

public class Follow_UnfollowEvent {

    private User user1;
    private User user2;

    public Follow_UnfollowEvent(User user1, User user2) {
        this.user1 = user1;
        this.user2 = user2;
    }

    public User getUser1() {
        return user1;
    }

    public User getUser2() {
        return user2;
    }
}