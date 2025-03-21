package no.fintlabs.status.models.error

interface Error {
    val name: String
    val message: String?
    val stacktrace: Array<StackTraceElement>
    val time: Long
}