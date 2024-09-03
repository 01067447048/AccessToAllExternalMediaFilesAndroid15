package com.jaehyeon.basic.access_to_all_external_media_files_android15

import android.net.Uri

data class MediaFile(
    val uri: Uri,
    val name: String,
    val type: MediaType
)
