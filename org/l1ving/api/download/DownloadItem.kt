package org.l1ving.api.download

data class DownloadItem(
        var assets: List<Asset>? = null,
        var assets_url: String? = null,
        var author: Author? = null,
        var body: String? = null,
        var created_at: String? = null,
        var draft: Boolean? = null,
        var html_url: String? = null,
        var id: Int? = null,
        var name: String? = null,
        var node_id: String? = null,
        var prerelease: Boolean? = null,
        var published_at: String? = null,
        var tag_name: String? = null,
        var tarball_url: String? = null,
        var target_commitish: String? = null,
        var upload_url: String? = null,
        var url: String? = null,
        var zipball_url: String? = null
)