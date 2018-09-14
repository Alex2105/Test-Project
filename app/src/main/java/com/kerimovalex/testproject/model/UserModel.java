package com.kerimovalex.testproject.model;

import com.google.gson.annotations.SerializedName;

public class UserModel {
    @SerializedName("partner")
    private String partner;
    @SerializedName("id_partner")
    private String idPartner;
    @SerializedName("avatar")
    private String avatar;
    @SerializedName("last_seen")
    private String lastSeen;
    @SerializedName("is_online")
    private Integer isOnline;
    @SerializedName("click_price")
    private Integer clickPrice;
    @SerializedName("sales_percent")
    private Integer salesPercent;
    @SerializedName("sales_base")
    private String salesBase;
    @SerializedName("cnt_new_messages")
    private Integer cntNewMessages;
    @SerializedName("id")
    private String id;
    @SerializedName("email")
    private String email;
    @SerializedName("password")
    private String password;
    @SerializedName("fullname")
    private String fullname;
    @SerializedName("role")
    private String role;
    @SerializedName("paypal_email")
    private String paypalEmail;
    @SerializedName("paypal_affiliate")
    private String paypalAffiliate;
    @SerializedName("id_ref")
    private Object idRef;
    @SerializedName("id_ref_old")
    private String idRefOld;
    @SerializedName("ref_type")
    private String refType;
    @SerializedName("ref_lock")
    private String refLock;
    @SerializedName("dta_reg")
    private String dtaReg;
    @SerializedName("ip_last_login")
    private String ipLastLogin;
    @SerializedName("dta_first_success_solo")
    private String dtaFirstSuccessSolo;
    @SerializedName("list_size")
    private String listSize;
    @SerializedName("is_list_verify")
    private String isListVerify;
    @SerializedName("list_size_unverify")
    private String listSizeUnverify;
    @SerializedName("avatar_ext")
    private String avatarExt;
    @SerializedName("uid")
    private String uid;
    @SerializedName("uid_profile")
    private String uidProfile;
    @SerializedName("uid_profile_date")
    private String uidProfileDate;
    @SerializedName("hash")
    private String hash;
    @SerializedName("accept_in")
    private String acceptIn;
    @SerializedName("seller_rep")
    private String sellerRep;
    @SerializedName("seller_rate_success")
    private String sellerRateSuccess;
    @SerializedName("seller_rate_fail")
    private String sellerRateFail;
    @SerializedName("seller_rate_success_arc")
    private String sellerRateSuccessArc;
    @SerializedName("seller_rate_fail_arc")
    private String sellerRateFailArc;
    @SerializedName("buyer_rep")
    private String buyerRep;
    @SerializedName("buyer_rate_success")
    private String buyerRateSuccess;
    @SerializedName("buyer_rate_fail")
    private String buyerRateFail;
    @SerializedName("buyer_rate_success_arc")
    private String buyerRateSuccessArc;
    @SerializedName("buyer_rate_fail_arc")
    private String buyerRateFailArc;
    @SerializedName("rate_fail_count")
    private String rateFailCount;
    @SerializedName("rate_fail_dta")
    private String rateFailDta;
    @SerializedName("is_award")
    private String isAward;
    @SerializedName("aboutme")
    private String aboutme;
    @SerializedName("silence_period")
    private String silencePeriod;
    @SerializedName("silence_until_dta")
    private Object silenceUntilDta;
    @SerializedName("silence_reason")
    private String silenceReason;
    @SerializedName("is_confirmed")
    private String isConfirmed;
    @SerializedName("affiliate_popover_dta")
    private String affiliatePopoverDta;
    @SerializedName("is_aff_payment_made")
    private String isAffPaymentMade;
    @SerializedName("promoted_dta")
    private String promotedDta;
    @SerializedName("queued_dta")
    private Object queuedDta;
    @SerializedName("isSoundNewMessage")
    private String isSoundNewMessage;
    @SerializedName("isSoundNewProposal")
    private String isSoundNewProposal;
    @SerializedName("notes")
    private String notes;
    @SerializedName("is_monitored_topup")
    private String isMonitoredTopup;
    @SerializedName("is_banned_buyer")
    private String isBannedBuyer;
    @SerializedName("is_ban_topup")
    private String isBanTopup;
    @SerializedName("is_ban_paypal")
    private String isBanPaypal;
    @SerializedName("is_ban_stripe")
    private String isBanStripe;
    @SerializedName("is_idle_notify_sent")
    private String isIdleNotifySent;
    @SerializedName("score")
    private String score;
    @SerializedName("score_member")
    private String scoreMember;
    @SerializedName("score_last")
    private String scoreLast;
    @SerializedName("orders_cnt")
    private String ordersCnt;
    @SerializedName("orders_clicks")
    private String ordersClicks;
    @SerializedName("id_tsource")
    private Object idTsource;
    @SerializedName("dta_tsource")
    private Object dtaTsource;
    @SerializedName("reply_pm_stop_words")
    private String replyPmStopWords;
    @SerializedName("tech")
    private String tech;
    @SerializedName("sc_greybox")
    private String scGreybox;
    @SerializedName("response_ratings_cnt")
    private String responseRatingsCnt;
    @SerializedName("response_ratings_avg")
    private String responseRatingsAvg;
    @SerializedName("lang")
    private Object lang;
    @SerializedName("cpa_api_key")
    private Object cpaApiKey;
    @SerializedName("timezone")
    private String timezone;
    @SerializedName("dta_hidden_stats")
    private Object dtaHiddenStats;
    @SerializedName("only3d_state")
    private String only3dState;
    @SerializedName("phone_code")
    private Object phoneCode;
    @SerializedName("phone_number")
    private Object phoneNumber;
    @SerializedName("is_favourite")
    private Integer isFavourite;
    @SerializedName("is_blocked")
    private Integer isBlocked;
    @SerializedName("is_seller_active")
    private Integer isSellerActive;
    @SerializedName("country_name")
    private String countryName;
    @SerializedName("last_seen_text")
    private String lastSeenText;
    @SerializedName("is_spam")
    private Integer isSpam;
    @SerializedName("profileSolos")
    private ProfileSolosModel profileSolos;

