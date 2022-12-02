# Questions

## Beginner

### CI/CD

<details>
<summary>1. What is meant by Continuous Integration?</summary>

>**Answer:**
>Continuous Integration (CI) is a development practice that requires developers to integrate 
 code into a shared repository several times a day. Each check-in is then verified by an
 automated build, allowing teams to detect problems early.
</details>

<details>
<summary>2. What is continuous delivery?</summary>

>**Answer:**
>Continuous delivery, together with continuous integration makes a complete flow for deliverable
 code packages. In this phase, automated building tools are applied to compile artifacts and have
 them ready to be delivered to the end user. With that in mind, in a CD environment, new releases
 are just one click away from being published with fully functional features and minimal human
 intervention.
</details>

<details>
<summary>3. What is continuous deployment?</summary>

>**Answer:**
>Continuous deployment takes continuous delivery to the next level by having new changes in code
 integrated and delivered automatically into the release branch. More specifically, as soon as
 the updates passed all stages of the production pipeline, they are deployed directly to the end
 user without human intervention. Thus, to successfully utilize continuous deployment, the
 software artifacts must go through rigorously established automated tests and tools before
 deployed into the production environment.
</details>

### Docker

<details>
<summary>1. What is Docker?</summary>

>**Answer:**
>Docker is a containerization platform which packages your application and all its dependencies together in the
form of containers so as to ensure that your application works seamlessly in any environment, be it development,
test or production. Docker containers, wrap a piece of software in a complete filesystem that contains everything
needed to run: code, runtime, system tools, system libraries, etc. It wraps basically anything that can be
installed on a server. This guarantees that the software will always run the same, regardless of its environment.
</details>

<details>
<summary>2. What is a Docker Container?</summary>

>**Answer:**
>Docker containers include the application and all of its dependencies. It shares the kernel with other containers,
running as isolated processes in user space on the host operating system. Docker containers are not tied to any
specific infrastructure: they run on any computer, on any infrastructure, and in any cloud. Docker containers are
basically runtime instances of Docker images.
</details>

<details>
<summary>3. What is a Dockerfile?</summary>

>**Answer:**
>Docker can build images automatically by reading the instructions from a file called Dockerfile.
A Dockerfile is a text document that contains all the commands a user could call on the command line
to assemble an image. Using docker build, users can create an automated build that executes several
command-line instructions in succession.
The interviewer does not just expect definitions, hence explain how to use a Dockerfile which comes
with experience. Have a look at this tutorial to understand how Dockerfile works.
</details>

<details>
<summary>4. What is a Docker Compose?</summary>

>**Answer:**
>Docker Compose is a YAML file which contains details about the services, networks, and volumes for
setting up the Docker application. So, you can use Docker Compose to create separate containers,
host them and get them to communicate with each other. Each container will expose a port for
communicating with other containers.
</details>

<details>
<summary>5. What are Docker Images?</summary>

>**Answer:**
>Docker image is the source of Docker container. In other words, Docker images are used to create containers.
When a user runs a Docker image, an instance of a container is created. These docker images can be deployed
to any Docker environment.
</details>

<details>
<summary>6. What is Docker Hub?</summary>

>**Answer:**
>Docker images create docker containers. There has to be a registry where these docker images live.
This registry is Docker Hub. Users can pick up images from Docker Hub and use them to create customized
images and containers. Currently, the Docker Hub is the world’s largest public repository of image
containers.
</details>

### Jenkins

<details>
<summary>1. What is Jenkins?</summary>

>**Answer:**
>Jenkins is a continuous integration (CI) tool for real-time testing and reporting of smaller
 builds in a large chunk of code. It is written in Java. It is used because it helps developers
 and testers work in tandem to detect and close defects early in the software development
 lifecycle and encourage automated testing of builds.
</details>

<details>
<summary>2. Can you start Jenkins using command line? How?</summary>

>**Answer:**
>Yes, using jenkins.exe start
</details>

<details>
<summary>3. What is a job in Jenkins?</summary>

