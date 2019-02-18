#!/usr/bin/env groovy

package com.jenkins

class GlobalVars {
   static String foo = "bar"

   // refer to this in a pipeline using:
   //
   // import com.jenkins.GlobalVars
   // println GlobalVars.foo
}
