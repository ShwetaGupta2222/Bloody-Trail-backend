package com.first_full.baby.controller;
import com.first_full.baby.model.Users;
import com.first_full.baby.service.UsersService;
import org.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "http://localhost:3000", allowCredentials = "true")
public class UsersController {
    public Logger logger = LoggerFactory.getLogger(UsersController.class);
    private UsersService usersService;
    private JdbcTemplate jdbcTemplate;

//    @Autowired
//    public Integer p;

    @Autowired
    public Integer d;
//    UsersController(Integer d){
//        System.out.println("oo"+ d + d);
//    }

    @GetMapping("/ss")
    public String ss() {
        System.out.println(d);
        return  "basss "+d;
    }

//    @PostMapping(value = "/add", produces = {"application/json"})
//    public ResponseEntity<?> addUser(
//            @RequestPart(value = "photoUrl", required = false) MultipartFile file,
//            @RequestParam("email") String email,
//            @RequestParam(value = "displayName", required = false) String displayName,
//            @RequestParam(value = "gender") String gender,
//            @RequestParam(value = "matchPlayed") Integer matchPlayed,
//            @RequestParam(value = "maxScore") Integer maxScore,
//            @RequestParam(value = "totalCoins") Integer totalCoins,
//            @RequestParam(value = "winGames") Integer winGames,
//            @RequestParam(value = "stage") String stage,
//            @RequestParam(value = "score") Integer score,
//            @RequestParam(value = "level") Integer level,
//            @RequestParam(value = "foundEle") List<Integer> foundEle,
//            @RequestParam(value = "num") Integer num
//    ) {
//        System.out.println(email);
//        try {
//            Users user = new Users();
//            user.setDisplayName(displayName);
//            user.setEmail(email);
//            user.setGender(gender);
//            user.setMatchPlayed(matchPlayed);
//            user.setMaxScore(maxScore);
//            user.setTotalCoins(totalCoins);
//            user.setWinGames(winGames);
//            user.setStage(stage);
//            user.setScore(score);
//            user.setLevel(level);
//            user.setFoundEle(foundEle);
//            user.setNum(num);
//            if (file != null) {
//                user.setPhotoUrl(file.getBytes());
//            } else {
//                user.setPhotoUrl(null);
//            }
//
//            boolean isPresent = usersService.saveUser(user);
//
//            if (isPresent) {
//                return ResponseEntity.status(409).body("User with email " + email + " already exists");
//            } else {
//                return ResponseEntity.status(200).body("User added successfully");
//            }
//        } catch (Exception e) {
//            return ResponseEntity.status(500).body("Error processing the request");
//        }
//    }

//    @GetMapping("/getAll")
//    public ResponseEntity<List<Users>> getAllUsers() {
//        try {
//            List<Users> users = usersService.getAllUsers();
//             return ResponseEntity.ok(users);
//        }    catch (Exception e){
//            return ResponseEntity.status(500).body(null);
//        }
//    }
//
//    @GetMapping("/get/{email}")
//    public ResponseEntity<?> get(@PathVariable String email) {
//        System.out.println(email);
//        try {
//            Users users = usersService.getUser(email);
//
//            if (users!= null) {
//                return ResponseEntity.ok(users);
//            } else {
//                return ResponseEntity.status(HttpStatus.NOT_FOUND)
//                        .body("Entity with email " + email + " not found");
//            }
//        } catch (Exception e) {
//            System.out.println(e);
//            return ResponseEntity.status(500).body(null);
//        }
//    }
//
//    @DeleteMapping("/delete")
//    public List<Users> delete(@RequestBody String email){
//        return usersService.deleteUser(email);
//    }
//
//    @DeleteMapping("/deleteAll")
//    public String deleteAll(){
//         return usersService.deleteAllUser();
//    }
//
//    @PutMapping("/update")
//    public  Users update(@RequestBody Users user){
//        return usersService.updateUser(user);
//    }

//    @DeleteMapping("/db")
//    public String deleteDatabase() {
//        // WARNING: This will drop the entire database!
//        jdbcTemplate.execute("DROP DATABASE defaultdb");
//        return "Database dropped successfully";
//    }
}
