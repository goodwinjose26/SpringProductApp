package com.example.product_backend.controller;

import com.example.product_backend.dao.ProductDao;
import com.example.product_backend.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {


@Autowired
private ProductDao dao;
    @CrossOrigin(origins = "*")

    @PostMapping(path = "/add",consumes = "application/json",produces = "application/json")
    public String add(@RequestBody Product p)
    {
        System.out.println(p.getBrand().toString());
        System.out.println(p.getDisname().toString());
        System.out.println(p.getExpdate().toString());
        System.out.println(p.getName().toString());
        System.out.println(p.getMandate());
        System.out.println(p.getPrdcode());
        System.out.println(p.getPrice());
        System.out.println(p.getSellername());
        dao.save(p);
        return  "ADD PRODUCT DETAILS";
    }
    @CrossOrigin(origins = "*")

   @GetMapping("/view")
    public List<Product> view()
   {
       return (List<Product>) dao.findAll();
   }

}
