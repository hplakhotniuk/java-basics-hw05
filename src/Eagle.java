public class Eagle extends FlyingBird{
  // TODO fix class declaration
  public Eagle() {
    Zoo.birds.add(this);
  }
  // TODO override toString method by returning a string with the class name
  @Override
  public String toString() {
    return this.getClass().getName();
  }
}