>**Answer:**
>A job or build job is a task or step in the entire build process. It could be compiling the
 source code, running unit tests, deploying the application to the web server and so on.
containers.
</details>

<details>

<summary>4. How can you create a job?</summary>

>**Answer:**
>On the dashboard page, you can just select a ‘New Job’. When you create a job, you can choose
 options such as the SCM, triggers to control, the build script and notifications.
</details>

### Gilab

<details>
<summary>1. What Is Gitlab?</summary>

>**Answer:**
>GitLab is an internet utility tool to assist with visualizing and handling your git tasks. GitLab includes Git
 repository control, code evaluations, trouble tracking, wikis, and greater. Collaborate with your group using
 issues, milestones, and line-via-line code overview or view activity streams of tasks or the humans you
 figure with.
>Git and GitLab are here to help with managing tasks, merging development among special people, with exclusive time zones and giving Sealed Air the potential to control all of its supply code in 1 place.
</details>

## Intermediate

### CI/CD process

<details>
<summary>1. What are the benefits of CI/CD?</summary>

>**Answer:**
>The combination of CI and CD unifies all code changes into one single repository and runs them
 through automated tests, thus fully develop the product throughout all phases and have it ready
 for deployment at all times. 
>CI/CD enables organizations to roll out product updates as quickly, efficiently, and
 automatically as their customers expect them to be. 
>In short, a well-planned and well-executed CI/CD pipeline accelerates the release rate and
 reliability while mitigating the code changes and defects of your product. This will eventually
 result in much higher customer satisfaction.
</details>

### Docker

<details>
<summary>1. What is virtualization and containerization? Difference between them?</summary>

>**Answer:**
>Virtualization is the process of creating a software-based, virtual version of something
(compute storage, servers, application, etc.). These virtual versions or environments are
created from a single physical hardware system. Virtualization lets you split one system
into many different sections which act like separate, distinct individual systems. A software
called Hypervisor makes this kind of splitting possible. The virtual environment created b
y the hypervisor is called Virtual Machine.
>As for containerization let's see at an example. Usually, in the software development process,
code developed on one machine might not work perfectly fine on any other machine because of
the dependencies. This problem was solved by the containerization concept. So basically,
an application that is being developed and deployed is bundled and wrapped together with all
its configuration files and dependencies. This bundle is called a container.
Now when you wish to run the application on another system, the container is deployed which
will give a bug-free environment as all the dependencies and libraries are wrapped together.
Most famous containerization environments are Docker and Kubernetes.
>Containers provide an isolated environment for running the application. The entire user space
is explicitly dedicated to the application. Any changes made inside the container is never
reflected on the host or even other containers running on the same host. Containers are an
abstraction of the application layer. Each container is a different application. Whereas in 
Virtualization, hypervisors provide an entire virtual machine to the guest(including Kernal).
Virtual machines are an abstraction of the hardware layer. Each VM is a physical machine.
</details>

### Jenkins

<details>
<summary>1. What are the advantages of using Jenkins?</summary>

>**Answer:**
> Advantages of Jenkins are:
>* Provides great collaboration between development and operations team, making it into a single DevOps team
>* Code errors can be detected as early as possible.
>* Code deployment is easy and happens in minutes, along with the generation of reports.
>* Automation of integration work, thereby reducing the number of integration issues.
</details>

<details>
<summary>2. Give some important plugins in Jenkins.</summary>

>**Answer:**
>Basic plugins are the following, e.g:
>* Maven 2
>* Gits
>* Amazon EC2
>* Join
>* Copy artifact
>* Green Balls
>* HTML Publisher
</details>

<details>
<summary>3. How to create a build job in Jenkins?.</summary>

>**Answer:**
>The simple steps are:
>* Click on New Item on the Dashboard.
>* Select the freestyle project option
>* Specify the details of the job like SCM, build triggers, advanced options etc…
>* It is important to specify the location of files that should be built.
>* Once all the settings are marked, click on ‘Add build step’ and select the appropriate
   option. For example, if you want to build a file, select the file name along with the
   build command.
