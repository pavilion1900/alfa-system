package ru.alfabank.ufr.rsm.keycloak.entity;

import java.util.List;

public class UserRole {

    private String id;
    private String role;
    private List<String> permissions;
    private String label;
    private String value;
    private String keycloakID;
}
