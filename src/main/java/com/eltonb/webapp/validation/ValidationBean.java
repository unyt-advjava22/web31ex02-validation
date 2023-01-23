/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eltonb.webapp.validation;

/**
 *
 * @author elton.ballhysa
 */
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="validationBean")
public class ValidationBean 
{
   private String firstname;
   private String email;
   private String phone;
   
   public ValidationBean() {
   }   
   
   public String name() {
       return "abcdef";
   }
   // return the name String
   public String getName()
   {
      return firstname;
   }

   // set the name String
   public void setName(String name)
   {
      this.firstname = name;
   }

   // return the email String
   public String getEmail()
   {
      return email;
   }

   // set the email String
   public void setEmail(String email)
   {
      this.email = email;
   }

   // return the phone String
   public String getPhone()
   {
      return phone;
   } 

   // set the phone String
   public void setPhone(String phone)
   {
      this.phone = phone;
   } 

   // returns result for rendering on the client
   public String getResult()
   {
       if (firstname == null || email == null || phone == null)
           return "";
        return "<p style=\"background-color:yellow;width:200px;" +
           "padding:5px\">Name: " + getName() + "<br/>E-Mail: " +
           getEmail() + "<br/>Phone: " + getPhone() + "</p>";
   } 
}