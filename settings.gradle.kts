pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Poekedex"
include(":app")
include(":features")
include(":features:onboarding")
include(":design_system")
include(":features:create_account")
include(":domain")
include(":infrastructure:domain:coroutines")
include(":infrastructure")
