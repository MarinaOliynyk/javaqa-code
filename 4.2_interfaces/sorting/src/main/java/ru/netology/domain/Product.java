package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@NoArgsConstructor
//@AllArgsConstructor
//@Data
//public class Product implements Comparable {
//  private int id;
//  private String name;
//  private int price;
//  private double rating;
//
//  @Override
//  public int compareTo(Object o) {
//    Product p = (Product) o;
//    return id - p.id;
//  }
//}

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Product implements Comparable<Product> {
  private int id;
  private String name;
  private int price;
  private double rating;

  @Override
  public int compareTo(Product o) {
    return id - o.id;
  }
}


