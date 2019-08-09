#  服务网关 spring-cloud-gateway
- 提供动态路由转发服务功能
http://localhost:8080/microservice-producer1/msg   
http://localhost:8080/microservice-producer2/msg

- 提供静态资源转发功能   
http://localhost:8080/microservice-producer1/index  

- 提供hystrix熔断、和降级  
http://localhost:8080/microservice-producer1/hystrixTest  
将返回降级接口：FallBackController.java

- 提供熔断接口重试
http://localhost:8080/microservice-producer1/hystrixTest  


- 提供不可用服务重试  

- 拦截并修改访问参数

- 拦截并修改返回信息
