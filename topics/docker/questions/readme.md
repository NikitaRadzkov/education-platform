# Interview Questions

## Beginner

<details>
<summary>1. What is Docker?</summary>

>**Answer:**
>An open-source project that automates the deployment of software applications inside containers by
>providing an additional layer of abstraction and automation of OS-level virtualization on Linux.
>
>Docker is a tool that allows developers, sys-admins etc. to easily deploy their applications in a
>sandbox (called containers) to run on the host operating system i.e. Linux.
</details>

<details>
<summary>2. List the main benefits of Docker?</summary>

>**Answer:**
>
>* Flexible: Even the most complex applications can be containerized.
>* Lightweight: Containers leverage and share the host kernel.
>* Interchangeable: You can deploy updates and upgrades on-the-fly.
>* Portable: You can build locally, deploy to the cloud, and run anywhere.
>* Scalable: You can increase and automatically distribute container replicas.
>* Stackable: You can stack services vertically and on-the-fly.
>
</details>

<details>
<summary>3. What are the components of Docker Architecture and explain?</summary>

>**Answer:**
>The Docker works on client-server architecture. The Docker client establishes communication with
the Docker Daemon. The Docker client and Daemon can run on the same system. A Docket client can
also be connected to a remote Docker Daemon. The different types of Docker components in a
Docker architecture are:
>
>* Docker Client: This performs Docker build pull and run operations to establish communication with
the Docker Host. The Docker command uses Docker API to call the queries to be run.
>* Docker Host: This component contains Docker Daemon, Containers and its images. The images will
be the kind of metadata for the applications which are containerized in the containers. The Docker
Daemon establishes a connection with Registry.
>* Registry: This component will be storing the Docker images. The public registries are Docker Hub
and Docker Cloud which can be s used by anyone.

</details>

<details>
<summary>4. What is virtualization?</summary>

>**Answer:**
>Virtualization is the process of creating a software-based, virtual version of something(compute storage,
>servers, application, etc.). These virtual versions or environments are created from a single physical
>hardware system. Virtualization lets you split one system into many different sections which act like
>separate, distinct individual systems. A software called Hypervisor makes this kind of splitting possible.
>The virtual environment created by the hypervisor is called Virtual Machine.
</details>

<details>
<summary>5. What is containerization?</summary>

>**Answer:**
>Usually, in the software development process, code developed on one machine might not work perfectly
>fine on any other machine because of the dependencies. This problem was solved by the containerization
>concept. So basically, an application that is being developed and deployed is bundled and wrapped together
>with all its configuration files and dependencies. This bundle is called a container. Now when you wish
>to run the application on another system, the container is deployed which will give a bug-free environment
>as all the dependencies and libraries are wrapped together. Most famous containerization environments
>are Docker and Kubernetes.
</details>

<details>
<summary>6. Difference between virtualization and containerization</summary>

>**Answer:**
>Containers provide an isolated environment for running the application. The entire user space is explicitly
>dedicated to the application. Any changes made inside the container is never reflected on the host or even
>other containers running on the same host. Containers are an abstraction of the application layer.
>Each container is a different application.
</details>

<details>
<summary>7. What is Docker Image?</summary>

>**Answer:**
>The Docker Image is a set of files and a combination of parameters which will allow creating
>the instances to run in separate containers as an isolated process. The Docker hub is a kind
>of repository to the images where these images can be stored and this access is public.
>The Docker run command can be used to create the instance called container which can be run
>using the Docker image.
</details>

<details>
<summary>8. What is Docker Container?</summary>

>**Answer:**
>A Docker Container is a form of encapsulation to the application which holds all the dependencies
>which share the kernel with other containers in the duration of running the isolated processes
>on the host operating system. A Docker container can be created by creating a Docker image. These
>Docker images can be run after that using Docker commands. Docker containers are the instances of
>the Docker images at the runtime. Docker images can be stored in any public hosts or private hosts
>like Docker hub. Docker Image is a set of files which can be run in an isolated process.
</details>

<details>
<summary>9. What is Docker Hub?</summary>

>**Answer:**
>Docker hub is the largest public repository of the image containers which is being maintained
>by the community of developers and individual contributors.
</details>

<details>
<summary>10. What is a Docker Registry?</summary>

