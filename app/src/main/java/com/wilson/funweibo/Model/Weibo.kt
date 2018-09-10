package com.wilson.funweibo.Model

data class Weibo(
        val created_at: String,
        val id: Long,
        val idstr: String,
        val mid: String,
        val can_edit: Boolean,
        val text: String,
        val textLength: Int,
        val source_allowclick: Int,
        val source_type: Int,
        val source: String,
        val favorited: Boolean,
        val truncated: Boolean,
        val in_reply_to_status_id: String,
        val in_reply_to_user_id: String,
        val in_reply_to_screen_name: String,
        val pic_urls: List<Any>,
        val geo: Any,
        val is_paid: Boolean,
        val mblog_vip_type: Int,
        val user: User,
        val annotations: List<Annotation>,
        val reposts_count: Int,
        val comments_count: Int,
        val attitudes_count: Int,
        val pending_approval_count: Int,
        val isLongText: Boolean,
        val hide_flag: Int,
        val mlevel: Int,
        val visible: Visible,
        val biz_ids: List<Int>,
        val biz_feature: Long,
        val hasActionTypeCard: Int,
        val darwin_tags: List<Any>,
        val hot_weibo_tags: List<Any>,
        val text_tag_tips: List<Any>,
        val mblogtype: Int,
        val rid: String,
        val userType: Int,
        val more_info_type: Int,
        val cardid: String,
        val positive_recom_flag: Int,
        val content_auth: Int,
        val gif_ids: String,
        val is_show_bulletin: Int,
        val comment_manage_info: CommentManageInfo
)