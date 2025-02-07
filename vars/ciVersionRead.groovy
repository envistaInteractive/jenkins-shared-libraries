def call() {
    env.escapedBranch = ciEscapeBranchName()
    echo "escapedBranch is $escapedBranch"
    tag = ""
    if(escapedBranch == 'master') {
        echo "##### master branch detected"
        tag = ciBumpUpVersion(ciMasterVersionRead(), "minor")
    } else if (escapedBranch.toString().startsWith("hotfix")) {
        echo "##### hotfix branch detected"
        tag = ciBumpUpVersion(ciMasterVersionRead(), "revision")
    } else  {
        echo "##### feature branch detected"
        tag = escapedBranch
    }

    echo "version set to $tag"
    return tag
}