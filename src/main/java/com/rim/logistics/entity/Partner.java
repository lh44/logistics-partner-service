package com.rim.logistics.entity;

public enum Partner {
  BLUE_DART("blue-dart"), DHL("dhl");

  private final String name;

  Partner(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
}
