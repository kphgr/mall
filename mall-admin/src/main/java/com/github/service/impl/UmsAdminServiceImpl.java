package com.github.service.impl;

import com.github.mapper.UmsAdminMapper;
import com.github.model.UmsAdmin;
import com.github.service.UmsAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yuzhuangzhuang
 * @create 2020/12/09 22:52
 */
@Service
public class UmsAdminServiceImpl implements UmsAdminService {
    @Autowired
    private UmsAdminMapper umsAdminMapper;

    @Override
    public List<UmsAdmin> listUmsAdmin() {
        return umsAdminMapper.selectByExample(null);
    }
}