>* Click on Build now for saving the build and doing a test run.
</details>

<details>
<summary>4. What is meant by Jenkins pipeline?.</summary>

>**Answer:**
>A pipeline is a group of interlinked jobs done one after the other in a sequence.
 To integrate and implement continuous delivery pipelines, Jenkins pipelines provides
 a combination of plugins. The instructions to be performed are given through code.
</details>

<details>
<summary>5. What are the types of pipelines in Jenkins?</summary>

>**Answer:**
>There are 3 types:
>1) CI CD pipeline (Continuous Integration Continuous Delivery)
>2) Scripted pipeline
>3) Declarative pipeline
</details>

<details>
<summary>5. What is Jenkins Blue Ocean?</summary>

>**Answer:**
>Blue Ocean is a modern UI for Jenkins, which helps in a personalized experience with modern design.
 Through this interface, any user can create, diagnose and visualize Continuous Delivery pipelines.
 It doesn’t need technical skills to create or understand the pipelines as everything is visually presented.
 Also, detection of automation problems is easy as each step can be easily navigated.

### Gitlab

<details>
<summary>1. What is Gitlab Runner?.</summary>

>**Answer:**
>GitLab Runner is an application that works with GitLab CI/CD to run jobs in a pipeline.
>GitLab Runner is open-source and written in Go. It can be run as a single binary;
 no language-specific requirements are needed.
</details>

<details>
<summary>2. How to configure Gitlab Runner?</summary>

>**Answer:**
>It is possible to configure the runner by editing the config.toml file. This is a file
 that is installed during the runner installation process.
>In this file you can edit settings for a specific runner, or for all runners.
</details>

## Advanced

### Docker

<details>
<summary>1. What is the lifecycle of a Docker Container?</summary>

>**Answer:**
>Docker containers have the following lifecycle:
>
>* Create a container
>* Run the container
>* Pause the container(optional)
>* Un-pause the container(optional)
>* Start the container
>* Stop the container
>* Restart the container
>* Kill the container
>* Destroy the container
</details>

<details>
<summary>2. How many containers can run per host?</summary>

>**Answer:**
>There can be as many containers as you wish per host. Docker does not put any restrictions on it.
 But you need to consider every container needs storage space, CPU and memory which the hardware
 needs to support. You also need to consider the application size. Containers are considered to be
 lightweight but very dependant on the host OS.
</details>

<details>
<summary>3. Is it possible to use JSON instead of YAML for my compose file in Docker?</summary>

>**Answer:**
>It is possible to use JSON instead of YAML for your compose file, to use JSON file with compose,
 specify the JSON filename to use, for example:
>
> $ docker-compose -f docker-compose.json up
</details>

### Jenkins

<details>
<summary>1. What is DSL Jenkins?</summary>

>**Answer:**
>Jenkins DSL (Domain Specific Language) is a plugin through which jobs can be defined in a
> programmatic manner which is human readable. Through this plugin, the UI configurations
> are intuitively translated into code. That way, you can create a version for the job and
> also maintain the history of the changes. The converted code is in a Groovy-based language.
</details>

<details>
<summary>2. Explain the process of creating the Multibranch Pipeline in Jenkins?</summary>

>**Answer:**
>The process is as follows:
>* Open the Jenkins dashboard and create a new item by clicking on ‘new item’ from the top left menu.
>* Enter your project name and from the options shown, select ‘Multibranch pipeline’ and click on OK.
>* Then you should select the repository location, branch source (GitHub/Bitbucket), and add the
   credentials of the branch source.
>* Save the project.
>* Jenkins automatically creates new Multibranch Pipelines for repositories that have branches and
   pulls requests containing Jenkins files.
>* To connect to the GitHub repo, we need the HookURL. Get this URL from the repository settings.
>* Add this HookURL to the Webhooks section.
>* Once the jobs are created, build is automatically triggered by Jenkins.
</details>
