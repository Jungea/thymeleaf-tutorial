package com.example.playgroundjung.thymeleaftutorial.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Gender {
    F("F", "여성"),
    M("M", "남성"),
    X("X", "없음");

    String code;
    String name;

}
