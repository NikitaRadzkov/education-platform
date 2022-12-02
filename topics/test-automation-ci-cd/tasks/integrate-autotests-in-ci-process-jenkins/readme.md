# Integrate autotests in ci process using Jenkins

## Short Description

Pack autotests in Docker and integrate in CI process using Docker.

## Estimation (h)

8

## Topics

* Docker, Docker-compose
* Parallel tests
* Jenkins

## Requirements

* Pack your tests in docker containers.
* Using Docker Compose make at list 2 Docker containers and setup them to be possible to run them in parallel.
* Install Jenkins (e.g. locally or using a separate Docker container) and create a new node as a local machine.
* Configure a job (single or a few) to run docker containers with tests in parallel. Jobs should configure the project,
  run tests and public Allure test results.
