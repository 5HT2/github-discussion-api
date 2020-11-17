package org.l1ving.api.download

data class DownloadItem(
        val assets: List<Asset> = listOf(),
        val assets_url: String? = null,
        val author: Author? = null,
        val body: String? = null,
        val created_at: String? = null,
        val draft: Boolean? = null,
        val html_url: String? = null,
        val id: Int? = null,
        val name: String? = null,
        val node_id: String? = null,
        val prerelease: Boolean? = null,
        val published_at: String? = null,
        val tag_name: String? = null,
        val tarball_url: String? = null,
        val target_commitish: String? = null,
        val upload_url: String? = null,
        val url: String? = null,
        val zipball_url: String? = null
)