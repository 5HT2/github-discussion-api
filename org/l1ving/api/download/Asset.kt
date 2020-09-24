package org.l1ving.api.download

data class Asset(
    var browser_download_url: String = "",
    var content_type: String = "",
    var created_at: String = "",
    var download_count: Int = 0,
    var id: Int = 0,
    var label: Any? = null,
    var name: String = "",
    var node_id: String = "",
    var size: Int = 0,
    var state: String = "",
    var updated_at: String = "",
    var uploader: Uploader = Uploader(),
    var url: String = ""
)