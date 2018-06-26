package com.ugdao.ugdao.Contant;

/**
 * Created by 78759 on 2018/4/8.
 */

public class Contants {

    public static final String URL = "http://waiqin.ugdao.com/";
    public static final String PicURL = URL + "Public/Upload/Image/";
    public static final String VoiURL = URL + "Public/Upload/Video/";

    public static final String Uri = URL + "index.php?m=Api";
    public static final String informationUri = Uri
            + "&a=report&work_addressid=";
    public static final String imageActionUrl = Uri + "&a=uploadImage";
    public static final String informationUri1 = Uri
            + "&a=report1";
    public static final String imageActionUrl1 = Uri + "&a=upload1";
    public static final String musicActionUrl = Uri + "&a=uploadVideo";
    //登录uri
    public static final String loginUri = Uri + "&a=Login";
    public static final String verUrl = Uri + "&a=checkVersion";
    public static final String URIAPI = Uri + "&a=getMessage";
    //图片上传的url
    public static final String picAndVoiUrl = Uri + "&a=upload";

    //数据上传的url
    public static final String managerinformationUrl = Uri + "&a=dataupload";
    public static final String deliveryUrl = Uri + "&a=handupload";
    public static final String receiptUrl = Uri + "&a=gethands";
    public static final String handmessageUrl = Uri + "&a=gethandsinfo";
    public static final String handmsumbitUrl = Uri + "&a=handssave";
    //版本跟新url
    public static final String downloadUri = URL + "Public/Upload/Down/yun.apk";
    public static final String positionUri = Uri
            + "&a=position&a_infophone=";
    public static final String registerUri = Uri
            + "bind.insert.php?bind_phone=";
    public static final String passwordUri = Uri + "&a=updatePwd&phone=";
    public static final String setTimeUri = Uri + "&a=setTime&phone=";
    public static final String fuelupUrl = Uri + "&a=uploadfilling";
    public static final String freightcarUrl = Uri + "&a=uploaddetail";
    public static final String maintenanceUrl = Uri + "&a=uploadmaintain";
    public static final int Success = 0;
    public static final int Failure = 1;
    public static final int CheckVersion = 2;

    public static final String PREFS_NAME = "phone_state";

    public static final String PREFS_KEY_PHONE_NUMBER = "phone_number";
    public static final String PREFS_KEY_PHONE_PASSWORD = "phone_password";
    public static final String PREFS_KEY_AUTO_LOGIN = "auto_login";
    public static final String PREFS_KEY_SAVE_PASSWORD = "save_password";
    public static final String PREFS_KEY_COMPANY_NAME = "company_name";
}
