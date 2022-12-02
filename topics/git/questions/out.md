# Exam questions

## Stage 1

### Getting started

<details>
<summary>1. How to check if Git installed and how to get help on various Git commands?</summary>

>**Answer:**
> On the terminal/cmd using `git version` command; it will show the installed Git's version. Using command `git help`;
> we can display the list of commands supported by the git. Using `git help %COMMAND_NAME%` we can get the detailed
> information about specific Git command; on windows it will be displayed in the web-browser but on Mac/Linux it
> will be displayed on the terminal itself. Command `git help -a` gives a subcommands list.
</details>

<details>
<summary>2. What is the function of ‘git config’?</summary>

>**Answer:**
> The `git config` command is a convenient way to set configuration options for your Git installation.
> Behavior of a repository, user info, preferences etc. can be defined.

</details>

<details>
<summary>3. What is the process for creating a Git repository?</summary>

>**Answer:**
> If you want to create a repository in Git then you need to run the command `git init`. With this command
> .git repository you can create a directory in the project directory.
</details>

### Git Basics

<details>
<summary>1. What is `git status` is used for?</summary>

>**Answer:**
> `git status` shows you the difference between the working directory and the index.
</details>

<details>
<summary>2. What is `git add` is used for?</summary>

>**Answer:**
>`git add` adds file changes in your existing directory to your index.
</details>

<details>
<summary>3. What is commit message?</summary>

>**Answer:**
> Commit message is a feature of Git which appears when you commit a change. Git provides you a text editor where
> you can enter the modifications made in commits.

</details>

<details>
<summary>4. How do you revert a commit that has already been pushed and made public?</summary>

>**Answer:**
> One or more commits can be reverted through the use of `git revert`. This command, in essence, 
> creates a new commit with patches that cancel out the changes introduced in specific commits. 
> In case the commit that needs to be reverted has already been published or changing the repository history is not an 
> option, `git revert` can be used to revert commits. Running the following command will revert the last two commits:
> `git revert HEAD~2..HEAD`. Alternatively, one can always checkout the state of a particular commit from the past,
> and commit it anew.

</details>

<details>
<summary>5. How can you copy a commit made in one branch to another (e.g. a hot fix commit from released branch to current development branch)?</summary>

>**Answer:**
> You need to use the cherry-pick command. It provides the possibility
> to play back an existing commit to your current location/branch. So
> you need to switch to the target branch (e.g. `git checkout`
> development) and call `git cherry-pick` {hash of that commit}. In spite
> of applying the same changes, it will be a new commit with a new hash
> because the changes are applied to a different destination.

</details>

<details>
<summary>6. What is the use of ‘git log’?</summary>

>**Answer:**
> To find specific commits in your project history- by author, date, content or history `git log` is used.

</details>

<details>
<summary>7. What is the function of `git diff` in Git?</summary>

>**Answer:**
> `git diff` shows the changes between commits, commit and working tree etc.

</details>


<details>
<summary>8. What is `git stash`?</summary>

>**Answer:**
> `git stash` takes the current state of the working directory and index and puts in on the stack for later and
> gives you back a clean working directory. So in case if you are in the middle of something and need
> to jump over to the other job, and at the same time you don’t want to lose your current edits then you can use 
> `git stash`.

</details>  

<details>
<summary>9. What is `git stash drop`?</summary>

>**Answer:**
> When you are finished with working on the stashed item or want to remove the list then you can use 
> `git stash drop \[-q|--quiet] \[\<stash>]`. This will ensure that the item that is last added by default or
> any particular item can be removed from the argument.

</details>

<details>
<summary>10. What is the function of `git stash apply`?</summary>

>**Answer:**
> When you want to continue working where you have left your work, `git stash apply` command is used to bring back
> the saved changes onto the working directory.

</details>

<details>
<summary>11. What is the function of `git checkout` in Git?</summary>

>**Answer:**
> `git checkout` command is used for update directories or specific files in your working tree with those from another
> branch without merging it in the whole branch.

</details>

<details>
<summary>12. How will you know if a branch has been already merged into master?</summary>

>**Answer:**
> * `git branch --merged` lists the branches that have been merged into the current branch
> * `git branch --no-merged` lists the branches that have not been merged

</details>

<details>
<summary>13. What is the difference between ‘git remote’ and ‘git clone’?</summary>

>**Answer:**
> `git remote add` just creates an entry in your Git config that specifies a name for a particular URL.
> While, `git clone` creates a new Git repository by copying and existing one located at the URI.

</details>  

### Git Branching

<details>
<summary>1. What is the purpose of branching in Git?</summary>

>**Answer:**
> The purpose of branching in Git is that you can create your own branch and jump between those branches. 
> It will allow you to go to your previous work keeping your recent work intact.

</details>

<details>
<summary>2. What is HEAD in Git?</summary>

>**Answer:**
> In Git, this is a pointer to the local branch you’re currently on.

</details>

<details>
<summary>3. How can you bring a new feature in the main branch?</summary>

>**Answer:**
> To bring a new feature in the main branch, you can use a command `git merge` or `git pull command`.

</details>

<details>
<summary>4. What is a `conflict` in Git? how to solve a conflict in Git?</summary>

