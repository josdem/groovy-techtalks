/*
  Groovy uses def to specify dynamic typing (DuckTyping) type check is defined at runtime
*/

class HelloWorld {
  def name

  def sayHello() {
    return "Hello " + this.name + "!"
  }

  static void main(def args) {
    def helloWorld = new HelloWorld()
    helloWorld.setName("josdem")
    System.out.println(helloWorld.sayHello())
  }
}
