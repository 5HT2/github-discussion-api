package org.l1ving.api.pull

data class Base(
    var label: String?,
    var ref: String?,
    var repo: Repo?,
    var sha: String?,
    var user: User?
)