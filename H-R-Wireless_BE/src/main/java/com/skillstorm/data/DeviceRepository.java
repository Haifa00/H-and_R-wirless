package com.skillstorm.data;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.skillstorm.beans.Device;

@Repository
public interface DeviceRepository extends JpaRepository<Device, Integer>{

	@Query(value = "select * from devices", nativeQuery = true)
	public List<Device> findAll();

//	public Device save(Device device);

	//public Device updateDevice(Device device);
 
}
