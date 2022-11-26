package com.javatpoint.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
//mark class as an Entity 
@Entity
//defining class name as Table name
@Table
public class Products
{
//Defining book id as primary key
@Id
@Column
private int productid;
@Column
private String productname;
@Column
private String category;
@Column
private int price;
public int getProductid() 
{
return productid;
}
public void setProductid(int productid) 
{
this.productid = productid;
}
public String getProductname()
{
return productname;
}
public void setProductname(String productname) 
{
this.productname = productname;
}
public String getCategory() 
{
return category;
}
public void setCategory(String category) 
{
this.category = category;
}
public int getPrice() 
{
return price;
}
public void setPrice(int price) 
{
this.price = price;
}
}