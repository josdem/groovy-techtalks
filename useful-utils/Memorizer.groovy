Integer fibonacci(Integer number){
  if(number < 2){
    return 1
  }
  fibonacci(number - 1) + fibonacci(number - 2)
}

Long start = new Date().getTime()
println fibonacci(30)
Long end = new Date().getTime()

println (end - start)
