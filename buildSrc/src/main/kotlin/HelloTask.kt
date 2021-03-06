// https://github.com/gradle/kotlin-dsl/blob/master/samples/multi-project-with-buildSrc/buildSrc/src/main/kotlin/HelloTask.kt

import org.gradle.api.*
import org.gradle.api.tasks.*
import org.gradle.kotlin.dsl.*

open class HelloTask : DefaultTask() {

    init {
        group = "My"
        description = "Prints a description of ${project.name}."
    }

    @TaskAction
    fun run() {
        println("I'm ${project.name}")
    }
}

/*
fun Project.declareHelloTask() =
    task<HelloTask>("hello")

val Project.hello: HelloTask
    get() = tasks["hello"] as HelloTask
*/

/**
 * Declares a [HelloTask] named `hello`.
 */
fun Project.withHelloTask() =
    task<HelloTask>("hello")
