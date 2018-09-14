package com.kerimovalex.testproject.model;

import com.google.gson.annotations.SerializedName;

public class ProfileSolosModel {
    @SerializedName("id")
    private String id;
    @SerializedName("id_user")
    private String idUser;
    @SerializedName("clicks_max")
    private String clicksMax;
    @SerializedName("clicks_min")
    private String clicksMin;
    @SerializedName("clicks_max_daily")
    private String clicksMaxDaily;
    @SerializedName("click_price")
    private String clickPrice;
    @SerializedName("click_price_min")
    private String clickPriceMin;
    @SerializedName("click_price_max")
    private String clickPriceMax;
    @SerializedName("is_active")
    private String isActive;
    @SerializedName("is_baned")
    private String isBaned;
    @SerializedName("sell_mon")
    private String sellMon;
    @SerializedName("sell_tue")
    private String sellTue;
    @SerializedName("sell_wed")
    private String sellWed;
    @SerializedName("sell_thu")
    private String sellThu;
    @SerializedName("sell_fri")
    private String sellFri;
    @SerializedName("sell_sat")
    private String sellSat;
    @SerializedName("sell_sun")
    private String sellSun;
    @SerializedName("overdelivery_percent")
    private String overdeliveryPercent;
    @SerializedName("odf_sendto")
    private String odfSendto;
    @SerializedName("odf_url")
    private Object odfUrl;
    @SerializedName("is_cpa")
    private String isCpa;
    @SerializedName("locked_days")
    private LockedDaysModel lockedDays;
    @SerializedName("solos_number")
    private String solosNumber;
    @SerializedName("max_clicks")
    private String maxClicks;
    @SerializedName("order_delay")
    private String orderDelay;
    @SerializedName("order_ttl")
    private String orderTtl;
    @SerializedName("is_kent")
    private String isKent;
    @SerializedName("kent_percent")
    private String kentPercent;
    @SerializedName("kent_note")
    private String kentNote;
    @SerializedName("extra_price_swipe")
    private Object extraPriceSwipe;
    @SerializedName("extra_price_squeeze")
    private Object extraPriceSqueeze;
    @SerializedName("extra_price_custom_name1")
    private String extraPriceCustomName1;
    @SerializedName("extra_price_custom_value1")
    private Object extraPriceCustomValue1;
    @SerializedName("sales_cnt")
    private String salesCnt;
    @SerializedName("sales_clicks")
    private String salesClicks;
    @SerializedName("refund_rate")
    private String refundRate;
    @SerializedName("total_cnt")
    private String totalCnt;
    @SerializedName("refunded_cnt")
    private String refundedCnt;
    @SerializedName("id_solo_sales")
    private String idSoloSales;
    @SerializedName("sales_cnt_total")
    private String salesCntTotal;
    @SerializedName("sales_cnt_base")
    private String salesCntBase;
    @SerializedName("sales_cnt_nosale")
    private String salesCntNosale;
    @SerializedName("hot_sales_cnt")
    private String hotSalesCnt;
    @SerializedName("hot_dta")
    private String hotDta;
    @SerializedName("before_order_form")
    private Object beforeOrderForm;
    @SerializedName("after_order_form")
    private Object afterOrderForm;
    @SerializedName("best_solo_timezone")
    private String bestSoloTimezone;
    @SerializedName("best_solo_time")
    private String bestSoloTime;
    @SerializedName("search_handicap")
    private String searchHandicap;
    @SerializedName("proposals_cnt")
    private String proposalsCnt;
    @SerializedName("is_accept_bitcoin")
    private String isAcceptBitcoin;
    @SerializedName("is_sms_verify")
    private String isSmsVerify;
    @SerializedName("is_sms_verified")
    private String isSmsVerified;

    public String getId() {
        return id;
    }

    public String getIdUser() {
        return idUser;
    }

    public String getClicksMax() {
        return clicksMax;
    }

    public String getClicksMin() {
        return clicksMin;
    }

    public String getClicksMaxDaily() {
        return clicksMaxDaily;
    }

    public String getClickPrice() {
        return clickPrice;
    }

    public String getClickPriceMin() {
        return clickPriceMin;
    }

    public String getClickPriceMax() {
        return clickPriceMax;
    }

    public String getIsActive() {
        return isActive;
    }

    public String getIsBaned() {
        return isBaned;
    }

    public String getSellMon() {
        return sellMon;
    }

    public String getSellTue() {
        return sellTue;
    }

    public String getSellWed() {
        return sellWed;
    }

    public String getSellThu() {
        return sellThu;
    }

    public String getSellFri() {
        return sellFri;
    }

    public String getSellSat() {
        return sellSat;
    }

    public String getSellSun() {
        return sellSun;
    }

    public String getOverdeliveryPercent() {
        return overdeliveryPercent;
    }

    public String getOdfSendto() {
        return odfSendto;
    }

    public Object getOdfUrl() {
        return odfUrl;
    }

    public String getIsCpa() {
        return isCpa;
    }

    public LockedDaysModel getLockedDays() {
        return lockedDays;
    }

    public String getSolosNumber() {
        return solosNumber;
    }

    public String getMaxClicks() {
        return maxClicks;
    }

    public String getOrderDelay() {
        return orderDelay;
    }

    public String getOrderTtl() {
        return orderTtl;
    }

    public String getIsKent() {
        return isKent;
    }

    public String getKentPercent() {
        return kentPercent;
    }

    public String getKentNote() {
        return kentNote;
    }

    public Object getExtraPriceSwipe() {
        return extraPriceSwipe;
    }

    public Object getExtraPriceSqueeze() {
        return extraPriceSqueeze;
    }

    public String getExtraPriceCustomName1() {
        return extraPriceCustomName1;
    }

    public Object getExtraPriceCustomValue1() {
        return extraPriceCustomValue1;
    }

    public String getSalesCnt() {
        return salesCnt;
    }

    public String getSalesClicks() {
        return salesClicks;
    }

    public String getRefundRate() {
        return refundRate;
    }

    public String getTotalCnt() {
        return totalCnt;
    }

    public String getRefundedCnt() {
        return refundedCnt;
    }

    public String getIdSoloSales() {
        return idSoloSales;
    }

    public String getSalesCntTotal() {
        return salesCntTotal;
    }

    public String getSalesCntBase() {
        return salesCntBase;
    }

    public String getSalesCntNosale() {
        return salesCntNosale;
    }

    public String getHotSalesCnt() {
        return hotSalesCnt;
    }

    public String getHotDta() {
        return hotDta;
    }

    public Object getBeforeOrderForm() {
        return beforeOrderForm;
    }

    public Object getAfterOrderForm() {
        return afterOrderForm;
    }

    public String getBestSoloTimezone() {
        return bestSoloTimezone;
    }

    public String getBestSoloTime() {
        return bestSoloTime;
    }

    public String getSearchHandicap() {
        return searchHandicap;
    }

    public String getProposalsCnt() {
        return proposalsCnt;
    }

    public String getIsAcceptBitcoin() {
        return isAcceptBitcoin;
    }

    public String getIsSmsVerify() {
        return isSmsVerify;
    }

    public String getIsSmsVerified() {
        return isSmsVerified;
    }
}
