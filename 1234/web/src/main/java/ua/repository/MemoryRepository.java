package ua.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.entity.Memory;

public interface MemoryRepository extends JpaRepository<Memory, Integer>{

}
