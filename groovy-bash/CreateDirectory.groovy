#!/usr/bin/env groovy

println "Creating new directory at: ${new Date()}"
"mkdir josdem".execute()
println "ls".execute().text
