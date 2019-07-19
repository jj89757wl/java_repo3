package com.itheima.ssm.service.impl;


import com.itheima.ssm.dao.ItemsMapper;
import com.itheima.ssm.pojo.Items;
import com.itheima.ssm.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @version:1.8
 * @Auther:JJ89757
 * @Date:2019/7/1 14:44
 */
@Service
@Transactional
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    private ItemsMapper itemsMapper;

    @Override
    public Items findById(int itemId) {
      return itemsMapper.findById(itemId);
    }
}
