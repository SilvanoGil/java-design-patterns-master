package com.pronoide.framework;

public interface Event {

  Class<? extends Event> getType();
}
