package org.l1ving.api.pull

data class Links(
        var comments: Comments?,
        var commits: Commits?,
        var html: Html?,
        var issue: Issue?,
        var review_comment: ReviewComment?,
        var review_comments: ReviewComments?,
        var self: Self?,
        var statuses: Statuses?
)