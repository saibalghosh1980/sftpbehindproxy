package com.oup.camel.sftpbehindproxy.config;

import com.jcraft.jsch.ProxyHTTP;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class ProxyConfig {

    @Bean(name = "sftpproxy")
    public ProxyHTTP proxyhttpConfig() {
        ProxyHTTP proxyHTTP = new ProxyHTTP("ouparray.oup.com", 8080);
        return proxyHTTP;
    }
}
