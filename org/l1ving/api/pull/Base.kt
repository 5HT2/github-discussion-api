package org.l1ving.api.pull

data class Base(
        val label: String? = null,
        val ref: String? = null,
        val repo: Repo? = null,
        val sha: String? = null,
        val user: User? = null
)