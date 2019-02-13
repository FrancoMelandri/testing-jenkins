def call() {
    node("Testing") {
        println ("starting")
        sh 'echo Hello World!!'
    }
}

return this