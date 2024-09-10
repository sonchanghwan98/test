package com.example.demo.vo;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccountVO {
private int idx;
private String userid,userpw,name,phone,email,nick;
private Date brith;
}
