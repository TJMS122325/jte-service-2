library_sources {
  github {
    org = "TJMS122325"
    repo = "jenkins-jte-libraries"
    branch = "main"
  }
}

libraries {
  javaProject
}

project {
  name = "demo-service-2"
  artifact = "demo-service-2"
  dockerOrg = "demo-org"
  dockerOrgProd = "demo-org-prod"
  sonarGroup = "com.demo"
  mavenSettingsId = "demo-maven-settings"
  portainer {
    url = "https://portainer.example"
    stackName = "demo-service-2-stack"
    testingStackName = "demo-service-2-testing"
  }
}
