import net.mamoe.kjbb.compiler.UnitCoercion.COMPATIBILITY
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.4.21"
    id("net.mamoe.kotlin-jvm-blocking-bridge") version "1.9.2"
}

blockingBridge {
    unitCoercion = COMPATIBILITY
}

group = "me.him188"
version = "1.0-SNAPSHOT"

allprojects {
    repositories {
        mavenLocal()
        mavenCentral()
        maven { url = uri("https://dl.bintray.com/kotlin/kotlin-eap") }
    }

}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "1.8"
    kotlinOptions.freeCompilerArgs += "-Xjvm-default=all"
}