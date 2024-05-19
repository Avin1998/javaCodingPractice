package com.company.HLD;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

public class UniqueIDGenerator {
    SimpleDateFormat dateFormat;
    public UniqueIDGenerator() {
        dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSSSS");
    }
    public long getEpoch(LocalDateTime currentDate) throws ParseException {
        String localTimeNow = currentDate.toString().replace("T", " ");
        Date parsedDate = dateFormat.parse(localTimeNow);
        return parsedDate.getTime();
    }
}
