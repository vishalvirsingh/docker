# Docker
Running Elasticsearch in a docker container

## Pre-requisites:
1. Linux OS
2. Docker version 1.13.1, build 7f2769b/1.13.1


## Steps for creating a Elasticsearch containers
1. Create a DockerFile which will create a Elasticsearch docker image ( refer elasticsearchdockerfile)
2. Build docker image by running following command where your DockerFile is present. (Here is at the root of Project)
   ```bash
   docker build -f elasticsearchdockerfile -t elasticsearch .
   ```
3. For verifying if image is created, type in following command
   ```bash
   docker images
   ```
4. Run created image by running following command
   ```bash
   docker run -p 9200:9200 elasticsearch
   ```

