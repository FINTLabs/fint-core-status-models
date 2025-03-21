package no.fintlabs.status.models.error

class ProviderError(
    override val name: String,
    override val message: String?,
    override val stacktrace: Array<StackTraceElement>,
    override val time: Long
) : Error {

    companion object {
        fun fromException(ex: Exception) =
            ProviderError(
                name = ex.javaClass.simpleName,
                message = ex.message,
                stacktrace = ex.stackTrace,
                time = System.currentTimeMillis()
            )
    }

}