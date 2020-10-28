package org.l1ving.api.pull

data class Links(
        var comments: Comments? = null,
        var commits: Commits? = null,
        var html: Html? = null,
        var issue: Issue? = null,
        var review_comment: ReviewComment? = null,
        var review_comments: ReviewComments? = null,
        var self: Self? = null,
        var statuses: Statuses? = null
)