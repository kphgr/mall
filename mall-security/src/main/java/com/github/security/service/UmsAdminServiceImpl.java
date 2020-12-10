package com.github.security.service;

import com.github.mapper.UmsAdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author yuzhuangzhuang
 * @create 2020/12/10 17:09
 */
@Service
public class UmsAdminServiceImpl implements UmsAdminService{
    @Autowired
    private UmsAdminMapper umsAdminMapper;


}
