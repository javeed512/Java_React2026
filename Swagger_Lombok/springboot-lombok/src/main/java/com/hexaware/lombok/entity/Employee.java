package com.hexaware.lombok.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Slf4j
@ToString
@EqualsAndHashCode

@Data
public class Employee {
	
	
	 private int eid;
	 private String ename;
	 private double salary;

}
