package vip.liangxn.configclientconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConfigClientConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientConsumerApplication.class, args);
    }
}
