# sharedpipeline-demo
Jenkins-Shared-Pipeline-Demo
Pipeline Shared Libraries

When you have multiple Pipeline jobs, you often want to share some parts of the Pipeline scripts between them to keep Pipeline scripts DRY. A very common use case is that you have many projects that are built in the similar way.

Comprehensive user documentation can be found in the Pipeline chapter of the User Handbook.


How to use it?

Add this repository as Global Shared Library or Folder-level Shared Library in Jenkins configuration.
executeScript.groovy is called from Jenkinsfile at project-level where you define the required params and pass the script path to be executed along with git credentialsId, ci pipelines repo and branch.
executeScript.groovy accepts the required params and checksout the ci pipeline repository where shared pipeline are defined. It loads common script and attaches to the script intended to be executed by Jenkinsfile and executes the script. 
