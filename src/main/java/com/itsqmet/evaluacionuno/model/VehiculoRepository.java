package com.itsqmet.evaluacionuno.model;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VehiculoRepository extends JpaRepository<Vehiculo, Long> {

    List<Vehiculo> findByModelo(String modelo);

    List<Vehiculo> findByCategoriaIgnoreCaseAndUnidadesDisponiblesGreaterThan(String categoria, Integer unidadesDisponibles);

    List<Vehiculo> findByPrecioPorDiaBetweenOrderByPrecioPorDiaAsc(Double precioMinimo, Double precioMaximo);

    List<Vehiculo> findByModeloContainingIgnoreCase(String modelo);
}
