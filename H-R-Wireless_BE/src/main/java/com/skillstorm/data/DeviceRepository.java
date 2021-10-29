package com.skillstorm.data;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.skillstorm.beans.Device;

@Repository
public interface DeviceRepository extends JpaRepository<Device, Integer>{

	public Optional<Device> findByDeviceId(Device device);

	public Device save(Device device);

	//public Device updateDevice(Device device);

}
