package ru.spb.idu.incidents.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import ru.spb.idu.incidents.domain.Incident;

@Configuration
public class RepositoryRestConfig implements RepositoryRestConfigurer {
  private static final String CORS_BASE_PATTERN = "/**";

  @Override
  public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
    config.exposeIdsFor(Incident.class);
    config.getCorsRegistry().addMapping(CORS_BASE_PATTERN);
  }
}
