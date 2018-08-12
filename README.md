SpringCloud微服务学习demo

* eureka-server 注册中心
* eureka-client-provider 服务应用，提供者
* config-client-consumer 服务应用，消费者，但同时也是提供者，看具体情况
* config-server 配置中心
* config-client-consumer 服务应用，练习使用配置中心加载远程文件信息
* zuul-service 网关应用，主要是用于放置在其他应用前，对请求进行过滤和权限检查等
* zuul-service-using-config 网关应用，同上，区别在于使用了配置中心
