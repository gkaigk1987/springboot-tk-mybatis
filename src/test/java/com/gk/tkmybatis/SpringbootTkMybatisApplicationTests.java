package com.gk.tkmybatis;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.gk.tkmybatis.mapper.AcountMapper;
import com.gk.tkmybatis.model.Acount;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
@Rollback
public class SpringbootTkMybatisApplicationTests {

    @Autowired
    private AcountMapper acountMapper;

    @Test
    public void test001() {
        List<Acount> acounts = acountMapper.selectAll();
        acounts.stream().forEach(a -> {
            System.out.println(a.getName());
        });
    }

    @Test
    public void test002() {
        PageHelper.startPage(1,5);
        List<Acount> acounts = acountMapper.selectAll();
        PageInfo<Acount> pageInfo = new PageInfo<>(acounts);
        System.out.println("----------------------------" + pageInfo.getTotal() + "------------------------");
        System.out.println(acounts);
    }

    @Test
    public void test003() {
        Acount acount = new Acount();
        acount.setId(UUID.randomUUID().toString().replaceAll("-",""));
        acount.setName("gk1987");
        acountMapper.insert(acount);
    }

}
