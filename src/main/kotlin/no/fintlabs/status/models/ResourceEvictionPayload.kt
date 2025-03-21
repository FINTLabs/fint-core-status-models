package no.fintlabs.status.models

data class ResourceEvictionPayload(
    val domain: String,
    val pkg: String,
    val resource: String,
    val org: String,
    val unixTimestamp: Long
)
