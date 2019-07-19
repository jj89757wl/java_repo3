package com.itheima.ssm;

import com.itheima.ssm.dao.ItemsMapper;
import com.itheima.ssm.pojo.Items;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @version:1.8
 * @Auther:JJ89757
 * @Date:2019/7/2 20:05
 */
public class ItemsMapperTest {
    @Test
    public void testFindItemsById() {
//获取 spring 容器
        ApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("classpath:applicationContext-dao.xml");
//获取 Mapper
        ItemsMapper itemsMapper =
                applicationContext.getBean(ItemsMapper.class);
//调用 Mapper 方法
        Items items = itemsMapper.findById(1);
        System.out.println(items); }
}

