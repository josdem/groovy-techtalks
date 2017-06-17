String.metaClass.doSomething = {
  println "I'm doing something"
}

name = "josdem"
name.doSomething()
