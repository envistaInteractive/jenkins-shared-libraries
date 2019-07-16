def call(image) {
    sh '''#!/busybox/sh
    /kaniko/executor --dockerfile `pwd`/Dockerfile --context `pwd` --cache=true --destination=${image}:${BUILD_NUMBER}-${GIT_COMMIT} --destination=${image}:latest
    '''
}
