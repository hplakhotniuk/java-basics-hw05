public class Penguin extends  NonFlyingBird{
  // TODO fix class declaration
  public Penguin() {
    Zoo.birds.add(this);
  }
  // TODO override toString method by returning a string with the class name
  @Override
  public String toString() {
    return this.getClass().getName();
  }
}
