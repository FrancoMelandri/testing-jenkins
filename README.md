# testing-jenkins

### What is

The aim of this repository is to show how you can build your Jenkins pipeline library using a TDD approach. This can help you during development in order to speed up your code. 

In addition you are able also to verify the code syntax due the fact the project will be build before running test. 

All the code in the pipeline use groovy language

You have to install maven in order to run the test locally




### How to use

To launch the test in local environment

```
> nvm clean test
```



If you want to test locally the pipeline test you can run a docker container and then configure jenkins application

```
> docker run -p 8080:8080 jenkins
```




### Additional info

How to build a Jenkins pipeline library

https://jenkins.io/doc/book/pipeline/shared-libraries/#global-shared-libraries



Base test library fro Jenkins pipeline code

https://github.com/jenkinsci/JenkinsPipelineUnit



