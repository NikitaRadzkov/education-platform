# Integrate autotests in ci process using Gitlab

## Short Description

Pack autotests in Docker and integrate in CI process using Gitlab CI tool

## Estimation (h)

8

## Topics

* Docker, Docker-compose
* Parallel tests
* Gitlab

## Requirements

* Pack your tests in docker containers.
* Using Docker Compose make at list 2 Docker containers and setup them to be possible to run them in parallel.
* Install Gitlab locally or use cloud Gitlab Runner if it is possible making a request for permissions from GitLab
  admins within your company.
* Configure .gitlab-ci.yml for gitlab-runner and set up a pipeline to run tests in parallel.
