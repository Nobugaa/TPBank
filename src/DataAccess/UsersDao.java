/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataAccess;

import Common.Library;
import Model.Users;
import java.util.Locale;

public class UsersDao {
    private static UsersDao instance = null;
    Library library = new Library();
    Users users = new Users();
    
    public static UsersDao Instance() {
        if (instance == null){
            synchronized (UsersDao.class) {
                if (instance == null){
                    instance = new UsersDao();
                }
            }
        }
        return instance;
    }
    
    public void login(Locale language) {
        library.getWordLanguage(language, "enterAccountNumber");
        int accountNumber = library.checkInputAccount(language);
        library.getWordLanguage(language, "enterPassword");
        String passString = library.checkInputPassword(language);
        System.out.println("Capcha: ");
        String captchaGenerated = library.generateCaptchaText();
        while (true) {
            if (library.checkInputCaptcha(captchaGenerated, language)) {
                library.getWordLanguage(language, "loginSuccess");
                System.out.println();
                return;
            } else {
                library.getWordLanguage(language, "errCaptchaIncorrect");
                System.out.println();
            }
        }
    }
    
}
