package com.tosan.springcourse.batch;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

/**
 * @author Abouei
 */
public class LogFieldSetMapper implements FieldSetMapper<Log> {
    public Log mapFieldSet(FieldSet fieldSet) throws BindException {
        return new Log(fieldSet.readDate("Date"),
                fieldSet.readString("Operation"),
                fieldSet.readString("User"),
                fieldSet.readString("IP"));
    }
}
