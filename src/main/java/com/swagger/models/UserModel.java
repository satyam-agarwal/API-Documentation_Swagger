package com.swagger.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Document("user_db")
public class UserModel {
    @Id
    private String id;
    @Indexed(unique = true)
    private String email;
    private String password;
    private String mobile;
    private String fname;
    private String lname;
    private Address address;

}

@Data
@NoArgsConstructor
@AllArgsConstructor
class Address{
    private  String line1;
    private String line2;
    private String pincode;
}
