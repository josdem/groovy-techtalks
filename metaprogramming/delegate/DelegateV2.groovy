closure = {
  append 'one'
  append 'Two'
}

def sb = new StringBuffer()
closure.delegate = sb
closure()

assert "${sb}" == 'oneTwo'
