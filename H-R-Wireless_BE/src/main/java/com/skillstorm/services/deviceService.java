package com.skillstorm.services;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.skillstorm.beans.Device;
import com.skillstorm.beans.User;
import com.skillstorm.data.DeviceRepository;

@Service
public class deviceService {

	@Autowired
	DeviceRepository repository;
	
	public Optional<Device> findDevice(Device device) {
		
		return repository.findDevice(device);
	}
	
	public Device saveDevice(Device device) {
		return repository.saveDevice(device);
	}
	
	public Device updateDevice(Device device) {
		return repository.updateDevice(device);
	}


	public void deleteDevice(Device device) {
		
	}
}
