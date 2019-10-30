package com.company;

public interface Chicken {
    void cluck();
}

class Hen implements Chicken{

  @Override
  public void cluck() {
    System.out.println("Hen Cluck");
  }
}