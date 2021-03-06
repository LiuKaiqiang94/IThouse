package com.danmo.commonapi.api.community;

public interface CommunityApi {
    String getCommunityCategory(String url);

    String getCommunityListNewest(String url);

    String getCommunityListHotest(String url);

    String getCommunityCategoryList(String categoryid, String type, String orderTime, String visistCount, String pageLength);

    String getCommunityComment(String id);
}