>**Answer:**
>A Docker Registry is a place where all the Docker Images will be stored and Docker Cloud and
>Docker Hub are the public registries where these images can be hosted upon. The Docker hub
>is the default storage for the Docker Images. An own registry can also be set up as per the
>requirement. Docker Data Center (DDC) can also be used which includes DTR (Docker Trusted Registry).
>Docker store will provide the feature of buying and selling the Docker images.
</details>

<details>
<summary>11. What is Dockerfile?</summary>

>**Answer:**
>Docker can build images automatically by reading the instructions from a Dockerfile. A Dockerfile is a
>text document that contains all the commands a user could call on the command line to assemble an image.
>Using docker build users can create an automated build that executes several command-line instructions
>in succession.
</details>

<details>
<summary>12. What does Dockerfile define?</summary>

>**Answer:**
>Dockerfile defines what goes on in the environment inside your container. Access to resources like
>networking interfaces and disk drives is virtualized inside this environment, which is isolated from
>the rest of your system, so you need to map ports to the outside world, and be specific about what
>files you want to “copy in” to that environment.
</details>

<details>
<summary>13. How to build a Dockerfile?</summary>

>**Answer:**
>Once you’ve written a Dockerfile, you need to build it to create an image with those specifications.
>Use the following command to build a Dockerfile:

```shell
docker build <path to docker file>
```

</details>

<details>
<summary>14. How do you create a docker container from an image?</summary>

>**Answer:**
>Pull an image from docker repository with the above command and run it to create a container.
>Use the following command:

```shell
docker run -it -d <image_name>
```

</details>

<details>
<summary>15. How to start, stop and kill a container?</summary>

>**Answer:**
>The following command is used to start a docker container:

```shell
docker start <container_id>
```

>and the following for stopping a running container:

```shell
docker stop <container_id>
```

>kill a container with the following command:

```shell
docker kill <container_id>
```

</details>

<details>
<summary>16. What is docker volumes?</summary>

>**Answer:**
>Volumes: Created and managed by Docker. You can create a volume explicitly using the docker volume create
>command, or Docker can create a volume during container or service creation.
>When you create a volume, it is stored within a directory on the Docker host. When you mount the volume into
>a container, this directory is what is mounted into the container. This is similar to the way that bind
>mounts work, except that volumes are managed by Docker and are isolated from the core functionality of
>the host machine.
>A given volume can be mounted into multiple containers simultaneously. When no running container
is using a volume, the volume is still available to Docker and is not removed automatically.
>You can remove unused volumes using docker volume prune.
>When you mount a volume, it may be named or anonymous. Anonymous volumes are not given an explicit name
>when they are first mounted into a container, so Docker gives them a random name that is guaranteed to be
>unique within a given Docker host. Besides the name, named and anonymous volumes behave in the same ways.
>Volumes also support the use of volume drivers, which allow you to store your data on remote hosts or
>cloud providers, among other possibilities.
</details>

<details>
<summary>17. What is docker bind mounts?</summary>

>**Answer:**
>Bind mounts: Available since the early days of Docker. Bind mounts have limited functionality compared
>to volumes. When you use a bind mount, a file or directory on the host machine is mounted into a container.
>The file or directory is referenced by its full path on the host machine. The file or directory does not
>need to exist on the Docker host already. It is created on demand if it does not yet exist. Bind mounts
>are very performant, but they rely on the host machine’s filesystem having a specific directory structure
>available. If you are developing new Docker applications, consider using named volumes instead. You can’t
>use Docker CLI commands to directly manage bind mounts.
</details>

## Intermediate

<details>
<summary>1. Tell us something about Docker Compose.</summary>

>**Answer:**
>Docker Compose is a YAML file which contains details about the services, networks, and volumes for
>setting up the Docker application. So, you can use Docker Compose to create separate containers,
>host them and get them to communicate with each other. Each container will expose a port for
>communicating with other containers.
</details>

<details>
<summary>2. What is Docker Swarm?</summary>

>**Answer:**
>Docker Swarm is native clustering for Docker. It turns a pool of Docker hosts into a single,
>virtual Docker host. Docker Swarm serves the standard Docker API, any tool that already communicates
>with a Docker daemon can use Swarm to transparently scale to multiple hosts.
</details>

<details>
<summary>3. What is a Docker Namespace?</summary>

>**Answer:**
>A namespace is one of the Linux features and an important concept of containers. Namespace adds a
>layer of isolation in containers. Docker provides various namespaces in order to stay portable and
>not affect the underlying host system. Few namespace types supported by Docker – PID, Mount, IPC, User, Network
</details>

