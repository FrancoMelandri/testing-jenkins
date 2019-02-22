# testing-jenkins



### What is

The aim of this repository is to show how you can build your Jenkins pipeline library using a TDD approach. This can help you during development in order to speed up your code. 

In addition you are able also to verify the code syntax due the fact the project will be build before running test. 

All the code in the pipeline use groovy language

You have to install maven in order to run the test locally



------


### How to use

To launch the test in local environment

```
> nvm clean test
```



If you want to test locally the pipeline test you can run a docker container and then configure jenkins application

```
> docker run \
    --rm \
    -u root \
    -p 8080:8080 \
    -v jenkins-data:/var/jenkins_home \
    -v /var/run/docker.sock:/var/run/docker.sock \
    -v "$HOME":/home \
    jenkinsci/blueocean
```

Goto https://localhost:8080 finish the Jenkins setup wizard and setup the Jobs.

First of all you have to configure a **Global Library** called *testing-jenkins* pointing to the https://github.com/FrancoMelandri/testing-jenkins git repo.

You can define two different Jobs

- **Run** as a pipeline Job that launch the *Jenkinsfile*
- **Build** as a pipeline Job that launche the *Jenkinsfile.c*i to ensure the library compile and build



------


### Additional info

How to build a Jenkins pipeline library

https://jenkins.io/doc/book/pipeline/shared-libraries/#global-shared-libraries

Base test library for Jenkins pipeline code

https://github.com/jenkinsci/JenkinsPipelineUnit


How to launch Jenkins locally and build using maven

https://jenkins.io/doc/tutorials/build-a-java-app-with-maven/

