package com.vti.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import com.vti.entity.Class;

@Repository
public interface IClassRepository extends JpaRepository<Class, Short>, JpaSpecificationExecutor<Class> {

}
