def logCount
def logCallback

def initialize() {
    logCount = 0
    logCallback = { toLog -> }
}

def log(toLog) {
    logCount++
    logCallback.call(toLog)
}

return this
