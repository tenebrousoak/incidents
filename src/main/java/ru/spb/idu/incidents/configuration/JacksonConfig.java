package ru.spb.idu.incidents.configuration;

import com.fasterxml.jackson.databind.module.SimpleModule;
import org.geolatte.geom.json.GeolatteGeomModule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JacksonConfig {

  @Bean
  public SimpleModule JtsModule() {
    return new GeolatteGeomModule();
  }
}
