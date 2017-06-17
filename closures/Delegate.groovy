class FirstClass {
  String myString = 'I am first class'
}

class SecondClass {
  String myString = 'I am second class'
}

class MainClass {
  def closure = {
    return myString
  }
}

def closure = new MainClass().closure
closure.delegate = new FirstClass()
assert closure() == 'I am first class'
