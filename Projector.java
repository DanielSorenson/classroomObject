class Projector{


  private int height;
  private boolean isOn;
  private boolean isConnected;



  public Projector(){
    height = 4;
    isOn = false;
    isConnected = false;
  }

  public Projector(int height){
    this.height = height;
    isOn = false;
    isConnected = false;
  }

    public Projector(int height, boolean isOn, boolean isConnected){

    
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
  
  public String toString(){
    
    return "Height: " + height + "\nIs it on: " + isOn + "\nIs is connected: " + isConnected;

}
