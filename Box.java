public class Box {
  private boolean isFull;
  private boolean isOpen;
  private String color;

  public Box(){
    color = "white"; 
    isFull = false;
    isOpen = false;

  }
  public Box(String color){
    this.color = color;
    isFull = false;
    isOpen = false;
  }

  public Box(String color, boolean isOpen, boolean isFull){
    this.color = color;
    this.isOpen = isOpen;
    this.isFull = isFull;
  }
  public void open(){
    isOpen = true; 
    System.out.println("The tissue box is now open.");
  }

  public void close(){
    isOpen = false;
    System.out.println("The tissue box is closed now. ");
  }
  public void tellColor(){
    System.out.println("Your color is: " + color);
  }
  public void changeColor(String paint){
    color = paint;
    System.out.println("Your color is now: " + color);
  }
  @Override
  public String toString(){
    return "Color: " + color + ", Is it open?: " + isOpen + ", Is it full? " + isFull;
 
      }
  }

  