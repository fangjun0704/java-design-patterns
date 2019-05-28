package com.company.project.interfaces.impl;

import com.company.project.interfaces.PhoneCpu;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AndroidCpu implements PhoneCpu {

  private String name;
}
