package com.tosan.springcourse.service;

import com.tosan.springcourse.batch.Log;

import javax.jws.WebService;
import java.util.Date;
import java.util.List;

/**
 * @author Abouei
 */
@WebService(name = "LogService", serviceName = "LogService")
public interface LogService {
    List<Log> reportLogsByDate(Date date);
    List<Log> reportLogsByUser(String username);
}
