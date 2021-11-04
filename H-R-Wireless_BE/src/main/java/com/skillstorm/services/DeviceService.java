package com.skillstorm.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.skillstorm.beans.Device;
import com.skillstorm.beans.User;
import com.skillstorm.data.DeviceRepository;

@Service
public class DeviceService {

	@Autowired
	DeviceRepository repository;

	public List<Device> findAll() {

		return repository.findAll();
	}

	public Device saveDevice(Device device) {
		return repository.save(device);
	}
}
	
//	public Device updateDevice(Device device) {
//		return repository.update(device);
//	}
//
//	public Device saveDevice(Device device) {
//		return repository.save(device);
//	}
//
////	public Device updateDevice(Device device) {
////		return repository.update(device);
////	}
//
//
//	public void deleteDevice(Device device) {
//
//	}

