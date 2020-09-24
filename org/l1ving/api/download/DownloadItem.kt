package org.l1ving.api.download

data class DownloadItem(
    var assets: List<Asset> = listOf(),
    var assets_url: String = "",
    var author: Author = Author(),
    var body: String = "",
    var created_at: String = "",
    var draft: Boolean = false,
    var html_url: String = "",
    var id: Int = 0,
    var name: String = "",
    var node_id: String = "",
    var prerelease: Boolean = false,
    var published_at: String = "",
    var tag_name: String = "",
    var tarball_url: String = "",
    var target_commitish: String = "",
    var upload_url: String = "",
    var url: String = "",
    var zipball_url: String = ""
)