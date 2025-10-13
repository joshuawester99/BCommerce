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

# The build command

Will execute the [Spotify dockerfile plugin](https://github.com/spotify/dockerfile-maven) defined in the pom.xml file.  

This is the first chapter we will have multiple Spring projects that need to be be built and compiled.  Running the above command at the root of the project directory will build all of the projects.  If everything builds successfully you should see a message indicating that the build was successful.

# The Run command

This command will run our services using the docker-compose.yml file located in the /docker directory. 

If everything starts correctly you should see a bunch of Spring Boot information fly by on standard out.  At this point all of the services needed for the chapter code examples will be running.

# Database
You can find the database script as well in the docker directory.