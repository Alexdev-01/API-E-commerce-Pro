package com.tiendaonline.gestion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import com.tiendaonline.gestion.model.Producto;

public interface ProductoRepository  extends JpaRepository<Producto, Long>, JpaSpecificationExecutor<Producto> {

	Page<Producto> findByActivoTrue(Pageable pageable);
}
