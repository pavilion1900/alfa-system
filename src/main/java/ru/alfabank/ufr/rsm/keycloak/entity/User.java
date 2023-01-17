package ru.alfabank.ufr.rsm.keycloak.entity;

import com.mongodb.DBRef;

import java.time.LocalDateTime;
import java.util.List;

public class User {

    private Object id;
    private String name;
    private String login;
    private String email;
    private String status;
    private LocalDateTime registrationDate;
    private boolean isSparxCreated;
    private boolean isNew;
    private boolean emailEditable;
    private List<DBRef> roles;
}
