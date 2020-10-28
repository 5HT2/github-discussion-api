package org.l1ving.api.pull

data class Label(
        var color: String? = null,
        var default: Boolean? = null,
        var description: String? = null,
        var id: Long? = null,
        var name: String? = null,
        var node_id: String? = null,
        var url: String? = null
)