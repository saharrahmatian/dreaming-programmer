package com.tosan.springcourse.persistence.mapper;

import com.tosan.springcourse.batch.Log;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * @author Abouei
 */
@Mapper
public interface LogMapper {
    void saveLogs(@Param("logs")List<? extends Log> logs);
    List<Log> reportLogsByDate(@Param("date") Date date);
    List<Log> reportLogsByUser(@Param("user") String user);
}
