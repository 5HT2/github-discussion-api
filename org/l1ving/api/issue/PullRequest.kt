package org.l1ving.api.issue

data class PullRequest(
    var diff_url: String?,
    var html_url: String?,
    var patch_url: String?,
    var url: String?
)