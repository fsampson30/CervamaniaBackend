package com.sampson.CervamaniaBackend.repositories;

import com.sampson.CervamaniaBackend.model.Cerveja;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CervejaRepository extends JpaRepository<Cerveja, String> {
}
