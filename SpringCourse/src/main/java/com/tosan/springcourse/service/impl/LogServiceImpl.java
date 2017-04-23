package com.tosan.springcourse.service.impl;

import com.tosan.springcourse.batch.Log;
import com.tosan.springcourse.persistence.mapper.LogMapper;
import com.tosan.springcourse.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

/**
 * @author Abouei
 */
public class LogServiceImpl implements LogService {

    @Autowired
    LogMapper logMapper;

    public List<Log> reportLogsByDate(Date date) {
        return logMapper.reportLogsByDate(date);
    }

    public List<Log> reportLogsByUser(String username) {
        return logMapper.reportLogsByUser(username);
    }
}
