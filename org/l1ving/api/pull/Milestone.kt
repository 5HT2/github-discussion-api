package org.l1ving.api.pull

data class Milestone(
        var closed_at: Any?,
        var closed_issues: Int?,
        var created_at: String?,
        var creator: Creator?,
        var description: String?,
        var due_on: Any?,
        var html_url: String?,
        var id: Long?,
        var labels_url: String?,
        var node_id: String?,
        var number: Int?,
        var open_issues: Int?,
        var state: String?,
        var title: String?,
        var updated_at: String?,
        var url: String?
)