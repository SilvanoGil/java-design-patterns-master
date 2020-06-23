package com.pronoide;

import com.pronoide.event.UserCreatedEvent;
import com.pronoide.event.UserUpdatedEvent;
import com.pronoide.framework.EventDispatcher;
import com.pronoide.handler.UserCreatedEventHandler;
import com.pronoide.handler.UserUpdatedEventHandler;
import com.pronoide.model.User;

public class App {

  public static void main(String[] args) {

    var dispatcher = new EventDispatcher();
    dispatcher.registerHandler(UserCreatedEvent.class, new UserCreatedEventHandler());
    dispatcher.registerHandler(UserUpdatedEvent.class, new UserUpdatedEventHandler());

    var user = new User("pronoide");
    dispatcher.dispatch(new UserCreatedEvent(user));
    dispatcher.dispatch(new UserUpdatedEvent(user));
  }

}
