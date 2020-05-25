package com.taxicompany.taxi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.taxicompany.taxi.models.Property;

@Repository
public interface PropertyRepository extends JpaRepository<Property, Long> {
}
