package com.max.impl;

import com.max.interfaces.Repo;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Repository;

import javax.annotation.security.RolesAllowed;

@Repository
public class UserRepo implements Repo {

    @Secured(value = "ROLE_admin")
    @RolesAllowed(value = "ROLE_admin")
    @PreAuthorize(value = "hasRole('admin')")
    @PostAuthorize(value = "hasRole('admin')")
    public void createTable() {
        System.out.println("table was created");
    }
}
