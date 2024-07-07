package dev.manyroads.lombok;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@ToString
@RequiredArgsConstructor
public class Person {

    @NonNull
    private final String name;
    private final String company;
}
