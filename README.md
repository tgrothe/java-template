# java-template

Template repository for Java.

## Usage

To use this template, click the "Use this template" button on the repository page to create a new repository based on this template.

## Update from this template (if you used it to create your repository and want to get updates)

```sh
# new branch
git checkout -b update-from-template
# cherry-pick...
git fetch https://github.com/tgrothe/java-template.git main && git cherry-pick FETCH_HEAD
# resolve possible conflicts, continue, commit...
# see changes to push before push
git diff origin/main
# push...
git push

# to see changes before cherry-pick, use:
# git fetch https://github.com/tgrothe/java-template.git main && git diff FETCH_HEAD
```

_By the way: A `pull ... --allow-unrelated-histories` would also be possible, but this affects the history, and causing chaos._ :cold_sweat:
