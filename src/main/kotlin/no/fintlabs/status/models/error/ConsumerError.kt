package no.fintlabs.status.models.error

class ConsumerError(
    val domain: String,
    val pkg: String,
    val org: String,
    override val name: String,
    override val message: String?,
    override val stacktrace: Array<StackTraceElement>,
    override val time: Long
) : Error {
    companion object {
        @JvmStatic
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
