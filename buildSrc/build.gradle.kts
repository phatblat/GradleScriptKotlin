/*
plugins {
    //`kotlin-dsl`
    id("org.gradle.kotlin.kotlin-dsl") version "0.10.8"
}
*/

buildscript {
  build.loadExtraPropertiesOf(project)

  val kotlinRepo: String by extra { "https://plugins.gradle.org/m2/" }
  repositories {
      maven { url = uri(kotlinRepo) }
  }

  val kotlinVersion: String by extra { "0.10.8" }
  dependencies {
    classpath("gradle.plugin.org.gradle.kotlin:gradle-kotlin-dsl-plugins:$kotlinVersion")
    //classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.1.2-5")
  }
}

apply plugin: "org.gradle.kotlin.kotlin-dsl"
