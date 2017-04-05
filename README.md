# SolarVillageServices
This repository contains the necessary code to build and deploy mock REST services for a theoretical consulting engagement which uses Red Hat BPMS software. The theoretical company is named "Solar Village", and these services mock a hypothetical external government API which would allow the creation, status query, and deletion of solar panel permits.

### Pre-requisites
- Java (version 7 or higher preferred)
- Maven
- Git
- Java Application Server (Red Hat EAP will be used here)

### What do I do with this project?
In order to build and deploy the project automatically, a basic Linux script (`kickstart.sh`) has been provided. This script will need to be run with a single parameter pointing to the EAP `deployment` folder.

##### Example:
`./kickstart.sh /opt/jboss/eap/standalone/deployments`

### Building manually
Clone the repository locally and run `mvn clean install`. A WAR file named `bpmspoc.war` will be produced in the `target/` directory.

### Installing manually
Once the WAR file has been built, simply deploy it to your Java application server (such as Red Hat EAP).
