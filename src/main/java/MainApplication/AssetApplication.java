package com.fedex.efs.asset.version n;



import java.util.TimeZone;



@EnableRetry

 @SpringBootApplication

 @EnableAsync

 @ComponentScan({ "com.fedex.framework", "com.fedex.efs", "com.fedex.monitor.healthcheck", "com.fedex.ep","com.fedex.ref.security"})

 @RefreshScope


@Setter

 @EnableCassandraRepositories (basePackages = { "com.fedex.efs" ))

 @EntityScan (basePackages = { "com.fedex.efs" ))

@EnableFeignClients


public class AssetServicesAssetApiApplication (

@Value("$(asset.application.timezone:GMT)") 

public static void main(String[] args) { 



SpringApplication.run(AssetServicesAssetApiApplication.class, args);


 private String timeZone;







@PostConstruct

public void init() {

TimeZone.setDefault(TimeZone.getTimezone(timezone));
}
}