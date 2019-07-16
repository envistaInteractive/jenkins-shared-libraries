def call(image) {
    image_tagged = "${image}:${env.BUILD_NUMBER}-${env.GIT_COMMIT}"
    sh '''#!/busybox/sh
    /kaniko/executor --dockerfile `pwd`/Dockerfile --context `pwd` --cache=true --destination=${image_tagged}
    '''
}


// def call(image) {
//     sh '''#!/busybox/sh
//     /kaniko/executor --dockerfile `pwd`/Dockerfile --context `pwd` --cache=true --destination=${image}
//     '''
// }

`