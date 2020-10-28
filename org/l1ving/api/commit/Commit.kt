package org.l1ving.api.commit

data class Commit(
        val author: Author?,
        val committer: Committer?,
        val html_url: String?,
        val message: String?,
        val node_id: String?,
        val parents: List<Parent>?,
        val sha: String?,
        val tree: Tree?,
        val url: String?,
        val verification: Verification?
)