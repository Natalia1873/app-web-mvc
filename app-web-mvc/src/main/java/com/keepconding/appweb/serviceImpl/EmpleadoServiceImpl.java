package com.keepconding.appweb.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.keepconding.appweb.entity.Empleado;
import com.keepconding.appweb.repository.EmpleadoRepository;
import com.keepconding.appweb.service.EmpleadoService;

@Service
public class EmpleadoServiceImpl implements EmpleadoService {
	
	@Autowired
	private EmpleadoRepository empleadoRepository;

	@Override
	public List<Empleado> listarEmpleado() {
		return empleadoRepository.findAll();
	}

	@Override
	public Empleado guardarEmpleado(Empleado empleado) {
		return empleadoRepository.save(empleado);
	}

	@Override
	public Empleado empleadoPorId(Long id) {
		return empleadoRepository.findById(id).get();
	}

	@Override
	public void borrarEmpleado(Long id) {
		empleadoRepository.deleteById(id);
	}

	

}
