package com.ifsoftwaresolutions.sis.entity;

import java.util.UUID;

public class User {
    private UUID userId;
    private String email;
    private String password;
    private enum role {
        ADMIN,
        STUDENT,
        TEACHER
    };
    private String initials;
    private String firstName;
    private String middleName;
    private String lastName;


}
