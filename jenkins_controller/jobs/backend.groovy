pipelineJob('backend') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        credentials("")
                        url("https://github.com/damianblach96/Backend")
                    }
                    branches('main')
                    scriptPath('jenkinsfile')
                }
            }
        }
    }
}
