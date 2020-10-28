package org.l1ving.api.pull

data class Base(
        var label: String? = null,
        var ref: String? = null,
        var repo: Repo? = null,
        var sha: String? = null,
        var user: User? = null
)