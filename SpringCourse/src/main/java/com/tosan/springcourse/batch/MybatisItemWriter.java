package com.tosan.springcourse.batch;

import com.tosan.springcourse.persistence.mapper.LogMapper;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.logging.LogManager;

/**
 * @author Abouei
 */
public class MybatisItemWriter implements ItemWriter<Log> {

    @Autowired
    LogMapper logMapper;
    public void write(List<? extends Log> items) throws Exception {
        logMapper.saveLogs(items);
    }

}
