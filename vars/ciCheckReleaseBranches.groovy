def call() {
    echo "checking $escapedBranch is master or hotfix"
    return escapedBranch == 'master' || escapedBranch.startsWith("hotfix")
}