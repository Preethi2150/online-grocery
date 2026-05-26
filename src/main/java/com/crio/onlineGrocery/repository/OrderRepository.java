package com.crio.onlineGrocery.repository;

import com.crio.onlineGrocery.entity.GroceryOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<GroceryOrder, Long> {
}

