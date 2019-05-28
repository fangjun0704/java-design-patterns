package com.company.project.interfaces.impl;

import com.company.project.interfaces.PhoneSystem;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AndroidSystem implements PhoneSystem {

  private String name;
}
