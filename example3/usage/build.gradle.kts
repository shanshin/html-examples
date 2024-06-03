plugins {
    kotlin("jvm") version "1.9.23"
    id("org.jetbrains.kotlinx.kover") version "0.8.0"
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))

    implementation(project(":example3:"))
}

tasks.koverHtmlReport {
    enabled = false
}