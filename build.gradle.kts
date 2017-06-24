withHelloTask()

val removeBatchFile by tasks.creating(Delete::class) {
    delete("gradlew.bat")
}
