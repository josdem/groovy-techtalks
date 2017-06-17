class Owner {
  def closure = {
    assert this.class.name == 'Owner'
    assert delegate.class.name == 'Owner'
    def nestedClosure = {
      assert owner.class.name == 'Owner$_closure1'
    }
    nestedClosure()
  }
}

def closure = new Owner().closure
closure()
