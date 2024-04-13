package com.first_full.baby.service;
import com.first_full.baby.model.Users;
import com.first_full.baby.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class  UsersServiceImpl implements UsersService{
    private UsersRepository usersRepository;
    @Override
    public boolean saveUser(Users user) {
        Optional<Users> findUser = usersRepository.findById(user.getEmail());
        if(findUser.isPresent()){ return true; }
        usersRepository.save(user);
        return false;
    }

    @Override
    public List<Users> getAllUsers() {
        return usersRepository.findAll();
    }

    @Override
    public Users getUser(String email) {
        return usersRepository.findById(email).orElse(null);
    }

    @Override
    public List<Users> deleteUser(String email) {
        System.out.println(usersRepository.findById(email));
        usersRepository.deleteById(email);
        List<Users> listUsers = usersRepository.findAll();
        return listUsers;
    }

    @Override
    public String deleteAllUser() {
        try {
//            long deletedCount = usersRepository.deleteByEmailNotNull();
//            if (deletedCount > 0) {
                return "All deleted";
//            } else {
//                return "No valid users to delete";
//            }
        } catch (Exception e) {
            return "Found Error: " + e.getMessage();
        }
    }

    @Override
    public Users updateUser(Users updatedUser) {
        Users existingUser = usersRepository.findById(updatedUser.getEmail()).orElse(null);

        if (existingUser != null) {
            existingUser.setDisplayName(updatedUser.getDisplayName());
            existingUser.setGender(updatedUser.getGender());
            existingUser.setMatchPlayed(updatedUser.getMatchPlayed());
            existingUser.setMaxScore(updatedUser.getMaxScore());
            existingUser.setTotalCoins(updatedUser.getTotalCoins());
            existingUser.setWinGames(updatedUser.getWinGames());
            existingUser.setStage(updatedUser.getStage());
            existingUser.setScore(updatedUser.getScore());
            existingUser.setLevel(updatedUser.getLevel());
            existingUser.setFoundEle(updatedUser.getFoundEle());
            existingUser.setNum(updatedUser.getNum());
            existingUser.setPhotoUrl(updatedUser.getPhotoUrl());

            return usersRepository.save(existingUser);
        } else {
            return null;
        }
    }

}
