package ua.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.entity.Device;

public interface DeviceShopRepository extends JpaRepository<Device, Integer>{

}
