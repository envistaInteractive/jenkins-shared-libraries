def call(image, git_commit) {
    sh '''#!/busybox/sh
    /kaniko/executor --dockerfile `pwd`/Dockerfile --context `pwd` --cache=true --destination=${image}:${git_commit}
    '''
}
