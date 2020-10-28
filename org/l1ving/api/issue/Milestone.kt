package org.l1ving.api.issue

data class Milestone(
        var closed_at: Any? = null,
        var closed_issues: Int? = null,
        var created_at: String? = null,
        var creator: Creator? = null,
        var description: String? = null,
        var due_on: Any? = null,
        var html_url: String? = null,
        var id: Long? = null,
        var labels_url: String? = null,
        var node_id: String? = null,
        var number: Int? = null,
        var open_issues: Int? = null,
        var state: String? = null,
        var title: String? = null,
        var updated_at: String? = null,
        var url: String? = null
)