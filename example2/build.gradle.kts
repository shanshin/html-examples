plugins {
    kotlin("jvm") version "1.9.23"
    id("org.jetbrains.kotlinx.kover") version "0.8.0"
}

repositories {
    mavenCentral()
}

val reportDir = rootDir.resolve("../reports/example2")

kover {
    useJacoco()

    reports {
        total {
            html {
                htmlDir.set(reportDir)
            }
        }
    }
}

tasks.clean {
    doLast {
        reportDir.deleteRecursively()
    }
}

dependencies {
    testImplementation(kotlin("test"))
}
