## 服务消费者

* 注册到eureka中
* 使用feign调用其他应用程序服务，使用Hystrix组件解决服务不可用问题
* 消费eureka-client-provider程序提供的服务
    * 查询公司信息 http://localhost:9091/company/companyInfo?companyName=springcloud
    * 查询团队信息 http://localhost:9091/company/teamInfo?teamName=springcloud.cn

