public class HelloWorld {

  private String name;

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  public String sayHello() {
    return "Hello " + this.name + "!";
  }

  public static void main(String[] args) {
    HelloWorld helloWorld = new HelloWorld();
    helloWorld.setName("josdem");
    System.out.println(helloWorld.sayHello());
  }
}
