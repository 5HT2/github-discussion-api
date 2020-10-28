package org.l1ving.api.pull

data class Head(
        var label: String? = null,
        var ref: String? = null,
        var repo: RepoX? = null,
        var sha: String? = null,
        var user: UserX? = null
)