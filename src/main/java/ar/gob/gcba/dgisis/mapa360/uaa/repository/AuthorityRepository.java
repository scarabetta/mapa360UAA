package ar.gob.gcba.dgisis.mapa360.uaa.repository;

import ar.gob.gcba.dgisis.mapa360.uaa.domain.Authority;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the Authority entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
