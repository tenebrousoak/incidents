package ru.spb.idu.incidents.repository;

import org.geolatte.geom.Geometry;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import ru.spb.idu.incidents.domain.Incident;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

@RepositoryRestResource
public interface IncidentRepo extends PagingAndSortingRepository<Incident, Long> {
  @RestResource(path = "getByDate", rel = "getByDate")
  List<Incident> findAllByStartGreaterThanEqualAndFinishLessThanEqual(Date minDate, Date maxDate);

  @Query(
      value =
          "select i from Incident i where i.start >= ?1 and i.finish <= ?2 and intersects(i.geometry, ST_SetSRID(?3, 4326)) = true")
  List<Incident> findAllByTimeAndGeometry(
      Timestamp minStamp, Timestamp maxStamp, Geometry boundaries);
}
