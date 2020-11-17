package org.l1ving.api.issue

data class PullRequest(
        val diff_url: String? = null,
        val html_url: String? = null,
        val patch_url: String? = null,
        val url: String? = null
)