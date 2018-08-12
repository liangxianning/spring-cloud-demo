package vip.liangxn.configclientconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import vip.liangxn.configclientconsumer.domain.AuthorConfig;

@Controller
@RequestMapping("configConsumer")
public class ConfigConsumerController {

    @Autowired
    private AuthorConfig authorConfig;

    @RequestMapping("/getAuthorInfo")
    @ResponseBody
    public String getAuthorInfo() {
        return " author信息是丛git上加载下来的 ：" + authorConfig.toString();
    }
}