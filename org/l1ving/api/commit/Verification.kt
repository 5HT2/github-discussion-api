package org.l1ving.api.commit

data class Verification(
    val payload: String? = null,
    val reason: String? = null,
    val signature: String? = null,
    val verified: Boolean? = null
)