plugins {
  id("org.gradle.kotlin.kotlin-dsl") version "0.10.8"
  /*
Starting a Gradle Daemon (subsequent builds will be faster)
Generating JAR file 'gradle-api-4.1-20170622074548+0000.jar'
Generating JAR file 'gradle-kotlin-dsl-extensions-0.10.0-SNAPSHOT-4.1-20170622074548+0000.jar'
Download https://plugins.gradle.org/m2/gradle/plugin/org/gradle/kotlin/gradle-kotlin-dsl-plugins/0.10.8/gradle-kotlin-dsl-plugins-0.10.8.pom
Download https://plugins.gradle.org/m2/gradle/plugin/org/gradle/kotlin/gradle-kotlin-dsl-plugins/0.10.8/gradle-kotlin-dsl-plugins-0.10.8.jar
  */
}

withHelloTask()

val removeBatchFile by tasks.creating(Delete::class) {
    delete("gradlew.bat")
}

tasks {
    "wrapper"(Wrapper::class) {
        gradleVersion = "4.0" //"gradle-kotlin-dsl-4.1-20170622074548+0000"
        distributionType = Wrapper.DistributionType.ALL
        finalizedBy(removeBatchFile)
    }
}
