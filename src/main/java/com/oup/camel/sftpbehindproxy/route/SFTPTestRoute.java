package com.oup.camel.sftpbehindproxy.route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class SFTPTestRoute extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("timer://runOnce?repeatCount=1")
                .setBody().simple("simple")
                .log("File polled")
                .to("sftp://sftp012.successfactors.eu//LMS//test.csv?username=OUPTEST&password=9pgdCQnV8N2OE&preferredAuthentications=password");
    }
}
