package com.jos.dem.expando

import spock.lang.Specification

class MetaExpandoSpec extends Specification {

  void "should test property access"(){
  given:
    def expando = new MetaExpando()
  when:
    expando.town = 'Mexico City'
  then:
    expando.town == 'Mexico City'
  }

  void "should invoke a method does not exist"(){
    given:
      def expando = new MetaExpando()
    when:
      expando.addNumbers = { x, y, z -> x + y + z }
    then:
      100 == expando.addNumbers(30, 20, 50)
  }

}
