package org.l1ving.api.commit

data class Commit(
    val author: Author? = null,
    val committer: Committer? = null,
    val html_url: String? = null,
    val message: String? = null,
    val node_id: String? = null,
    val parents: List<Parent>? = null,
    val sha: String? = null,
    val tree: Tree? = null,
    val url: String? = null,
    val verification: Verification? = null
)