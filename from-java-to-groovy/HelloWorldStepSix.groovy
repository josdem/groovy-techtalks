/*
  The POJO (POGO in Groovy) has a constructor that accepts a Map so you can initialize an object with a map
*/

class HelloWorld {
  def name

  def sayHello() {
    "Hello ${name}!"
  }

  static void main(def args) {
    def helloWorld = new HelloWorld(name:'josdem')
    System.out.println(helloWorld.sayHello())
  }
}
