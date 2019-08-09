package com.java;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;


@SpringBootApplication
@EnableEurekaClient
public class ApplicationGateway {

  static Logger logger = LoggerFactory.getLogger(ApplicationGateway.class);

  public static void main(String[] args) {
    SpringApplication.run(ApplicationGateway.class, args);

    logger.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    logger.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    logger.info("----microservice-eureka started-----");
    logger.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    logger.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
  }

  @Bean
  public RouteLocator retryRouteLocator(RouteLocatorBuilder builder) {
    return builder.routes()
        .route("retry", r -> r.path("/*")
            .filters(f -> f.stripPrefix(1)
                .retry(config -> config.setRetries(2)
//                    .setStatuses(HttpStatus.INTERNAL_SERVER_ERROR, HttpStatus.GATEWAY_TIMEOUT)
                ))
            .uri("forward:/fallback"))
        .build();
  }

}
