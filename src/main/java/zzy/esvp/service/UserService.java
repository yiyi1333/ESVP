package zzy.esvp.service;

import org.springframework.transaction.annotation.Transactional;
import zzy.esvp.eneity.User;

import java.util.List;

@Transactional
public interface UserService {
    public List<User> findAll();
}
