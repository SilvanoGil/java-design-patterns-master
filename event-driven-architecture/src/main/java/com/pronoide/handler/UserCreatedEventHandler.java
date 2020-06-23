package com.pronoide.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.pronoide.event.UserCreatedEvent;
import com.pronoide.framework.Handler;

public class UserCreatedEventHandler implements Handler<UserCreatedEvent> {

  private static final Logger LOGGER = LoggerFactory.getLogger(UserCreatedEventHandler.class);

  @Override
  public void onEvent(UserCreatedEvent event) {
    LOGGER.info("User '{}' has been Created!", event.getUser().getUsername());
  }

}
