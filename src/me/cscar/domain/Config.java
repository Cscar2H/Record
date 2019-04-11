package me.cscar.domain;

import lombok.*;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Config {

    public int id;
    public String key;
    public String value;

}