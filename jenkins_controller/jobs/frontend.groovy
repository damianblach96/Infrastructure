pipelineJob('frontend') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        credentials("")
                        url("https://github.com/damianblach96/Frontend")
                    }
                    branches('main')
                    scriptPath('jenkinsfile')
                }
            }
        }
    }
}
