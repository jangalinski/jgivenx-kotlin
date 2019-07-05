plugins {
    base
    idea
    kotlin("jvm") version Versions.kotlin apply false
}


allprojects {
    group = "com.github.toolisticon"
    version = "0.1.0-SNAPSHOT"

    apply {
        from("${rootProject.rootDir}/gradle/repositories.gradle.kts")
    }
}

dependencies {
    subprojects.forEach {
        archives(it)
    }
}