<details>
<summary>4. Do you know why docker system prune is used? What does it do?</summary>

>**Answer:**
>The above command is used to remove all the stopped containers, all the networks that are not used,
>all dangling images and all build caches.
</details>

<details>
<summary>5. Will you lose your data, when a docker container exists?</summary>

>**Answer:**
>No, you won’t lose any data when Docker container exits. Any data that your application writes to the
>container gets preserved on the disk until you explicitly delete the container. The file system for the
>container persists even after the container halts.
</details>

<details>
<summary>6. How is Docker different from other containerization methods?</summary>

>**Answer:**
>Docker containers are very easy to deploy in any cloud platform. It can get more applications running on
>the same hardware when compared to other technologies, it makes it easy for developers to quickly create,
>ready-to-run containerized applications and it makes managing and deploying applications much easier.
>You can even share containers with your applications.
</details>

<details>
<summary>7. Can I use JSON instead of YAML for my compose file in Docker? How to do it?</summary>

>**Answer:**
>You can use JSON instead of YAML for your compose file, to use JSON file with compose, specify the
>JSON filename to use:

```shell
docker-compose -f docker-compose.json up
```

</details>

<details>
<summary>8. How have you used Docker in your previous position?</summary>

>**Answer:**
>Discuss with the candidate.
</details>

<details>
<summary>9. How far do Docker containers scale? Are there any requirements?</summary>

>**Answer:**
>Large web deployments like Google and Twitter and platform providers such as Heroku and dotCloud,
>all run on container technology. Containers can be scaled to hundreds of thousands or even millions
>of them running in parallel. Talking about requirements, containers require the memory and the OS at all the
>times and a way to use this memory efficiently when scaled.
</details>

<details>
<summary>10. How many containers can run per host?</summary>

>**Answer:**
>There can be as many containers as you wish per host. Docker does not put any restrictions on it.
>But you need to consider every container needs storage space, CPU and memory which the hardware needs to
>support. You also need to consider the application size. Containers are considered to be lightweight but
>very dependant on the host OS.
</details>

## Advanced

<details>
<summary>1. How will you monitor Docker in production?</summary>

>**Answer:**
>Docker provides functionalities like docker stats and docker events to monitor docker in production.
>Docker stats provides CPU and memory usage of the container. Docker events provide information about
>the activities taking place in the docker daemon.
</details>

<details>
<summary>2. What changes are expected in your docker compose file while moving it to production?</summary>

>**Answer:**
>These are the following changes you need make to your compose file before migrating your application
>to the production environment:
>
>* Remove volume bindings, so the code stays inside the container and cannot be changed from outside the container.
>* Binding to different ports on the host.
>* Specify a restart policy.
>* Add extra services like log aggregator.
>
</details>

<details>
<summary>3. Are you aware of load balancing across containers and hosts? How does it work?</summary>

>**Answer:**
>While using docker service with multiple containers across different hosts, you come across the need to load
>balance the incoming traffic. Load balancing and HAProxy is basically used to balance the incoming traffic
>across different available(healthy) containers. If one container crashes, another container should automatically
>start running and the traffic should be re-routed to this new running container. Load balancing and
>HAProxy works around this concept.
</details>

<details>
<summary>4. How do you access a running container?</summary>

>**Answer:**

```shell
docker exec -it <container id> bash
```

</details>

<details>
<summary>5. What is the difference between `docker image prune` and `docker system prune`?</summary>

>**Answer:**

```shell
docker image prune
```

>to clean up just "dangling" images

```shell
docker system prune
```

>will clean up everything
</details>

<details>
<summary>6. What is Docker Networking?</summary>

>**Answer:**
>For Docker containers to communicate with each other and the outside world via the host machine,
>there has to be a layer of networking involved. Docker supports different types of networks,
>each fit for certain use cases.
</details>

<details>
<summary>7. Name default docker networks</summary>

>**Answer:**
>
>* bridge - An automatically generated network with a subnet and a gateway.
>* host - Allows a container to attach to the host's network.
>* none - A container-specific network stack that lacks a network interface.
>
</details>

<details>
<summary>8. How to create new bridge network?</summary>

>**Answer:**

```shell
docker network create --driver bridge <network_name>
```

</details>

<details>
<summary>9. How to attach container to network?</summary>

>**Answer:**

```shell
docker network connect <network_name> <container_name>
```

</details>
