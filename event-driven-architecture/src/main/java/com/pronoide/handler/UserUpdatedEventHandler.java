package com.pronoide.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.pronoide.event.UserUpdatedEvent;
import com.pronoide.framework.Handler;

public class UserUpdatedEventHandler implements Handler<UserUpdatedEvent> {

  private static final Logger LOGGER = LoggerFactory.getLogger(UserUpdatedEventHandler.class);

  @Override
  public void onEvent(UserUpdatedEvent event) {
    LOGGER.info("User '{}' has been Updated!", event.getUser().getUsername());
  }
}
