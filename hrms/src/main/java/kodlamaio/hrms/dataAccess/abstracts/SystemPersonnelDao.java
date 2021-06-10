package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concrete.SystemPersonnel;

public interface SystemPersonnelDao extends JpaRepository<SystemPersonnel, Integer> {

}
