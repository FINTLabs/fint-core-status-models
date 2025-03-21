package no.fintlabs.status.models

class ConsumerError(
    val domain: String,
    val pkg: String,
    val org: String,
    val name: String,
    val message: String?,
    val stacktrace: Array<StackTraceElement>,
    val time: Long
) {
    companion object {
        fun fromException(ex: Exception, domain: String, pkg: String, org: String) =
            ConsumerError(
                domain = domain,
                pkg = pkg,
                org = org,
                name = ex.javaClass.simpleName,
                message = ex.message,
                stacktrace = ex.stackTrace,
                time = System.currentTimeMillis()
            )
    }
}
