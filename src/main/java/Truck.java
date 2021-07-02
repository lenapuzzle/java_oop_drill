public class Truck extends Automobile {

  private int bedLengthFeet;
  private int bedWidthFeet;
  private int containerHeightFeet;
  private int currentLoadCubicFeet;

  public Truck(String type, String model, String make, int mpg, int fuelCapacity, int bedLengthFeet,
      int bedWidthFeet) {
    super(type, model, make, mpg, fuelCapacity);
    this.bedLengthFeet = bedLengthFeet;
    this.bedWidthFeet = bedWidthFeet;
    this.setRunning(false);
    this.currentLoadCubicFeet = 0;
    this.containerHeightFeet = 3;

  }

  public Truck(String type, String model, String make, int mpg, int fuelCapacity, int bedLengthFeet,
      int bedWidthFeet, int containerHeightFeet) {
    super(type, model, make, mpg, fuelCapacity);
    this.bedLengthFeet = bedLengthFeet;
    this.bedWidthFeet = bedWidthFeet;
    this.setRunning(false);
    this.currentLoadCubicFeet = 0;
    this.containerHeightFeet = containerHeightFeet;
  }

  public int getBedLengthFeet() {
    return bedLengthFeet;
  }

  public int getBedWidthFeet() {
    return bedWidthFeet;
  }

  public int getContainerHeightFeet() {
    return containerHeightFeet;
  }

  public int getCurrentLoadCubicFeet() {
    return currentLoadCubicFeet;
  }


  public int volumeCapacity() {
    return this.bedLengthFeet * this.bedWidthFeet * this.containerHeightFeet;
  }

  public boolean addCargo(int addedLoad) {
    if (currentLoadCubicFeet + addedLoad <= volumeCapacity()) {
      currentLoadCubicFeet += addedLoad;
      return true;
    }  else {
      return false;
    }
  }

  public void setCurrentLoadCubicFeet(int currentLoadCubicFeet) {
    this.currentLoadCubicFeet = currentLoadCubicFeet;
  }

  public void emptyCargo() {
    this.setCurrentLoadCubicFeet(0);
  }
}