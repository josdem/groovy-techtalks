/*
  Groovy introduces placeholder using the dollar sign to specify a variable inside in a doube quoted string
*/

class HelloWorld {
  def name

  def sayHello() {
    return "Hello ${name}!"
  }

  static void main(def args) {
    def helloWorld = new HelloWorld()
    helloWorld.setName("josdem")
    System.out.println(helloWorld.sayHello())
  }
}