    public String getPartner() {
        return partner;
    }

    public String getIdPartner() {
        return idPartner;
    }

    public String getAvatar() {
        return avatar;
    }

    public String getLastSeen() {
        return lastSeen;
    }

    public String getIsOnline() {
        String onlineText;
        if (isOnline == 1) {
            onlineText = "Online now";
        } else {
            onlineText = "Not online now";
        }
        return onlineText;
    }

    public Integer getClickPrice() {
        return clickPrice;
    }

    public Integer getSalesPercent() {
        return salesPercent;
    }

    public String getSalesBase() {
        return salesBase;
    }

    public Integer getCntNewMessages() {
        return cntNewMessages;
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getFullname() {
        return fullname;
    }

    public String getRole() {
        return role;
    }

    public String getPaypalEmail() {
        return paypalEmail;
    }

    public String getPaypalAffiliate() {
        return paypalAffiliate;
    }

    public Object getIdRef() {
        return idRef;
    }

    public String getIdRefOld() {
        return idRefOld;
    }

    public String getRefType() {
        return refType;
    }

    public String getRefLock() {
        return refLock;
    }

    public String getDtaReg() {
        return dtaReg;
    }

    public String getIpLastLogin() {
        return ipLastLogin;
    }

    public String getDtaFirstSuccessSolo() {
        return dtaFirstSuccessSolo;
    }

    public String getListSize() {
        return listSize;
    }

    public String getIsListVerify() {
        return isListVerify;
    }

    public String getListSizeUnverify() {
        return listSizeUnverify;
    }

    public String getAvatarExt() {
        return avatarExt;
    }

    public String getUid() {
        return uid;
    }

    public String getUidProfile() {
        return uidProfile;
    }

    public String getUidProfileDate() {
        return uidProfileDate;
    }

    public String getHash() {
        return hash;
    }

    public String getAcceptIn() {
        return acceptIn;
    }

    public String getSellerRep() {
        return sellerRep;
    }

    public String getSellerRateSuccess() {
        return sellerRateSuccess;
    }

    public String getSellerRateFail() {
        return sellerRateFail;
    }

    public String getSellerRateSuccessArc() {
        return sellerRateSuccessArc;
    }

    public String getSellerRateFailArc() {
        return sellerRateFailArc;
    }

    public String getBuyerRep() {
        return buyerRep;
    }

    public String getBuyerRateSuccess() {
        return buyerRateSuccess;
    }

    public String getBuyerRateFail() {
        return buyerRateFail;
    }

    public String getBuyerRateSuccessArc() {
        return buyerRateSuccessArc;
    }

    public String getBuyerRateFailArc() {
        return buyerRateFailArc;
    }

    public String getRateFailCount() {
        return rateFailCount;
    }

    public String getRateFailDta() {
        return rateFailDta;
    }

    public String getIsAward() {
        return isAward;
    }

    public String getAboutme() {
        return aboutme;
    }

    public String getSilencePeriod() {
        return silencePeriod;
    }

    public Object getSilenceUntilDta() {
        return silenceUntilDta;
    }

    public String getSilenceReason() {
        return silenceReason;
    }

    public String getIsConfirmed() {
        return isConfirmed;
    }

    public String getAffiliatePopoverDta() {
        return affiliatePopoverDta;
    }

    public String getIsAffPaymentMade() {
        return isAffPaymentMade;
    }

    public String getPromotedDta() {
        return promotedDta;
    }

    public Object getQueuedDta() {
        return queuedDta;
    }

    public String getIsSoundNewMessage() {
        return isSoundNewMessage;
    }

    public String getIsSoundNewProposal() {
        return isSoundNewProposal;
    }

    public String getNotes() {
        return notes;
    }

    public String getIsMonitoredTopup() {
        return isMonitoredTopup;
    }

    public String getIsBannedBuyer() {
        return isBannedBuyer;
    }

    public String getIsBanTopup() {
        return isBanTopup;
    }

    public String getIsBanPaypal() {
        return isBanPaypal;
    }

    public String getIsBanStripe() {
        return isBanStripe;
    }

    public String getIsIdleNotifySent() {
        return isIdleNotifySent;
    }

    public String getScore() {
        return score;
    }

    public String getScoreMember() {
        return scoreMember;
    }

    public String getScoreLast() {
        return scoreLast;
    }

    public String getOrdersCnt() {
        return ordersCnt;
    }

    public String getOrdersClicks() {
        return ordersClicks;
    }

    public Object getIdTsource() {
        return idTsource;
    }

    public Object getDtaTsource() {
        return dtaTsource;
    }

    public String getReplyPmStopWords() {
        return replyPmStopWords;
    }

    public String getTech() {
        return tech;
    }

    public String getScGreybox() {
        return scGreybox;
    }

    public String getResponseRatingsCnt() {
        return responseRatingsCnt;
    }

    public String getResponseRatingsAvg() {
        return responseRatingsAvg;
    }

    public Object getLang() {
        return lang;
    }

    public Object getCpaApiKey() {
        return cpaApiKey;
    }

    public String getTimezone() {
        return timezone;
    }

    public Object getDtaHiddenStats() {
        return dtaHiddenStats;
    }

    public String getOnly3dState() {
        return only3dState;
    }

    public Object getPhoneCode() {
        return phoneCode;
    }

    public Object getPhoneNumber() {
        return phoneNumber;
    }

    public Integer getIsFavourite() {
        return isFavourite;
    }

    public Integer getIsBlocked() {
        return isBlocked;
    }

    public Integer getIsSellerActive() {
        return isSellerActive;
    }

    public String getCountryName() {
        return countryName;
    }

    public String getLastSeenText() {
        return lastSeenText;
    }

    public Integer getIsSpam() {
        return isSpam;
    }

    public ProfileSolosModel getProfileSolos() {
        return profileSolos;
    }
}
