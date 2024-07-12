package com.xy.gateway.config.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

/**
 * 验证码配置
 *
 * @author ruoyi
 */
@Configuration
@RefreshScope//nacos配置中心的配置项发生变化时，自动刷新
@ConfigurationProperties(prefix = "security.captcha")
public class CaptchaProperties {
    /**
     * 验证码开关
     */
    private Boolean enabled; //与nacos配置中心的配置项对应

    /**
     * 验证码类型（math 数组计算 char 字符）
     */
    private String type; //与nacos配置中心的配置项对应

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
