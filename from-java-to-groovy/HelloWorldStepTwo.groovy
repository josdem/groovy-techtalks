/*
  Since Groovy has methods public, there is not necessary to specify set and get
*/

class HelloWorld {
  String name

  String sayHello() {
    return "Hello " + this.name + "!"
  }

  static void main(String[] args) {
    HelloWorld helloWorld = new HelloWorld()
    helloWorld.setName("josdem")
    System.out.println(helloWorld.sayHello())
  }
}
