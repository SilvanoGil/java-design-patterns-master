package com.pronoide.event;

import com.pronoide.framework.Event;

public abstract class AbstractEvent implements Event {

  public Class<? extends Event> getType() {
    return getClass();
  }
}