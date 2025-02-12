def call() {
    def escapedBranch = env.GIT_BRANCH
            .toString()
            .toLowerCase()
            .replace("origin/", "")
            .replace("/", "-")
            // we want to use branch name as our chart name, so we try to comply the regexp
            // (e.g. 'my-name',  or 'abc-123', regex used for validation is '[a-z]([-a-z0-9]*[a-z0-9])?')
            .replace(".", "-")
    
    return escapedBranch
}