>**Answer:**
> A conflict arises when the commit that has to be merged has some
> change in one place, and the current commit also has a change at the
> same place. Git will not be able to predict which change should take
> precedence.
>
> To resolve the conflict in Git, edit the files to fix the conflicting
> changes and then add the resolved files by running `git add` after
> that to commit the repaired merge, run `git commit`. Git remembers
> that you are in the middle of a merger, so it sets the parents of the
> commit correctly.

</details>

<details>
<summary>5. How are you can delete a Git branch?</summary>

>**Answer:**
> Once your development branch is merged into the main branch, you don’t
> need development branch. To delete a branch use, the command `git branch –d [head]`.
> To delete a remote branch you need to run command `git push :origin BRANC_NAME`.

</details>

<details>
<summary>6. What is the function of `git reset`?</summary>

>**Answer:**
> The function of `git reset` is to reset your index as well as the working directory to the state of your last commit.

</details>  

## Stage 2

### Git Branching

<details>
<summary>1. What is another option for merging in Git? What advantages of using this another command?</summary>

>**Answer:**
> There is a command `git rebase`. In simple words, `git rebase` allows one to move the first commit of a
> branch to a new starting location. For example, if a feature branch was created from master, and since then
> the master branch has received new commits, `git rebase` can be used to move the feature branch to the
> tip of master. The command effectively will replay the changes made in the feature branch at the tip of master,
> allowing conflicts to be resolved in the process. When done with care, this will allow the feature branch to be 
> merged into master with relative ease and sometimes as a simple fast-forward operation.

</details>  


### Git Workflows

<details>
<summary>1. What are the steps of Git local workflow?</summary>

>**Answer:**
> * For starting local, we initialize our current working project 
>   directory using 'git init' or 'git init your-project-name'(this will
>   create a new directory with provided your-project-name as working
>   directory) command and on the GitHub site set up your GitHub
>   repository.
> * Now in the local working directory, we do changes (either 
>   adding/editing files etc)
> * Then we're going to 'stage' our changes using the "git add" command
> * Then commit our changes that are in the staging area using the 'git
>   commit -m your custom message here'
> * Setup a remote repository (origin) using command 'git remote add
>   origin git@github.com:User/UserRepo.git' (you can change it later
>   using command 'git remote set-url origin
>   git@github.com:User/UserRepo.git')
> * Once we're ready to collaborate with others on the main repository,
>   we'll push our changes up to our remote repository on GitHub(or the
>   hosted remote repository) using command 'git push -u origin master';
>   here -u is upstream(use it only for first push command just once),
>   origin is remote name and master is the branch's name.
> * Once everyone else had pushed their changes to the remote 
>   repository,then we'll do a pull from the remote repository to our
>   local git repository using 'git pull' or 'git pull remote-name
>   branch-name' command
> * Later on whenever doing new working the local repo; do 'git pull'
>   and then start new work.

</details>  

<details>
<summary>2. What are the steps of Git remote workflow?</summary>

>**Answer:**
> * On the GitHub set up your remote GitHub repository
> * Then do a Git's clone using 'git clone' command to create a new
>   repository on our local system.
> * Now in the local working directory we do changes(either
>   adding/editing files etc)
> * Then we're going to 'stage' our changes using the "git add" command
> * Then commit your changes that are in the staging area using the 'git
>   commit -m your custom message here'
> * Setup a remote repository(origin) using command 'git remote add
>   origin git@github.com:User/UserRepo.git' (you can change it later
>   using command 'git remote set-url origin
>   git@github.com:User/UserRepo.git')
> * Once we are ready to collaborate with others on the main repository,
>   we'll push our changes up to our remote repository on GitHub(or the
>   hosted remote repository) using command 'git push -u origin master';
>   here -u is upstream(use it only for first push command just once),
>   origin is remote name and master is the branch's name.
> * One everyone else had pushed their changes to the remote
>   repository,then we'll do a pull from remote repository to our local
>   Git repository using 'git pull' or 'git pull remote-name
>   branch-name' command
> * Later on whenever doing new working the local repo; do 'git pull'
>   and then start new work.

</details>

<details>
<summary>3. Could you explain the Gitflow Workflow?</summary>

>**Answer:**
> Gitflow workflow employs two parallel long-running branches to record
> the history of the project, master and develop:

> * Master - is always ready to be released on LIVE, with everything
>   fully tested and approved (production-ready).
> * Hotfix - Maintenance or “hotfix” branches are used to quickly patch
>   production releases. Hotfix branches are a lot like release branches
>   and feature branches except they're based on master instead of
>   develop.
> * Develop - is the branch to which all feature branches are merged and
>   where all tests are performed. Only when everything’s been
>   thoroughly checked and fixed it can be merged to the master.
> * Feature - Each new feature should reside in its own branch, which can be pushed to the develop branch as their parent one.
> ![Gitflow](../assets/image1.svg)

</details>

<details>
<summary>4. Could you explain the Git Feature Branch Workflow?</summary>

>**Answer:**
> The core idea behind the Feature Branch Workflow is that all feature development should take place in a dedicated branch instead of the master branch. This encapsulation makes it easy for multiple developers to work on a particular feature without disturbing the main codebase. It also means the master branch will never contain broken code, which is a huge advantage for continuous integration environments.
> ![Git Feature Branch Workflow](../assets/image2.svg)

</details>

### Git hooks

<details>
<summary>1. What does ‘hooks’ consist of in Git?</summary>

>**Answer:**
> This directory consists of Shell scripts which are activated after running the corresponding Git commands.
> For example, Git will try to execute the post-commit script after you run a commit.

</details>
