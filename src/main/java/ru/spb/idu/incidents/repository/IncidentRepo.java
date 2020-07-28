package ru.spb.idu.incidents.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import ru.spb.idu.incidents.domain.Incident;

import java.sql.Date;
import java.util.List;

@RepositoryRestResource
public interface IncidentRepo extends PagingAndSortingRepository<Incident, Long> {
  @RestResource(path = "getByDate", rel = "getByDate")
  List<Incident> findAllByStartGreaterThanEqualAndStartLessThanEqual(
          Date minDate, Date maxDate);
}
