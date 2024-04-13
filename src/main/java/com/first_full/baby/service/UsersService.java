package com.first_full.baby.service;
import com.first_full.baby.model.Users;
import java.util.List;
import java.util.Optional;

public interface UsersService {
    public boolean saveUser(Users userDetail);
    public List<Users> getAllUsers();
    public Users getUser(String email);
    public List<Users>  deleteUser(String email);
    public String deleteAllUser();

    public Users  updateUser(Users userDetail);
}
