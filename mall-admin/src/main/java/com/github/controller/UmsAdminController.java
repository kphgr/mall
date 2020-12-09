package com.github.controller;

import com.github.model.UmsAdmin;
import com.github.service.UmsAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author yuzhuangzhuang
 * @create 2020/12/09 22:52
 */
@RestController
@RequestMapping("ums")
public class UmsAdminController {
    @Autowired
    private UmsAdminService umsAdminService;

    @GetMapping("admins")
    public List<UmsAdmin> listUmsAdmin(){
        return umsAdminService.listUmsAdmin();
    }
}
