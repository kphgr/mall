package com.github;

import com.github.mapper.UmsAdminMapper;
import com.github.model.UmsAdmin;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MallAdminApplicationTests {

    @Autowired
    private UmsAdminMapper umsAdminMapper;

    @Test
    void contextLoads() {
        List<UmsAdmin> umsAdmins = umsAdminMapper.selectByExample(null);
        for (UmsAdmin umsAdmin : umsAdmins) {
            System.out.println(umsAdmin);
        }
    }



}
