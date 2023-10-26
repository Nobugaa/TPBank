/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Common.Library;
import Model.Users;
import Respitory.IUserRepository;
import Respitory.UserRepository;
import View.Menu;
import java.util.ArrayList;
import java.util.Locale;

/**
 *
 * @author fpt
 */
public class TienPhongBank extends Menu<String>{
    static String[] mc = {"Vietnamese", "English", "Exit"};
    
    private Library library;
    private IUserRepository userRepository;
    Locale vietnamese = new Locale("vi");
    Locale english = Locale.ENGLISH;
    
    ArrayList<Users> students = new ArrayList<>();
    
    public TienPhongBank() {
        super("============================== Login Program ==============================", mc);
        library = new Library();
        userRepository = new UserRepository();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                userRepository.login(vietnamese);
                break;
            case 2:
                userRepository.login(english);
                break;
            case 3:
                System.out.println("Exit the program successfully!");
                System.exit(0);
                break;
        }
    }   
    
    
}
