/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Respitory;

import DataAccess.UsersDao;
import Model.Users;
import java.util.ArrayList;
import java.util.Locale;

public class UserRepository implements IUserRepository{
    private ArrayList<Users> students;

    public UserRepository() {
        this.students = new ArrayList<>();
    }

    @Override
    public void login(Locale language) {
        UsersDao.Instance().login(language);
    }
    

    
    
}