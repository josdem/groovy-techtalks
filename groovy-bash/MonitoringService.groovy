#!/usr/bin/env groovy

if("service cron status".execute().text.contains("running")){
  println "Cron service is running"
}
