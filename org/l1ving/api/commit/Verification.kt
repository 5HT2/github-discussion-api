package org.l1ving.api.commit

data class Verification(
    val payload: String?,
    val reason: String?,
    val signature: String?,
    val verified: Boolean?
)