package org.l1ving.api.download

data class DownloadItem(
    var assets: List<Asset>?,
    var assets_url: String?,
    var author: Author?,
    var body: String?,
    var created_at: String?,
    var draft: Boolean?,
    var html_url: String?,
    var id: Int?,
    var name: String?,
    var node_id: String?,
    var prerelease: Boolean?,
    var published_at: String?,
    var tag_name: String?,
    var tarball_url: String?,
    var target_commitish: String?,
    var upload_url: String?,
    var url: String?,
    var zipball_url: String?
)