package ru.spb.idu.incidents.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import org.geolatte.geom.Geometry;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Getter
@ToString(of = {"title", "geometry"})
@EqualsAndHashCode(of = "geometry")
@Entity
@Table(name = "events")
public class Incident {

  @Id private Long id;

  @Column(name = "center")
  private Geometry geometry;

  private String title;
  private Timestamp start;
  private Timestamp finish;
}
