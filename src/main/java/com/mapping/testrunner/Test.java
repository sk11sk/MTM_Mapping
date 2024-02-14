package com.mapping.testrunner;

import com.mapping.entity.Category;
import com.mapping.entity.Product;
import com.mapping.repo.CategoryRepository;
import com.mapping.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Component
public class Test implements CommandLineRunner {

    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private ProductRepository productRepository;

    @Override
    public void run(String... args) throws Exception {


        // onr to many mapping

//
//        Category category  =  new Category();
//        category.setTitle("electronics ");
//
//
//
//        categoryRepository.save(category);  // save parent object
//
//        Product product = new Product();
//        product.setProductName("moto 11");
//
//        Product product1 = new Product();
//        product1.setProductName("i phone");
//
//        List<Product> p = new ArrayList<>();
//        p.add(product);
//        p.add(product1);
//
//
//
//        category.setProducts(p);    // parent object.set(child object )
//
//        List<Category> c = new ArrayList<>();
//        c.add(category);
//
//        product.setCategories(c);   // child object.set ( parent object )
//        product1.setCategories(c);
//
//
//        productRepository.save(product);    // save child object
//        productRepository.save(product1);
//
//
//        // another category
//
//
//        Category category1  =  new Category();
//        category1.setTitle("Automobile ");
//
//        categoryRepository.save(category1);
//
//        Product product2 = new Product();
//        product2.setProductName("bike");
//
//        Product product3 = new Product();
//        product3.setProductName(" car");
//
//        List<Product> p1 = new ArrayList<>();
//        p1.add(product2);
//        p1.add(product3);
//
//        category.setProducts(p1);
//
//        List<Category> c1 = new ArrayList<>();
//        c1.add(category1);
//
//        product2.setCategories(c1);
//        product3.setCategories(c1);
//
//
//        productRepository.save(product2);
//        productRepository.save(product3);
//
//
//        //  many to one   mapping
//
//
//        Category category3  =  new Category();
//        category3.setTitle(" Hybrid Automobile");
//
//        Category category4  =  new Category();
//        category4.setTitle(" electornic Automobile");
//
//        categoryRepository.save(category3);
//        categoryRepository.save(category4); // save parent object
//
//
//        Product product4 = new Product();
//        product4.setProductName("EV car");
//
//        List<Product> p2 = new ArrayList<>();
//        p2.add(product4);
//
//
//        category3.setProducts(p2);
//        category4.setProducts(p2);  //// parent object.set(child object )
//
//
//
//        List<Category> c2 = new ArrayList<>();
//        c2.add(category3);
//        c2.add(category4);
//
//
//
//
//        product4.setCategories(c2);// child object.set (parent object)
//
//        productRepository.save(product4); // save child object



        //many to many with use of (cascade = CascadeType.ALL)

//        Product product1 = new Product();
//        product1.setPid("pid1");
//        product1.setProductName("i phone 14");
//
//        Product product2 = new Product();
//        product2.setPid("pid2");
//        product2.setProductName("samsing s14");
//
//        Product product3 = new Product();
//        product3.setPid("pid3");
//        product3.setProductName("redmi");
//
//        Category category1 = new Category();
//        category1.setCid("cid1");
//        category1.setTitle("electronics");
//
//        Category category2 = new Category();
//        category2.setCid("cid2");
//
//        category2.setTitle("mobile phones");
//
//        List<Product> category1products = category1.getProducts();
//        category1products.add(product1);
//        category1products.add(product2);
//        category1products.add(product3);
//
//        List<Product> category2products = category2.getProducts();
//        category2products.add(product1);
//        category2products.add(product2);
//
//        categoryRepository.save(category1);
//        categoryRepository.save(category2);


////   final many to many mapping without cascade type

        Product product1 = new Product();
        product1.setPid("pid1");
        product1.setProductName("i phone 14");

        Product product2 = new Product();
        product2.setPid("pid2");
        product2.setProductName("samsing s14");

        Product product3 = new Product();
        product3.setPid("pid3");
        product3.setProductName("redmi");

        Product product4 = new Product();
        product4.setPid("pid4");
        product4.setProductName("moto");

        productRepository.save(product1);  // save parent object
        productRepository.save(product2);
        productRepository.save(product3);
        productRepository.save(product4);


        Category category1 = new Category();
        category1.setCid("cid1");
        category1.setTitle("electronics");

        Category category2 = new Category();
        category2.setCid("cid2");
        category2.setTitle("mobile phones");

        Category category3 = new Category();
        category3.setCid("cid3");
        category3.setTitle("portable  item");



        List<Category>  c  = Arrays.asList(category1,category2,category3);  ////// parent object.set(child object )
        product1.setCategories(c);
        product2.setCategories(c);
        product3.setCategories(c);
        product4.setCategories(c);


        List<Product>  p  = Arrays.asList(product1,product2,product3,product4);
        category1.setProducts(p);                // child object . set (parent object)
        category2.setProducts(p);                // child object . set (parent object)
        category3.setProducts(p);                // child object . set (parent object)


        categoryRepository.save(category1);
        categoryRepository.save(category2);    //  save child object
        categoryRepository.save(category3);    //  save child object





    }
}
