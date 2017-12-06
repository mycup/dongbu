package com.skan.potal.web.payment.normal;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PaymentAdminConfig {
	 /* ============================================================================== */
    /* =   PAGE : 결제 정보 환경 설정 PAGE                                          = */
    /* = -------------------------------------------------------------------------- = */
    /* =   Copyright (c)  2016   NHN KCP Inc.   All Rights Reserverd.               = */
    /* ============================================================================== */


    /* ============================================================================== */
    /* =   ※ 주의 ※                                                               = */
    /* = -------------------------------------------------------------------------- = */
    /* =  실결제 변경시 아래의 값들을 반드시 변경해 주십시오.                       = */
    /* = -------------------------------------------------------------------------- = */
    /* =  g_conf_gw_url   : testpaygw.kcp.co.kr -> paygw.kcp.co.kr로 변경           = */
    /* =  g_conf_site_cd  : KCP에서 발급한 사이트코드                               = */
    /* =  g_conf_site_key : KCP에서 발급한 사이트키                                 = */
    /* = -------------------------------------------------------------------------- = */


    /* ============================================================================== */
    /* =   01. 지불 데이터 셋업 (업체에 맞게 수정)                                  = */
    /* = -------------------------------------------------------------------------- = */
    /* = ※ 주의 ※                                                                 = */
    /* = * g_conf_gw_url 설정                                                       = */
    /* =    테스트 시 : g_conf_gw_url = "testpaygw.kcp.co.kr" ;                     = */
    /* =    실결제 시 : g_conf_gw_url = "paygw.kcp.co.kr" ;                         = */
    /* =                                                                            = */
    /* = * g_conf_log_dir 설정                                                      = */    
    /* =    log 생성 절대경로 입력                                                  = */
    /* = -------------------------------------------------------------------------- = */

	@Value("${admin.payment.g_conf_gw_url:exampledata}")
    public String g_conf_gw_url;
	@Value("${admin.payment.g_conf_log_dir:exampledata}")
	public String g_conf_log_dir;

    /* = -------------------------------------------------------------------------- = */
    /* =  이 부분은 수정하지 마십시오.                                              = */
    /* = -------------------------------------------------------------------------- = */

	public static String g_conf_log_level = "3";
	public static String g_conf_gw_port   = "8090";
	static int     g_conf_tx_mode   = 0;

    /* ============================================================================== */


    /* = -------------------------------------------------------------------------- = */
    /* =     02. 쇼핑몰 지불 필수 정보 설정(업체에 맞게 수정)                       = */
    /* = -------------------------------------------------------------------------- = */
    /* = ※ 주의 ※                                                                 = */
    /* =                                                                            = */
    /* = * g_conf_gw_url 설정                                                       = */
    /* =     테스트 시 : testpaygw.kcp.co.kr                                        = */
    /* =     실결제 시 : paygw.kcp.co.kr                                            = */
    /* =                                                                            = */
    /* = * g_conf_site_cd, g_conf_site_key 설정                                     = */
    /* =     실결제 시 :                                                            = */
    /* =         KCP에서 발급한 사이트코드(site_cd), 사이트키(site_key)를 반드시    = */
    /* =         변경해 주셔야 결제가 정상적으로 진행됩니다.                        = */
    /* =                                                                            = */
    /* =   테스트 시 :                                                              = */
    /* =         사이트코드(g_conf_site_cd) : BA001                                 = */
    /* =         사이트키(g_conf_site_key)  : 2T5.LgLrH--wbufUOvCqSNT__             = */
    /* =   실결제 시 :                                                              = */
    /* =         사이트코드(g_conf_site_cd) : KCP에서 발급한 사이트코드(site_cd)    = */
    /* =         사이트키(g_conf_site_key)  : KCP에서 발급한 사이트키(site_key)     = */
    /* =                                                                            = */
    /* = * g_conf_site_name 설정                                                    = */
    /* = 사이트명 설정(한글 불가) : Payplus Plugin 오른쪽 상단에 표기되는 값입니다. = */
    /* =                           반드시 영문자로 설정하여 주시기 바랍니다.        = */
    /* =                                                                            = */
    /* = -------------------------------------------------------------------------- = */
    
    @Value("${admin.payment.g_conf_site_cd:example}")
    public String g_conf_site_cd;
    @Value("${admin.payment.g_conf_site_key:example}")
    public String g_conf_site_key;
    @Value("${admin.payment.g_conf_site_name:example}")
    public String g_conf_site_name;

    /* ============================================================================== */
}