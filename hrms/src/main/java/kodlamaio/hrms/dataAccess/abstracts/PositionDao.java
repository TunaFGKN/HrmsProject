package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concrete.Position;

public interface PositionDao extends JpaRepository<Position, Integer> {

}
