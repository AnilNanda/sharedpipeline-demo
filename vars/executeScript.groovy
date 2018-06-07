def call(scriptPath,ci_pipelines_repository,ci_pipelines_repository_branch)
{
def commons
def script
node("jenkins-ecs-slave") {
checkout changelog: false, poll: false,
	scm: [$class	:'GitSCM',
	branches	:[[name:ci_pipelines_repository_branch]],
	doGenerateSubmoduleConfigurations: false,
	extensions	: [[$class: 'PruneStaleBranch']],
	submoduleCfg	: [],
	userRemoteConfigs	: [[url: ci_pipelines_repository]]
	]
	commons = load("src/common/script.groovy")
	script=load(scriptPath)
}
 script.commons = commons
 script.runScript()
}
