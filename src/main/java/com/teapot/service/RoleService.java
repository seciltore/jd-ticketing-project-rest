package com.teapot.service;

import com.teapot.dto.RoleDTO;
import com.teapot.exception.TicketingProjectException;

import java.util.List;

import java.util.List;

public interface RoleService {

    List<RoleDTO> listAllRoles();
    RoleDTO findById(Long id) throws TicketingProjectException;
}