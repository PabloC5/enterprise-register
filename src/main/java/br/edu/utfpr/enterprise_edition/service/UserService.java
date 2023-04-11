package br.edu.utfpr.enterprise_edition.service;

import br.edu.utfpr.enterprise_edition.model.dao.UserDao;
import br.edu.utfpr.enterprise_edition.model.domain.User;
import org.mindrot.jbcrypt.BCrypt;

public class UserService extends AbstractService <Long, User>{
    public UserService() {
        dao = new UserDao();
    }

    public String encriptPassword(String senha) {
        String hashedPassword = BCrypt.hashpw(senha, BCrypt.gensalt());
        return hashedPassword;
    }
}
