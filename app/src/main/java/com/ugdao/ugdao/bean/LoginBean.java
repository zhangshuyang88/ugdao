package com.ugdao.ugdao.bean;

import java.util.List;

/**
 * Created by 78759 on 2018/4/8.
 */

public class LoginBean {


    /**
     * status : 2
     * version : 3.1
     * companyName : xxxxx有限公司
     * companyId : 3
     * shopNum :
     * ptype : 3
     * hands : 0
     * type1 : [{"id":"91","title":"(通用)每日报道","remark":"每日早9：30前到店面巡店拍照门头定位并上报，来计算考勤。","company_id":"3"},{"id":"92","title":"(通用)请假","remark":"发送短信的类型","company_id":"3"}]
     * goodstype : [{"id":"1","title":"中式有机","pid":"0"},{"id":"2","title":"日式有机","pid":"0"},{"id":"3","title":"大米","pid":"0"},{"id":"4","title":"排气袋装有机杂粮","pid":"0"},{"id":"5","title":"有机杂粮系列","pid":"0"},{"id":"6","title":"有机面条系列","pid":"0"},{"id":"7","title":"有机米粉","pid":"0"},{"id":"8","title":"奶粉系列","pid":"0"},{"id":"9","title":"日式调味品","pid":"0"},{"id":"11","title":"根茎类","pid":"0"},{"id":"12","title":"叶菜类","pid":"0"},{"id":"13","title":"果菜类","pid":"0"},{"id":"15","title":"老宽","pid":"0"},{"id":"16","title":"有机晾晒酱油（老抽）300ml","pid":"1"},{"id":"17","title":"有机糯香醋300ml","pid":"1"},{"id":"18","title":"有机陈香醋500ml","pid":"1"},{"id":"19","title":"湖西岛特级本酿造有机酿造酱油(500ml)","pid":"2"},{"id":"20","title":"湖西岛特级本酿造有机酿造酱油(1L)","pid":"2"},{"id":"21","title":"湖西岛特级本酿造有机酿造酱油(300ml)","pid":"2"},{"id":"22","title":"湖西岛特级本酿造有机酿造酱油(200ml)","pid":"2"},{"id":"23","title":"湖西岛特级有机儿童酱油(250ml)","pid":"2"},{"id":"24","title":"湖西岛有机酿造白米醋","pid":"2"},{"id":"25","title":"湖西岛有机酿造黑醋","pid":"2"},{"id":"26","title":"湖西岛有机酿造熏米醋","pid":"2"},{"id":"27","title":"湖西岛有机酿造甘白米醋(300ml)","pid":"2"},{"id":"28","title":"湖西岛有机酿造甘白米醋(200ml)","pid":"2"},{"id":"29","title":"湖西岛有机酿造柠檬米醋(300ml)","pid":"2"},{"id":"30","title":"湖西岛有机酿造柠檬米醋(200ml)","pid":"2"},{"id":"31","title":"排气袋装有机大米350克","pid":"4"},{"id":"32","title":"排气袋装有机杂粮系列-小米","pid":"4"},{"id":"33","title":"排气袋装有机杂粮系列-绿豆","pid":"4"},{"id":"34","title":"排气袋装有机杂粮系列-红豆","pid":"4"},{"id":"35","title":"排气袋装有机杂粮系列-黄豆","pid":"4"},{"id":"36","title":"排气袋装有机杂粮系列-玉米糁","pid":"4"},{"id":"37","title":"有机黄豆","pid":"5"},{"id":"38","title":"有机绿豆","pid":"5"},{"id":"39","title":"有机红小豆","pid":"5"},{"id":"40","title":"有机黑豆","pid":"5"},{"id":"41","title":"有机小米","pid":"5"},{"id":"42","title":"有机玉米糁","pid":"5"},{"id":"43","title":"有机大米500g*6袋/盒","pid":"3"},{"id":"44","title":"有机大米1KG/盒","pid":"3"},{"id":"45","title":"有机龙须面","pid":"6"},{"id":"46","title":"有机宽面","pid":"6"},{"id":"47","title":"有机拉面","pid":"6"},{"id":"48","title":"有机纯米粉","pid":"7"},{"id":"49","title":"有机纯米粥片","pid":"7"},{"id":"50","title":"安姆可金装婴儿配方奶粉第1段","pid":"8"},{"id":"51","title":"安姆可金装较大婴儿配方奶粉第2段","pid":"8"},{"id":"52","title":"安姆可金装幼儿配方奶粉第3段","pid":"8"},{"id":"53","title":"黄豆香通用(500ml)","pid":"9"},{"id":"54","title":"黄豆香通用(1L)","pid":"9"},{"id":"56","title":"胡萝卜","pid":"11"},{"id":"57","title":"土豆","pid":"11"},{"id":"58","title":"红洋葱","pid":"11"},{"id":"59","title":"红薯","pid":"11"},{"id":"60","title":"紫薯","pid":"11"},{"id":"61","title":"油菜","pid":"12"},{"id":"62","title":"小油菜","pid":"12"},{"id":"63","title":"菜心","pid":"12"},{"id":"64","title":"奶白菜","pid":"12"},{"id":"65","title":"杭白菜","pid":"12"},{"id":"66","title":"菠菜","pid":"12"},{"id":"67","title":"油麦菜","pid":"12"},{"id":"68","title":"叶生菜","pid":"12"},{"id":"69","title":"芥兰","pid":"12"},{"id":"70","title":"娃娃菜","pid":"12"},{"id":"71","title":"紫甘蓝","pid":"12"},{"id":"72","title":"西兰花","pid":"12"},{"id":"73","title":"圆白菜","pid":"12"},{"id":"74","title":"小白菜","pid":"12"},{"id":"75","title":"韭菜","pid":"12"},{"id":"76","title":"空心菜","pid":"12"},{"id":"77","title":"地瓜叶","pid":"12"},{"id":"78","title":"红秋葵","pid":"12"},{"id":"79","title":"茼蒿","pid":"12"},{"id":"80","title":"蒿子杆","pid":"12"},{"id":"81","title":"罗莎绿","pid":"12"},{"id":"82","title":"豌豆尖","pid":"12"},{"id":"83","title":"红菜心","pid":"12"},{"id":"84","title":"土芹","pid":"12"},{"id":"85","title":"茴香","pid":"12"},{"id":"86","title":"中葱","pid":"12"},{"id":"87","title":"白萝卜","pid":"12"},{"id":"88","title":"西芹","pid":"12"},{"id":"89","title":"樱桃萝卜","pid":"12"},{"id":"90","title":"豇豆","pid":"13"},{"id":"91","title":"小西红柿","pid":"13"},{"id":"92","title":"青椒","pid":"13"},{"id":"93","title":"杭椒","pid":"13"},{"id":"94","title":"朝天椒","pid":"13"},{"id":"95","title":"无丝豆","pid":"13"},{"id":"96","title":"甜豆","pid":"13"},{"id":"97","title":"苦瓜","pid":"13"},{"id":"98","title":"丝瓜","pid":"13"},{"id":"99","title":"糯玉米","pid":"13"},{"id":"100","title":"绿南瓜","pid":"13"},{"id":"101","title":"红南瓜","pid":"13"},{"id":"102","title":"草莓","pid":"13"},{"id":"103","title":"乳黄瓜","pid":"13"},{"id":"104","title":"大黄瓜","pid":"13"},{"id":"105","title":"大西红柿","pid":"13"},{"id":"106","title":"尖椒","pid":"13"},{"id":"107","title":"长茄/紫茄子","pid":"13"},{"id":"108","title":"甜玉米","pid":"13"},{"id":"109","title":"小青菜","pid":"12"},{"id":"110","title":"鸡毛菜","pid":"12"},{"id":"111","title":"四季鲜纯酿500ml","pid":"9"},{"id":"112","title":"黄豆香老抽500ml","pid":"9"},{"id":"113","title":"有机晾晒酱油(通用型)500ml","pid":"1"},{"id":"114","title":"有机晾晒酱油（通用型）300ml","pid":"1"},{"id":"115","title":"有机晾晒酱油（生抽）300ml","pid":"1"},{"id":"116","title":"有机陈香醋300ml","pid":"1"},{"id":"117","title":"黄豆香生抽500ml","pid":"9"},{"id":"118","title":"宽牌米醋480ml","pid":"9"},{"id":"119","title":"四季鲜纯酿1L","pid":"9"},{"id":"120","title":"黄豆酱油1L","pid":"15"},{"id":"121","title":"黄豆酱油2L","pid":"15"},{"id":"122","title":"精制宽印酱油1.8L","pid":"15"},{"id":"123","title":"米醋2L","pid":"15"},{"id":"124","title":"米醋1L","pid":"15"},{"id":"125","title":"米醋480","pid":"15"},{"id":"126","title":"纯粮白醋1.72","pid":"15"},{"id":"127","title":"料酒2L","pid":"15"},{"id":"128","title":"料酒500","pid":"15"},{"id":"129","title":"本酿造1L","pid":"15"},{"id":"130","title":"普酿宽印酱油1.8","pid":"15"},{"id":"131","title":"薄荷","pid":"12"},{"id":"132","title":"纯粮白醋480","pid":"15"}]
     */

