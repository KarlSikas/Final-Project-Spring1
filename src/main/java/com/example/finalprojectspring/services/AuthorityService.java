package com.example.finalprojectspring.services;

import com.example.finalprojectspring.exceptions.AuthorityNotFoundException;
import com.example.finalprojectspring.models.Authority;

import java.util.List;

/**
 * @author Sergei Oksanen
 * @Date 3/28/2023
 */
public interface AuthorityService {
    /**
     * To fina all authorities
     *
     * @return a list of authorities
     */
    List<Authority> findAllAuthorities();

    /**
     * To find authority by name
     *
     * @param name Authority name
     * @return Authority
     */
    Authority findAuthorityByName(String name) throws AuthorityNotFoundException;

    /**
     * To create a new authority
     *
     * @param authority Authority
     */
    void createAuthority(Authority authority);
}
