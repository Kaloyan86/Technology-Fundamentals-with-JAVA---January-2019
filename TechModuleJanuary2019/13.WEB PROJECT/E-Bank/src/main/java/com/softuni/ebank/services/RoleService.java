package com.softuni.ebank.services;

import com.softuni.ebank.entities.Role;
import com.softuni.ebank.repositories.RoleRepository;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;
import java.util.Arrays;

@Service
@Transactional
public class RoleService {

    private final RoleRepository roleRepository;

    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @PostConstruct
    public void seedRolesInDb() {
        if (this.roleRepository.count() == 0) {
            Role roleUser = new Role();
            roleUser.setAuthority("USER");
            Role roleAdmin = new Role();
            roleAdmin.setAuthority("ADMIN");
            this.roleRepository.saveAll(Arrays.asList(roleUser, roleAdmin));
        }
    }
}
