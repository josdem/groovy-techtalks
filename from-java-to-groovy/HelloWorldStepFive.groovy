/*
  In Groovy the return keyword is optional, and the return value is the last expresion in a context (function)
*/

class HelloWorld {
  def name

  def sayHello() {
    "Hello ${name}!"
  }

  static void main(def args) {
    def helloWorld = new HelloWorld()
    helloWorld.setName("josdem")
    System.out.println(helloWorld.sayHello())
  }
}
