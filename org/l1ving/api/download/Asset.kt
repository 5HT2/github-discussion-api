package org.l1ving.api.download

data class Asset(
        val browser_download_url: String? = null,
        val content_type: String? = null,
        val created_at: String? = null,
        val download_count: Int = 0,
        val id: Int? = null,
        val label: Any? = null,
        val name: String? = null,
        val node_id: String? = null,
        val size: Int? = null,
        val state: String? = null,
        val updated_at: String? = null,
        val uploader: Uploader? = null,
        val url: String? = null
)