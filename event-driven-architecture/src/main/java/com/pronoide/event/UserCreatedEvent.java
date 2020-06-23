package com.pronoide.event;

import com.pronoide.model.User;

public class UserCreatedEvent extends AbstractEvent {

  private User user;

  public UserCreatedEvent(User user) {
    this.user = user;
  }

  public User getUser() {
    return user;
  }
}
