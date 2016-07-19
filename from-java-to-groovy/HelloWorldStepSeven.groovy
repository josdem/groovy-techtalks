/*
   1. Groovy supports Scripting style
   2. You can short System.out.println to println
   3. Parenthesis are optional in there are at least one parameter
 */

class HelloWorld {
  def name

  def sayHello() {
    "Hello ${name}!"
  }
}

def helloWorld = new HelloWorld(name:'josdem')
println helloWorld.sayHello()
