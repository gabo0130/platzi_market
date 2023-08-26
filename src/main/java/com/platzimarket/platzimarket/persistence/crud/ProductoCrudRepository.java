package com.platzimarket.platzimarket.persistence.crud;

import org.springframework.data.repository.CrudRepository;

import com.platzimarket.platzimarket.persistence.entity.Producto;

import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {
    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);
    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);
}
