def names = []

class BusinessEntity {
  String rfc
}

BusinessEntity.metaClass.appendName = { value -> names.add(value) }

def be = new BusinessEntity(rfc:'rfc')
String name = 'Jose Luis'
String lastName = 'De la Cruz Morales'

be.appendName(name)
be.appendName(lastName)

assert names == ['Jose Luis', 'De la Cruz Morales']
