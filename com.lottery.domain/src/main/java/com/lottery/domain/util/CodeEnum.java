package com.lottery.domain.util;

/**
 * 号码信息
 */
public enum CodeEnum {

    /**
     * 时时彩数字号码
     */
    SSC_CODE_NUMBER("号码",new String[]{"0","1","2","3","4","5","6","7","8","9"}),

    /**
     * 时时彩和值号码
     */
    SSC_CODE_HZ("和值",new String[]{"0","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18",
            "19","20","21","22","23","24","25","26","27"}),
    /**
     * 时时彩两面总和号码
     */
    SSC_CODE_LMZH("两面总和",new String[]{"和大","和小","和单","和双"}),
    /**
     * 时时彩 大小单双号码
     */
    SSC_CODE_DXDS("大小单双",new String[]{"大","小","单","双"}),
    /**
     * 时时彩两面 大小
     */
    SSC_CODE_LMDX("两面大小单双",new String[]{"大","小","单","双","质","合"}),
    /**
     * 时时彩龙虎斗 号码
     */
    SSC_CODE_LH("龙虎斗",new String[]{"龙","虎","和"}),
    /**
     * pk10 数字号码
     */
    PK10_CODE_NUMBER("号码",new String[]{"01","02","03","04","05","06","07","08","09","10"}),

    /**
     * 十一选五
     */
    SYXW_NUMBER("号码",new String[]{"1","2","3","4","5","6","7","8","9","10","11"}),
    /**
     * pk10 冠亚和号码
     */
    PK10_CODE_GYHE("冠亚和",new String[]{"和大","和小","和单","和双","03","04","05","06","07","08","09",
            "10","11","12","13","14","15","16","17","18","19"}),
    /**
     * pk10 双面盘龙虎号码
     */
    PK10_CODE_SMPLH("双面盘龙虎",new String[]{"大","小","单","双","龙","虎"}),

    /**
     * pk10 双面盘大小单双号码
     */
    PK10_CODE_SMPDXDS("双面盘大小单双",new String[]{"大","小","单","双"}),

    /**
     * 六合彩 数字号码
     */
    LHC_CODE_NUMBER("数字号码",new String[]{"01","02","03","04","05","06","07","08","09","10",
            "11","12","13","14","15","16","17","18","19","20",
            "21","22","23","24","25","26","27","28","29","30",
            "31","32","33","34","35","36","37","38","39","40",
            "41","42","43","44","45","46","47","48","49"
    }),

    /**
     * 六合彩 两面号码
     */
    LHC_CODE_LM("两面号码",new String[]{"大","小","单","双","大单","大双","小单","小双","合大","合小",
            "合单","合双","尾大","尾小","家禽","野兽","红波","绿波","蓝波"
    }),

    /**
     * 六合彩 半波号码
     */
    LHC_CODE_BB("半波号码",new String[]{"红大","红小","红单","红双","红合单","红合双",
            "绿大","绿小","绿单","绿双","绿合单","绿合双",
            "蓝大","蓝小","蓝单","蓝双","蓝合单","蓝合双"
    }),

    /**
     * 六合彩 生肖号码
     */
    LHC_CODE_SX("生肖号码",new String[]{"鼠","牛","虎","兔","龙","蛇", "马","羊","猴","鸡","狗","猪"}),

    /**
     * 六合彩 头尾号码
     */
    LHC_CODE_TW("头尾号码",new String[]{"0头","1头","2头","3头","4头",
            "0尾","1尾","2尾","3尾","4尾","5尾","6尾","7尾","8尾","9尾"
    }),

    /**
     * 六合彩 尾数号码
     */
    LHC_CODE_WS("头尾号码",new String[]{"0尾","1尾","2尾","3尾","4尾","5尾","6尾","7尾","8尾","9尾"}),
    /**
     * 快三号码
     */
    KS_CODE_NUMBER("号码",new String[]{"1","2","3","4","5","6"}),
    /**
     * 快三和值号码
     */
    KS_HZ_NUMBER("和值",new String[]{"3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18"}),
    /**
     * 幸运28特码号码
     */
    XY28_CODE_NUMBER("特码",new String[]{"0", "1", "2","3", "4", "5", "6", "7", "8", "9",
            "10", "11", "12", "13", "14", "15", "16", "17", "18",
            "19", "20", "21", "22", "23", "24", "25", "26", "27"}),
    /**
     * 幸运28大小单双
     */
    XY28_CODE_DXDS("大小单双",new String[]{"大","小","单","双"}),

    /**
     * 梯子起点号码
     */
   TZ_CODE_QD("起点",new String[]{"左","右"}),

    /**
     * 梯子梯子号码
     */
    TZ_CODE_TZ("梯子",new String[]{"3","4"}),

    /**
     * 梯子终点号码
     */
    TZ_CODE_ZD("终点",new String[]{"单","双"}),

    /**
     * 梯子起点号码
     */
    TZ_CODE_ZDTZ("终点X梯子",new String[]{"单3","双3","单4","双4"}),
    ;

    CodeEnum(String name, String[] codes) {
        this.name = name;
        this.codes = codes;
    }

    private String name;

    private String[] codes;


    public String getName() {
        return name;
    }

    public String[] getCodes() {
        return codes;
    }

}
