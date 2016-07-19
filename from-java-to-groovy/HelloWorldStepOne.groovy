/*
  1. Every class, method or field in Groovy is public at least you specify that is not.
  2. ; is optional
*/

class HelloWorld {
  private String name

  String getName() {
    return name
  }

  void setName(String name) {
    this.name = name
  }

  String sayHello() {
    return "Hello " + this.name + "!"
  }

  static void main(String[] args) {
    HelloWorld helloWorld = new HelloWorld()
    helloWorld.setName("josdem")
    System.out.println(helloWorld.sayHello())
  }
}
