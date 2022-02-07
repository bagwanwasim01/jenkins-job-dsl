job('seed-external-job') {
  scm {
      git('https://github.com/bagwanwasim01/jenkins-job-dsl.git')
  }
  steps {
    dsl {
      external('seed-hello-world-external/hello_world_external.groovy')
    }
  }
}
