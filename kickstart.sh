#!/bin/bash

echo '--- Downloading GitHub repository via HTTPS ---'
git clone https://github.com/seii/SolarVillageServices.git

echo '--- Building WAR file ---'
cd SolarVillageServices
mvn clean install

echo '--- Copying WAR file to provided EAP deployments directory ---'
cp target/bpmspoc.war $1/deployments/

echo '--- Script complete! ---'
