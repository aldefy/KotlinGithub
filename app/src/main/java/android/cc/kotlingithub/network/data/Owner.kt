package android.cc.kotlingithub.network.data

import com.bluelinelabs.logansquare.annotation.JsonField
import com.bluelinelabs.logansquare.annotation.JsonObject

@JsonObject
data class Owner(

	@field:JsonField(name = arrayOf("gists_url"))
	val gistsUrl: String? = null,

	@field:JsonField(name = arrayOf("repos_url"))
	val reposUrl: String? = null,

	@field:JsonField(name = arrayOf("following_url"))
	val followingUrl: String? = null,

	@field:JsonField(name = arrayOf("starred_url"))
	val starredUrl: String? = null,

	@field:JsonField(name = arrayOf("login"))
	val login: String? = null,

	@field:JsonField(name = arrayOf("followers_url"))
	val followersUrl: String? = null,

	@field:JsonField(name = arrayOf("type"))
	val type: String? = null,

	@field:JsonField(name = arrayOf("url"))
	val url: String? = null,

	@field:JsonField(name = arrayOf("subscriptions_url"))
	val subscriptionsUrl: String? = null,

	@field:JsonField(name = arrayOf("received_events_url"))
	val receivedEventsUrl: String? = null,

	@field:JsonField(name = arrayOf("avatar_url"))
	val avatarUrl: String? = null,

	@field:JsonField(name = arrayOf("events_url"))
	val eventsUrl: String? = null,

	@field:JsonField(name = arrayOf("html_url"))
	val htmlUrl: String? = null,

	@field:JsonField(name = arrayOf("site_admin"))
	val siteAdmin: Boolean? = null,

	@field:JsonField(name = arrayOf("id"))
	val id: Int? = null,

	@field:JsonField(name = arrayOf("gravatar_id"))
	val gravatarId: String? = null,

	@field:JsonField(name = arrayOf("organizations_url"))
	val organizationsUrl: String? = null
)