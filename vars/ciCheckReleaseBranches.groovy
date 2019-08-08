def call() {
    return escapedBranch == 'master' || escapedBranch.startsWith("hotfix")
}