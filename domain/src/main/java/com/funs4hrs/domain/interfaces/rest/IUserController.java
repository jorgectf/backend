package com.funs4hrs.domain.interfaces.rest;

import com.funs4hrs.domain.interfaces.ICRUD;
import com.funs4hrs.domain.models.User;
import org.springframework.http.ResponseEntity;

public interface IUserController extends ICRUD<User, Long> {
    ResponseEntity Login(String email, String password);
}
