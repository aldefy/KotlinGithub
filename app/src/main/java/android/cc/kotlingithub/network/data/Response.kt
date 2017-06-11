package android.cc.kotlingithub.network.data

import com.bluelinelabs.logansquare.annotation.JsonField
import com.bluelinelabs.logansquare.annotation.JsonObject

@JsonObject
data class Response(

	@field:JsonField(name = arrayOf("total_count"))
	val totalCount: Int? = null,

	@field:JsonField(name = arrayOf("incomplete_results"))
	val incompleteResults: Boolean? = null,

	@field:JsonField(name = arrayOf("items"))
	val items: List<Items?>? = null
)