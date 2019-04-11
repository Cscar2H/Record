package me.cscar.service;
 
import me.cscar.dao.RecordDAO;
import me.cscar.domain.Category;
import me.cscar.domain.Record;

import java.util.Date;

 
public class RecordService {
    RecordDAO recordDao = new RecordDAO();
    public void add(int spend, Category c, String comment, Date date){
        Record r = new Record();
        r.spend = spend;
        r.cid = c.id;
        r.comment = comment;
        r.date = date;
        recordDao.add(r);
    }
}