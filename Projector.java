class Projector{


  private int height;
  private boolean isOn;
  private boolean isConnected;
  private Box newBox;



  public Projector(){
    height = 4;
    isOn = false;
    isConnected = false;
  }


  public Projector(Box newBox){
    this.newBox = newBox;
  }
  public Projector(int height){
    this.height = height;
    isOn = false;
    isConnected = false;
  }

    public Projector(int height, boolean isOne, boolean isConnected){

    
    this.height = height;
      this.isOn = isOn;
      this.isConnected = isConnected;
  }


  public void turnOn(){

    isOn = true;
    System.out.println("The projector is now on");

  }

    public void turnOff(){

    isOn = false;
    System.out.println("The projector is now off");

  }

  public void hdmi(String device){

    if(isOn = true){
      isConnected = true;
      System.out.println("Your projector is now connected via  hdmi to your " + device);
    }
    else{
      System.out.println("Please turn your projector on before attempting to connect");
    }
  }

  public void lowerOrHigher(int change){

    height +=change;
    System.out.println("The height of your projector is now " + height + " meters");

  }

  public void projectorWithBox(){
    if (newBox != null){
      System.out.println("There is a box on top of my projector. Its dimensions are: \n" + newBox);
  } 
    else{
      System.out.println("You need to place a box on the projector");
    }

}
}

