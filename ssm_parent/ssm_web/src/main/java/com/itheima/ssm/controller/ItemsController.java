package com.itheima.ssm.controller;


import com.itheima.ssm.pojo.Items;
import com.itheima.ssm.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @version:1.8
 * @Auther:JJ89757
 * @Date:2019/7/1 14:49
 */
@Controller
@RequestMapping("/items")
public class ItemsController {
    @Autowired
    private ItemsService itemsService;
    // 展示商品信息页面
    @RequestMapping("/showItem")
    public String showItem(int id, Model model){
        Items items = itemsService.findById(id);
        model.addAttribute("item", items);
        return "viewItem";
    }
}