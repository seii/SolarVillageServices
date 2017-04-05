# SolarVillageServices
This repository contains the necessary code to build and deploy mock REST services for a theoretical consulting engagement which uses Red Hat BPMS software. The theoretical company is named "Solar Village", and these services mock a hypothetical external government API which would allow the creation, status query, and deletion of solar panel permits.

### Pre-Requisites
- Java (version 7 or higher preferred)
- Maven
- Git
- Java Application Server (use of Red Hat EAP will be assumed in these instructions)

### What do I do with this project?
In order to build and deploy the project automatically, a basic Linux script (`kickstart.sh`) has been provided. This script will need to be run with a single parameter - the location of the base EAP folder.

##### Example:
`./kickstart.sh /opt/jboss/eap`

### Building manually
Clone the repository locally and run `mvn clean install`. A WAR file named `bpmspoc.war` will be produced in the `target/` directory.

### Installing manually
Once the WAR file has been built, simply deploy it to your Java application server (such as Red Hat EAP).

### API
The REST service, once installed, exposes the following endpoints:

- [GET] `/bpmspoc/rest/query/status/electrical/<permit ID>`
  - Get the status of the electrical permit query with the identifier `<permit ID>`
- [GET] `/bpmspoc/rest/query/status/structural/<permit ID>`
  - Get the status of the structural permit query with the identifier `<permit ID>`
- [POST] `/bpmspoc/rest/query/create/electrical/<permit ID>`
  - Create a request for a new electrical permit with the identifier `<permit ID>`
- [POST] `/bpmspoc/rest/query/create/structural/<permit ID>`
  - Create a request for a new structural permit with the identifier `<permit ID>`
- [DELETE] `/bpmspoc/rest/query/rescind/electrical/<permit ID>`
  - Delete a request for an electrical permit with the identifier `<permit ID>`
- [DELETE] `/bpmspoc/rest/query/rescind/structural/<name>`
  - Delete a request for a structural permit with the identifier `<permit ID>`
