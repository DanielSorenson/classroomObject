class Main {
  public static void main(String[] args) {

    Projector b = new Projector();
    Projector a = new Projector(8);
    Projector c = new Projector(2, false, false);

    Box m = new Box("brown", true, true);
    Projector q = new Projector(m);

  

    a.turnOn();
    b.turnOn();
    c.turnOn();

    a.hdmi("My Pc");
    b.hdmi("My iPhone");
    c.hdmi("Apple TV");

    a.lowerOrHigher(2);
    b.lowerOrHigher(-2);
    c.lowerOrHigher(2);

    a.turnOff();
    b.turnOff();
    c.turnOff();

    q.projectorWithBox();
  }
}
