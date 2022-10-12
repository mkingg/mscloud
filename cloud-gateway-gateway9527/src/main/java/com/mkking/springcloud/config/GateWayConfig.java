package com.mkking.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author mkingg
 * @Description:
 */
@Configuration
public class GateWayConfig {

    @Bean
    public RouteLocator routeLocator(RouteLocatorBuilder routeLocatorBuilder){
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        routes.route("path_route",r -> r.path("/guonei").uri("https://news.baidu.com/guonei")).build();
        routes.route("path_route",r -> r.path("/guoji").uri("https://news.baidu.com/guoji")).build();
        return routes.build();
    }
}
