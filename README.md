# Batch2022

### Git Notes

[git documentation](https://git-scm.com/docs)


- [Installation](#installation)
- [Configuration](#configuration)
- [Clone](#clone)
- [Add or Modify](#add-or-modify-file)
- [Commit](#commit)
- [Push](#push)
- [Commithash and logs](#commit-hash-and-logs)

- [Pull](#pull)
- [Non conflict and conflict scenario](#non-conflict-and-conflict-scenario)
- [Best practices](#best-practices)


- [How to actually create a repo](#how-to-actually-create-a-repo)

##### Installation

```
sudo apt update
sudo apt install git
```

##### Configuration

```
git config --global user.email bhanuchander210@gmail.com

$ git config --global user.email
bhanuchander210@gmail.com
```

##### Clone

- Clone an existing repo

```
git clone https://github.com/nmswpl/batch2022.git
```

**Note: If repo not exists, [create a repo](#how-to-actually-create-a-repo)**


##### Add or Modify file

- To add a new file in repo

```
vim newfile.txt
git add newfile.txt
```

check status for the added file

```
$ git status
On branch master

No commits yet

Changes to be committed:
  (use "git rm --cached <file>..." to unstage)
	new file:   newfile.txt
```

- Modifying a file in repo

```
echo "new line" >> newfile.txt
```

```
$ git status
On branch master
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
	modified:   newfile.txt

no changes added to commit (use "git add" and/or "git commit -a")
```

After adding the modification using `git add`

```
$ git add newfile.txt
$ git status
On branch master
Changes to be committed:
  (use "git restore --staged <file>..." to unstage)
	modified:   newfile.txt
```

##### Commit

- Commit the staged files in local repo

```
git commit -m 'new changes done'
```

**current status**

```
$ git status
On branch master
nothing to commit, working tree clean
```

##### Push

- Pushing the local repo changes to the actual remote repo

```
git push
```


##### Commit hash and logs

To view the logs and commit details
```
git log
git show <commithash>
```

##### Pull

- To pull the latest repo changes to local

```
git pull
```

Actually git pull is a `git fetch` followed by `git merge`.

##### Non conflict and conflict scenario

When local repo got committed before properly updated.

**Sample:**
```
remote origin/main  :   a -> b -> c
local               :   a -> b -> d
```

**Non conflict**

- git pull command runs successfully and asks for merge commit message to commit.

**Sample**
```
Merge branch 'main' of https://github.com/nmswpl/batch2022 into main
```


**Conflict**

```
remote: Enumerating objects: 5, done.
remote: Counting objects: 100% (5/5), done.
remote: Compressing objects: 100% (2/2), done.
remote: Total 3 (delta 1), reused 0 (delta 0), pack-reused 0
Unpacking objects: 100% (3/3), 671 bytes | 47.00 KiB/s, done.
From https://github.com/nmswpl/batch2022
   29f2437..0b9124b  main       -> origin/main
Auto-merging README.md
CONFLICT (content): Merge conflict in README.md
Automatic merge failed; fix conflicts and then commit the result.
```


##### Best practices

- Use update type as rebase (fetch and rebase) to keep the tree clean (without merge commit).
- Always update before starting to write code / commit / push.
- Never modify / remove others code without any discussion.
- Use fitting / on to the point commit messages is highly recommended.
- Commit the proper working version like collection of files (not like utils.java added).


##### How to actually create a repo

Steps to create a repo

- Create a repo directory
- init
- create and add file
- commit
- set the branch
- add remote 
- push to the remote / branch

**Sample**
```
echo "# batch2022" >> README.md
git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/nmswpl/batch2022.git
git push -u origin main
```