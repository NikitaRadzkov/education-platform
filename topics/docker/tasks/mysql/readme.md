# MySQl Container

## Short Description

Manage MySQL container.

## Estimation (h)

4

## Topics

* Containerization
* Docker Basics
  * Images
  * Containers
* Docker Hub

## Technologies

* Docker

## Requirements

1. Download image `mysql` from Docker Hub.
2. Run a `mysql`.
3. Run it `--detach` (or `-d`), name it with `--name`.
4. `mysql` should listen on `3306:3306`.
5. When running `mysql`, use the `--env` option (or `-e`) to pass in `MYSQL_RANDOM_ROOT_PASSWORD=yes`.
6. Use `docker container logs` on `mysql` to find random password it created on startup.
7. Clean it up.
8. Ensure that everything is correct before and after clean up.