    private String status;
    private String version;
    private String companyName;
    private String companyId;
    private String shopNum;
    private String ptype;
    private String hands;
    private List<Type1Bean> type1;
    private List<GoodstypeBean> goodstype;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getShopNum() {
        return shopNum;
    }

    public void setShopNum(String shopNum) {
        this.shopNum = shopNum;
    }

    public String getPtype() {
        return ptype;
    }

    public void setPtype(String ptype) {
        this.ptype = ptype;
    }

    public String getHands() {
        return hands;
    }

    public void setHands(String hands) {
        this.hands = hands;
    }

    public List<Type1Bean> getType1() {
        return type1;
    }

    public void setType1(List<Type1Bean> type1) {
        this.type1 = type1;
    }

    public List<GoodstypeBean> getGoodstype() {
        return goodstype;
    }

    public void setGoodstype(List<GoodstypeBean> goodstype) {
        this.goodstype = goodstype;
    }

    public static class Type1Bean {
        /**
         * id : 91
         * title : (通用)每日报道
         * remark : 每日早9：30前到店面巡店拍照门头定位并上报，来计算考勤。
         * company_id : 3
         */

        private String id;
        private String title;
        private String remark;
        private String company_id;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public String getCompany_id() {
            return company_id;
        }

        public void setCompany_id(String company_id) {
            this.company_id = company_id;
        }
    }

    public static class GoodstypeBean {
        /**
         * id : 1
         * title : 中式有机
         * pid : 0
         */

        private String id;
        private String title;
        private String pid;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getPid() {
            return pid;
        }

        public void setPid(String pid) {
            this.pid = pid;
        }
    }
}
