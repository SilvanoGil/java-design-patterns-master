package com.pronoide.framework;

public interface Handler<E extends Event> {

  void onEvent(E event);
}
