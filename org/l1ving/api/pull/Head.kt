package org.l1ving.api.pull

data class Head(
        val label: String? = null,
        val ref: String? = null,
        val repo: RepoX? = null,
        val sha: String? = null,
        val user: UserX? = null
)