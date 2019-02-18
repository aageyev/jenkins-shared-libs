#!/usr/bin/env groovy

def call(String dockerImagePath = 'ngsnonprod.azurecr.io/ngs-edd-ind-model') {
  echo "getting tags for ${dockerImagePath}."
  return [1,2,3,4,5,6,7,8,9]
}
