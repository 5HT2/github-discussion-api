package org.l1ving.api.issue

data class Milestone(
        val closed_at: Any? = null,
        val closed_issues: Int? = null,
        val created_at: String? = null,
        val creator: Creator? = null,
        val description: String? = null,
        val due_on: Any? = null,
        val html_url: String? = null,
        val id: Long? = null,
        val labels_url: String? = null,
        val node_id: String? = null,
        val number: Int? = null,
        val open_issues: Int? = null,
        val state: String? = null,
        val title: String? = null,
        val updated_at: String? = null,
        val url: String? = null
)