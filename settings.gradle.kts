import org.gradle.api.initialization.resolve.RepositoriesMode

// pluginManagement must be the first block in a settings file.
pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

plugins {
    // Auto-provision the JDK 21 required by gradle-daemon-jvm.properties if none is installed.
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "ChtoPrigotovit"
include(":app")
