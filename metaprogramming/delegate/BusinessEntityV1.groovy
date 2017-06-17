def names = []

class BusinessEntity {
  String rfc
}

def be = new BusinessEntity(rfc:'rfc')
String name = 'Jose Luis'
String lastName = 'De la Cruz Morales'

be.appendName(name)
be.appendName(lastName)

assert names == ['Jose Luis', 'De la Cruz Morales']
