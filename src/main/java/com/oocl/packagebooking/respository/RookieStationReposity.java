package com.oocl.packagebooking.respository;

import com.oocl.packagebooking.entity.Package;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RookieStationReposity extends JpaRepository<Package,String> {
    public List<Package> findByStatus(String status);
    public Package findByPackageId(String apackage);
}
