package com.test.bu.service;

import com.test.bu.dao.interfaces.RequestsDao;
import com.test.bu.service.interfaces.RequestsService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class RequestsServiceImpl implements RequestsService {


    @Autowired
    private RequestsDao requestsDao;

    private int count;
    private List result;
    List<String> strings = new ArrayList<>();

    @Override
    public List getFirstQuery() {
        result = requestsDao.firstQuery();
        count = 0;
        for (Iterator i = result.iterator(); i.hasNext();) {
            Object[] values = (Object[]) i.next();
            strings.add("№" + ++count + ": " +values[0] + ", " + values[1] + ", " +
                    values[2] + ", " + values[3] + "\n" );
        }
        return strings;
    }


    @Override
    public List getSecondQuery() {
        result = requestsDao.secondQuery();
        for (Iterator i = result.iterator(); i.hasNext();) {
        Object[] values = (Object[]) i.next();
        strings.add( values[0] + ", " + values[1] + ", " +
                values[2] + "\n" );
    }
        return strings;
}
}
