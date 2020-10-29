package org.l1ving.api.download

data class Asset(
        var browser_download_url: String? = null,
        var content_type: String? = null,
        var created_at: String? = null,
        var download_count: Int = 0,
        var id: Int? = null,
        var label: Any? = null,
        var name: String? = null,
        var node_id: String? = null,
        var size: Int? = null,
        var state: String? = null,
        var updated_at: String? = null,
        var uploader: Uploader? = null,
        var url: String? = null
)