package `github-discussion-api`.pull

data class PullRequest(
    var _links: Links = Links(),
    var active_lock_reason: Any? = null,
    var additions: Int = 0,
    var assignee: Any? = null,
    var assignees: List<Any> = listOf(),
    var author_association: String = "",
    var base: Base = Base(),
    var body: String = "",
    var changed_files: Int = 0,
    var closed_at: Any? = null,
    var comments: Int = 0,
    var comments_url: String = "",
    var commits: Int = 0,
    var commits_url: String = "",
    var created_at: String = "",
    var deletions: Int = 0,
    var diff_url: String = "",
    var draft: Boolean = false,
    var head: Head = Head(),
    var html_url: String = "",
    var id: Long = 0,
    var issue_url: String = "",
    var labels: List<Label> = listOf(),
    var locked: Boolean = false,
    var maintainer_can_modify: Boolean = false,
    var merge_commit_sha: String = "",
    var mergeable: Boolean = false,
    var mergeable_state: String = "",
    var merged: Boolean = false,
    var merged_at: Any? = null,
    var merged_by: Any? = null,
    var milestone: Milestone = Milestone(),
    var node_id: String = "",
    var number: Int = 0,
    var patch_url: String = "",
    var rebaseable: Boolean = false,
    var requested_reviewers: List<Any> = listOf(),
    var requested_teams: List<Any> = listOf(),
    var review_comment_url: String = "",
    var review_comments: Int = 0,
    var review_comments_url: String = "",
    var state: String = "",
    var statuses_url: String = "",
    var title: String = "",
    var updated_at: String = "",
    var url: String = "",
    var user: UserXX = UserXX()
)