package org.blog.model;

public class User {
    private Long id;

    private String nicename;

    private String name;

    private String password;

    private String email;

    private String islock;

    private String isreadonly;

    private String iswrite;

    private String isadmin;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNicename() {
        return nicename;
    }

    public void setNicename(String nicename) {
        this.nicename = nicename == null ? null : nicename.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getIslock() {
        return islock;
    }

    public void setIslock(String islock) {
        this.islock = islock == null ? null : islock.trim();
    }

    public String getIsreadonly() {
        return isreadonly;
    }

    public void setIsreadonly(String isreadonly) {
        this.isreadonly = isreadonly == null ? null : isreadonly.trim();
    }

    public String getIswrite() {
        return iswrite;
    }

    public void setIswrite(String iswrite) {
        this.iswrite = iswrite == null ? null : iswrite.trim();
    }

    public String getIsadmin() {
        return isadmin;
    }

    public void setIsadmin(String isadmin) {
        this.isadmin = isadmin == null ? null : isadmin.trim();
    }
}