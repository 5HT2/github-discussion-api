package org.l1ving.api.download

data class Asset(
    var browser_download_url: String?,
    var content_type: String?,
    var created_at: String?,
    var download_count: Int?,
    var id: Int?,
    var label: Any?,
    var name: String?,
    var node_id: String?,
    var size: Int?,
    var state: String?,
    var updated_at: String?,
    var uploader: Uploader?,
    var url: String?
)