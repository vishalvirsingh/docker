# Docker
Running Spring boot Applications in docker containers

## Pre-requiaites:
1. Java 8
2. Spring boot 2.1.5
3. Docker version 1.13.1, build 7f2769b/1.13.1
4. Maven


## Steps for running a Spring boot app in containers
1. Create a Spring boot application with Maven/ Gradle build. (Here Maven is used)
2. Create a DockerFile which will create a docker image
3. Build docker image by running following command where your DockerFile is present. (Here is at the root of Project)
   ```bash
   docker build -f DockerFile -t hellodocker .
   ```
4. For verifying if image is created, type in following command
   ```bash
   docker images
   ```
5. Run created image by running following command
   ```bash
   docker run -p 8081:8081 hellodocker
   ```
   
For getting better clarity of above steps, you can see snapshot folder

