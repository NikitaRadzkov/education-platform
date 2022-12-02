# Test Automation CI/CD

## Version

1.0.0

## Introduction

After this course a trainee will be familiar with Continuous Integration/Continuous Delivering processes and will have
practice with setup Jenkins tool.

## Table of Contents

* [Tasks](./tasks/readme.md)
* [Questions](./questions/readme.md)

## Topics

### Beginner

* CI/CD fundamentals
* Docker
  * Docker Installation
  * Docker Container
  * Dockerfile
  * Docker Compose
  * Docker Images
  * Docker hub
* Jenkins
  * Jenkins Installation
  * Start Jenkins server
  * Jenkins job
* Gitlab fundamentals

### Intermediate

* CI/CD pros and cons
* Docker
  * Virtualization and Containerization
  * Manipulating containers with docker client
  * Docker Compose with multiple local containers
* Jenkins
  * Using Jenkins
  * Jenkins nodes
  * Jenkins pipeline and its types
  * Jenkins Blue Ocean mode
* Gitlab
  * Gitlab runner
  * Configuration of Gitlab Runner

### Advanced

* Docker
  * Lifecycle of a Docker Container
  * Building a Multi-Container app.
  * Different configuration formats - YAML, json
* Jenkins
  * Managing Jenkins
  * DSL Jenkins
  * Multibranch Pipeline
  * Securing Jenkins

## Prerequisites

### Technical

* Before fulfilling practical tasks from current container a number of auto tests should be prepared.

### Environment

* Windows or Linux OS
* Experience of working with command line/console

## Plan

| Name                                                                                                                                               | Type          | Short Description                                                                  | Level        | Required | Estimation (h) |
| -------------------------------------------------------------------------------------------------------------------------------------------------- | ------------- | ---------------------------------------------------------------------------------- | ------------ | -------- | -------------- |
| [A Simple Guide to Understanding Continuous Integration (CI)](https://www.nutcache.com/blog/simple-guide-understanding-continuous-integration-ci/) | article       | Read about CI and CD processes.                                                    | beginner     | required | 0.5            |
| [Continuous integration - IBM Cloud Education](https://www.ibm.com/cloud/learn/continuous-integration)                                             | article       | IBM vision of continuous integration, a software development and DevOps practice   | beginner     | required | 0.5            |
| [Docker - official guide](https://docs.docker.com/get-started/)                                                                                    | documentation | Official Jenkins documentation.                                                    | intermediate | required | 3              |
| [100 Best Docker Tutorials](https://www.aquasec.com/cloud-native-academy/docker-container/100-best-docker-tutorials/)                              | article       | IBM vision of continuous integration, a software development and DevOps practice   | beginner     | required | 0.5            |
| [Jenkins Handbook](https://www.jenkins.io/doc/book/)                                                                                               | documentation | Official Jenkins documentation.                                                    | intermediate | required | 3              |
| [What Is Jenkins?](https://www.youtube.com/watch?v=LFDrDnKPOTg)                                                                                    | video         | What Is Jenkins? What Is Jenkins And How It Works? Jenkins Tutorial For Beginners. | beginner     | required | 0.5            |
| [Complete Jenkins Pipeline Tutorial](https://www.youtube.com/watch?v=7KCS70sCoK0)                                                                  | video         | Complete Jenkins Pipeline Tutorial. Jenkinsfile explained.                         | intermediate | required | 0.5            |
| [GitLab CI/CD](https://docs.gitlab.com/ee/ci/README.html)                                                                                          | documentation | Official Gitlab CI/CD documentation.                                               | intermediate | required | 2              |
| [GitLab CI: Run jobs sequentially, in parallel or build a custom pipeline](https://about.gitlab.com/blog/2016/07/29/the-basics-of-gitlab-ci/)      | article       | Setup CI processes using Gitlab.                                                   | intermediate | optional | 0.5            |
| [Gitlab Runner](https://docs.gitlab.com/runner/)                                                                                                   | documentation | Official Gitlab Runner documentation                     .                         | intermediate | optional | 0.5            |
| [Jenkins+Docker](https://medium.com/swlh/build-your-first-automated-test-integration-with-pytest-jenkins-and-docker-ec738ec43955)                  | article       | Build your first Automated Test Integration with pytest, Jenkins and Docker.       | intermediate | optional | 2              |
| [Integrate autotests in ci process using Gitlab](./tasks/integrate-autotests-in-ci-process-gitlab/readme.md)                                       | task          | Pack autotests in Docker and integrate in CI process using Gitlab                  | intermediate | required | 8              |
| [Integrate autotests in ci process using Jenkins](./tasks/integrate-autotests-in-ci-process-jenkins/readme.md)                                     | task          | Pack autotests in Docker and integrate in CI process using Jenkins                 | intermediate | required | 8              |
