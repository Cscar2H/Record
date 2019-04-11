package me.cscar.domain;
 
import lombok.*;

import java.util.Date;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Record {
    public int spend;
    public int id;
    public int cid;
    public String comment;
    public Date date;
}