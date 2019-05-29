package com.roombooking.demo.dao;

import com.roombooking.demo.entity.Order;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOrderDao extends PagingAndSortingRepository<Order,Long>, JpaSpecificationExecutor<Order> {

}
