package com.cmcglobal.api;

import com.cmcglobal.dto.User;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserAPIController {

    @PostMapping("/save")
    public User registerUser(@RequestBody User user){
        System.out.println("Hello world");
        return null;
    }

    @GetMapping(value = "/getAll")
    public ResponseEntity<String> getAll(){
        return ResponseEntity.ok().build();
    }
}
