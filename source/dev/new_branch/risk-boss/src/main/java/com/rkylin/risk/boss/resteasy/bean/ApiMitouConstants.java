package com.rkylin.risk.boss.resteasy.bean;

/**
 * Created by luke on 2016/11/4.
 */
public final class ApiMitouConstants {

  /**
   * 企业编号
   */
  public static final int PLAT_ID = 2;

  public static final String VALID_MOBILE = "1";

  /**
   * 注册用户API
   */
  public static final String REGISTER_API = "qapi/run.php?act=login&mod=reg";

  /**
   * 获取 token API
   */
  public static final String GET_TOKEN_API = "qapi/run.php?act=login";

  /**
   * 获取用户信息API
   */
  public static final String GET_USER_INFO_API = "qapi/run.php?act=login&mod=get";

  /**
   * 用户登陆API
   */
  public static final String LOGIN_API = "wap/index.php?ctl=apilogin";



  //订单缺少数据
  public static final String DATA_VALIDATE_FALSE="0";
  //已提交米投风控参数接口，待回调报告
  public static final String MITOU_API_WAIT="1";
  //提交米投风控参数接口 发生异常，待重新提交参数
  public static final String MITOU_API_FALURE="2";
  //成功回调米投风控报告
  public static final String MITOU_API_SUCCESS="3";

  public static final String NOT_COMMIT="notcommit";

  public static final String COMMIT="commit";

  public static final String REFUSE="refuse";

  public static final String ACCEPT="accept";

  public static final String FOREVER_REFUSE="foreverRefuse";


  /**
   * 悦视觉
   */
  public static final String YUESHIJUE_CHANNEL_ID = "M000025";

  /**
   * 美容分期
   */
  public static final String MEIRONG_CHANNEL_ID = "M000028";

  /**
   * 旅游分期
   */
  public static final String LVYOU_CHANNEL_ID = "M000027";


  /**
   * 企业钱包
   */
  public static final String QIYE_CHANNEL_ID = "M000017";

  /**
   * 汽车融资
   */
  public static final String CAR_CHANNEL_ID = "M000026";

  /**
   * 天联在线
   */
  public static final String TIANLIAN_CHANNEL_ID = "M000021";

  /**
   * 天下房仓
   */
  public static final String FANG_CHANNEL_ID = "M000016";


  /**
   * 万众国旅
   */
  public static final String WANZHONG_CHANNEL_ID = "M000015";

  /**
   * 融数钱包
   */
  public static final String RONGSHU_CHANNEL_ID = "M666666";

  public static final String BANGBANG_CHANNEL_ID = "M000020";

  public static final String KEZHAN_CHANNEL_ID = "M000004";





  private ApiMitouConstants() {}
}