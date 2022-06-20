package br.com.estrutura_repetitiva.exercice01;
public class User {
    private String name;
    private String surname;
    private String CPF;
    private String email;
    private String password;

    public User(String name, String surname, String CPF, String email, String password) {
        this.name = name;
        this.surname = surname;
        this.CPF = CPF;
        this.email = email;
        this.password = password;
    }

    public User(String CPF, String email, String password) {
        this.CPF = CPF;
        this.email = email;
        this.password = password;
    }

    public User() {
    }

    
    
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCPF() {
        return CPF;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }
 
    
}
