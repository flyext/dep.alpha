ivyJob('BuildIvy') {
    ivyFilePattern('modules/**/ivy.xml')
    ivyFileExcludesPattern('modules/**/target/**/ivy.xml')
    ivyBuilder {
        ant {
            target('publish-local')
            antInstallation('Main')
        }
    }
}