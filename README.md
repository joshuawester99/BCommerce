## BCommerce

# Contents
1.  A Spring Cloud Config server that is deployed as Docker container and can manage a services configuration information using a file system/ classpath or GitHub-based repository.
2.  A user service that will manage users as a part of the BCommerce application.
3.  A cart service that aggregates items for purchase by a user.
4.  A catalog service that tracks and updates item quantities as they are bought and sold. 
5.  A Postgres SQL database used to hold the data.

## Initial Configuration
1.	Apache Maven (http://maven.apache.org)
2.  Java Version 11
3.  Docker (https://www.docker.com/products/docker-desktop)

## How To Use

Before attempting to run this application, ensure Docker Desktop is open on your computer.

```bash
# To build the docker image, open a CLI and
# navigate to the BCommerce root directory. 
# Type and run the following:
$ mvn clean package dockerfile:build

# Still in the root directory, run the following,
# which will use docker-compose to launch the image.  
$ docker-compose -f docker/docker-compose.yml up
```