package com.tiendaonline.gestion.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.tiendaonline.gestion.dto.producto.ProductoResponse;
import com.tiendaonline.gestion.model.Producto;

public interface ProductoService {
	
	Producto crearProducto(Producto producto);
	
	Producto actualizarProducto(Long id, Producto producto);
	
	void eliminarProducto(Long id);
	
	Producto obtenerPorId(Long id);
	
	List<Producto> listarTodos();
	
	Page<ProductoResponse> listarProductosPaginados(int page, int size);

}
