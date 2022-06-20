package br.com.estrutura_repetitiva.exercice01;

import java.util.ArrayList;

public class ListUsers {
    ArrayList<User> listUsers;

    public ListUsers() {
        this.listUsers = new ArrayList<>();
    }
    
    public void AddUsers(User user){
        this.listUsers.add(user);
    }
    
    public boolean FindUser(User user){
        for (User users : listUsers) {
            if (((user.getEmail().equals(users.getEmail())) || ((user.getCPF().equals(users.getCPF())))) && ((user.getPassword().equals(users.getPassword())))){
                return true;
            }
        }
        return false;
    }
}
