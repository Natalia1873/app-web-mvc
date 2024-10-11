package com.keepconding.appweb.service;

import java.util.List;

import com.keepconding.appweb.entity.Empleado;

public interface EmpleadoService {
	//metodo para listar todos los empleados registrados
	List<Empleado> listarEmpleado();
	
	//metodo para insertar un registro de empleado
	Empleado guardarEmpleado(Empleado empleado);
	
	//metodo para buscar un empleado por id
	Empleado empleadoPorId(Long id);
	
	//metodo para borrar un registro de empleado
	void borrarEmpleado(Long id);
	
}
