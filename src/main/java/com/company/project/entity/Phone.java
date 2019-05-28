package com.company.project.entity;


import com.company.project.interfaces.PhoneCpu;
import com.company.project.interfaces.PhoneSystem;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Phone {

  private PhoneCpu phoneCpu;

  private PhoneSystem phoneSystem;
}
