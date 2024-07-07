package dev.manyroads.lombok;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Employee {

    private String name;
    private int salary;
}

