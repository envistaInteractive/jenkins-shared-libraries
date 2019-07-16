def call(image) {
    sh '''#!/busybox/sh
    /kaniko/executor --dockerfile `pwd`/Dockerfile --context `pwd` --cache=true --destination=${image}:${env.BUILD_NUMBER}-${env.GIT_COMMIT}
    '''
}


// def call(image) {
//     sh '''#!/busybox/sh
//     /kaniko/executor --dockerfile `pwd`/Dockerfile --context `pwd` --cache=true --destination=${image}
//     '''
// }