package com.jos.dem.expando

class MetaExpando {

  private dynamicProps = [:]

  void setProperty(String propName, val){
    dynamicProps[propName] = val
  }

  def getProperty(String propName){
    dynamicProps[propName]
  }

  def methodMissing(String methodName, args) {
    def prop = dynamicProps[methodName]
    if (prop instanceof Closure){
      return prop(*args)
    }
  }

}
