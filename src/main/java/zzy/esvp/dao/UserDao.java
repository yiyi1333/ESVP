package zzy.esvp.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import zzy.esvp.eneity.User;

import java.util.List;

@Mapper
public interface UserDao {

//    public void save(User user);
//
//    public void update(User user);
//
//    public void delete(Integer id);
//
//    public User findById(Integer id);

    //    @Select("select * from user")
    public List<User> findAll();
}
