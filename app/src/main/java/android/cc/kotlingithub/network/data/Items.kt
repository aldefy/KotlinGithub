package android.cc.kotlingithub.network.data

import com.bluelinelabs.logansquare.annotation.JsonField
import com.bluelinelabs.logansquare.annotation.JsonObject

@JsonObject
data class Items(

	@field:JsonField(name = arrayOf("stargazers_count"))
	val stargazersCount: Int? = null,

	@field:JsonField(name = arrayOf("pushed_at"))
	val pushedAt: String? = null,

	@field:JsonField(name = arrayOf("subscription_url"))
	val subscriptionUrl: String? = null,

	@field:JsonField(name = arrayOf("language"))
	val language: String? = null,

	@field:JsonField(name = arrayOf("branches_url"))
	val branchesUrl: String? = null,

	@field:JsonField(name = arrayOf("issue_comment_url"))
	val issueCommentUrl: String? = null,

	@field:JsonField(name = arrayOf("labels_url"))
	val labelsUrl: String? = null,

	@field:JsonField(name = arrayOf("score"))
	val score: Double? = null,

	@field:JsonField(name = arrayOf("subscribers_url"))
	val subscribersUrl: String? = null,

	@field:JsonField(name = arrayOf("releases_url"))
	val releasesUrl: String? = null,

	@field:JsonField(name = arrayOf("svn_url"))
	val svnUrl: String? = null,

	@field:JsonField(name = arrayOf("id"))
	val id: Int? = null,

	@field:JsonField(name = arrayOf("forks"))
	val forks: Int? = null,

	@field:JsonField(name = arrayOf("archive_url"))
	val archiveUrl: String? = null,

	@field:JsonField(name = arrayOf("git_refs_url"))
	val gitRefsUrl: String? = null,

	@field:JsonField(name = arrayOf("forks_url"))
	val forksUrl: String? = null,

	@field:JsonField(name = arrayOf("statuses_url"))
	val statusesUrl: String? = null,

	@field:JsonField(name = arrayOf("ssh_url"))
	val sshUrl: String? = null,

	@field:JsonField(name = arrayOf("full_name"))
	val fullName: String? = null,

	@field:JsonField(name = arrayOf("size"))
	val size: Int? = null,

	@field:JsonField(name = arrayOf("languages_url"))
	val languagesUrl: String? = null,

	@field:JsonField(name = arrayOf("html_url"))
	val htmlUrl: String? = null,

	@field:JsonField(name = arrayOf("collaborators_url"))
	val collaboratorsUrl: String? = null,

	@field:JsonField(name = arrayOf("clone_url"))
	val cloneUrl: String? = null,

	@field:JsonField(name = arrayOf("name"))
	val name: String? = null,

	@field:JsonField(name = arrayOf("pulls_url"))
	val pullsUrl: String? = null,

	@field:JsonField(name = arrayOf("default_branch"))
	val defaultBranch: String? = null,

	@field:JsonField(name = arrayOf("hooks_url"))
	val hooksUrl: String? = null,

	@field:JsonField(name = arrayOf("trees_url"))
	val treesUrl: String? = null,

	@field:JsonField(name = arrayOf("tags_url"))
	val tagsUrl: String? = null,

	@field:JsonField(name = arrayOf("private"))
	val jsonMemberPrivate: Boolean? = null,

	@field:JsonField(name = arrayOf("contributors_url"))
	val contributorsUrl: String? = null,

	@field:JsonField(name = arrayOf("has_downloads"))
	val hasDownloads: Boolean? = null,

	@field:JsonField(name = arrayOf("notifications_url"))
	val notificationsUrl: String? = null,

	@field:JsonField(name = arrayOf("open_issues_count"))
	val openIssuesCount: Int? = null,

	@field:JsonField(name = arrayOf("description"))
	val description: String? = null,

	@field:JsonField(name = arrayOf("created_at"))
	val createdAt: String? = null,

	@field:JsonField(name = arrayOf("watchers"))
	val watchers: Int? = null,

	@field:JsonField(name = arrayOf("keys_url"))
	val keysUrl: String? = null,

	@field:JsonField(name = arrayOf("deployments_url"))
	val deploymentsUrl: String? = null,

	@field:JsonField(name = arrayOf("has_projects"))
	val hasProjects: Boolean? = null,

	@field:JsonField(name = arrayOf("has_wiki"))
	val hasWiki: Boolean? = null,

	@field:JsonField(name = arrayOf("updated_at"))
	val updatedAt: String? = null,

	@field:JsonField(name = arrayOf("comments_url"))
	val commentsUrl: String? = null,

	@field:JsonField(name = arrayOf("stargazers_url"))
	val stargazersUrl: String? = null,

	@field:JsonField(name = arrayOf("git_url"))
	val gitUrl: String? = null,

	@field:JsonField(name = arrayOf("has_pages"))
	val hasPages: Boolean? = null,

	@field:JsonField(name = arrayOf("owner"))
	val owner: Owner? = null,

	@field:JsonField(name = arrayOf("commits_url"))
	val commitsUrl: String? = null,

	@field:JsonField(name = arrayOf("compare_url"))
	val compareUrl: String? = null,

	@field:JsonField(name = arrayOf("git_commits_url"))
	val gitCommitsUrl: String? = null,

	@field:JsonField(name = arrayOf("blobs_url"))
	val blobsUrl: String? = null,

	@field:JsonField(name = arrayOf("git_tags_url"))
	val gitTagsUrl: String? = null,

	@field:JsonField(name = arrayOf("merges_url"))
	val mergesUrl: String? = null,

	@field:JsonField(name = arrayOf("downloads_url"))
	val downloadsUrl: String? = null,

	@field:JsonField(name = arrayOf("has_issues"))
	val hasIssues: Boolean? = null,

	@field:JsonField(name = arrayOf("url"))
	val url: String? = null,

	@field:JsonField(name = arrayOf("contents_url"))
	val contentsUrl: String? = null,

	@field:JsonField(name = arrayOf("mirror_url"))
	val mirrorUrl: Any? = null,

	@field:JsonField(name = arrayOf("milestones_url"))
	val milestonesUrl: String? = null,

	@field:JsonField(name = arrayOf("teams_url"))
	val teamsUrl: String? = null,

	@field:JsonField(name = arrayOf("fork"))
	val fork: Boolean? = null,

	@field:JsonField(name = arrayOf("issues_url"))
	val issuesUrl: String? = null,

	@field:JsonField(name = arrayOf("events_url"))
	val eventsUrl: String? = null,

	@field:JsonField(name = arrayOf("issue_events_url"))
	val issueEventsUrl: String? = null,

	@field:JsonField(name = arrayOf("assignees_url"))
	val assigneesUrl: String? = null,

	@field:JsonField(name = arrayOf("open_issues"))
	val openIssues: Int? = null,

	@field:JsonField(name = arrayOf("watchers_count"))
	val watchersCount: Int? = null,

	@field:JsonField(name = arrayOf("homepage"))
	val homepage: String? = null,

	@field:JsonField(name = arrayOf("forks_count"))
	val forksCount: Int? = null
)