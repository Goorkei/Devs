package Kodlama.io.Devs.dataAccess.abstacts;

import Kodlama.io.Devs.entities.concretes.SubTechnology;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubTechnologyRepository extends JpaRepository<SubTechnology,Integer> {
}
