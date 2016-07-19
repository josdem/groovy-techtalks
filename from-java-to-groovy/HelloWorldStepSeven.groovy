/*
   1. Groovy supports Scripting style
   2. You can short System.out.println to println
 */

class HelloWorld {
  def name

  def sayHello() {
    "Hello ${name}!"
  }
}

def helloWorld = new HelloWorld(name:'josdem')
println(helloWorld.sayHello())
