package cn.ydsy.common.config.wx;

import cn.binarywang.wx.miniapp.api.WxMaService;
import cn.binarywang.wx.miniapp.api.impl.WxMaServiceImpl;
import cn.binarywang.wx.miniapp.config.WxMaConfig;
import cn.binarywang.wx.miniapp.config.WxMaInMemoryConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
@ConditionalOnClass(WxMaService.class)
public class WxMaConfiguration {

    @Value("${ydsy.wechat.appid}")
    private String appid;
    @Value("${ydsy.wechat.secret}")
    private String secret;
    @Value("${ydsy.wechat.token}")
    private String token;
    @Value("${ydsy.wechat.aeskey}")
    private String aesKey;
    @Value("${ydsy.wechat.msgdataformat}")
    private String msgDataFormat;


    @Bean()
    @ConditionalOnMissingBean()
    public WxMaConfig wxMaConfig() {
        WxMaInMemoryConfig config = new WxMaInMemoryConfig();
        config.setAppid(this.appid);
        config.setSecret(this.secret);
        config.setToken(this.token);
        config.setAesKey(this.aesKey);
        config.setMsgDataFormat(this.msgDataFormat);

        return config;
    }

    @Bean()
    @ConditionalOnMissingBean()
    public WxMaService wxMaService(WxMaConfig config) {

        WxMaService wxMaService = new WxMaServiceImpl();
        wxMaService.setWxMaConfig(config);
        return wxMaService;
    }

}