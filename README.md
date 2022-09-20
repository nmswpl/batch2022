# Batch2022

### Git Notes

[git documentation](https://git-scm.com/docs)


- [Installation](#installation)
- [Configuration](#configuration)
- [Clone](#clone)
- [Add or Modify](#add-or-modify-file)
- [Commit](#commit)
- [Push](#push)
- [How to actually create a repo](#how-to-actually-create-a-repo)


- [Pull](#pull)

##### Installation

```
sudo apt update
sudo apt install git
```

#### Configuration

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

##### 


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
