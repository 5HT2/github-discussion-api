package org.l1ving.api.issue

data class PullRequest(
        var diff_url: String? = null,
        var html_url: String? = null,
        var patch_url: String? = null,
        var url: String? = null
)