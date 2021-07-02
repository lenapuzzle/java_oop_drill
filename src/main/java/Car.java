public class Car extends Automobile {

  private int capacity;
  private int numPassengers;

  public Car(String type, String model, String make, int mpg, int fuelCapacity, int capacity,
      int numPassengers) {
    super(type, model, make, mpg, fuelCapacity);
    this.capacity = capacity;
    this.numPassengers = numPassengers;
    this.setRunning(false);
  }

  public int getCapacity() {
    return capacity;
  }

  public int getNumPassengers() {
    return numPassengers;
  }

  public boolean addPassengers(int newPassengers) {
    if (numPassengers + newPassengers <= capacity) {
      numPassengers += newPassengers;
      return true;
    } else {
      return false;
    }
  }

  public void exitPassengers(int exitingNumPassengers) {
    if(numPassengers - exitingNumPassengers > 0) {
      numPassengers -= exitingNumPassengers;
    } else {
      numPassengers = 0;
    }
  }
}

