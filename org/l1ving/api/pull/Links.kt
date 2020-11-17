package org.l1ving.api.pull

data class Links(
        val comments: Comments? = null,
        val commits: Commits? = null,
        val html: Html? = null,
        val issue: Issue? = null,
        val review_comment: ReviewComment? = null,
        val review_comments: ReviewComments? = null,
        val self: Self? = null,
        val statuses: Statuses? = null
)