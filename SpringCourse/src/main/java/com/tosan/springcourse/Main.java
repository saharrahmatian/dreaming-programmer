package com.tosan.springcourse;

import org.springframework.batch.core.*;
import org.springframework.batch.core.configuration.support.ClasspathXmlApplicationContextsFactoryBean;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Abouei
 */
public class Main {

    @Autowired
    @Qualifier("jobLauncher")
    JobLauncher batchLauncher;
    @Autowired
    @Qualifier("calcDebitJob")
    Job debitBatchJob;

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-batchContext.xml");
        Job logProcessorJob = (Job) context.getBean("logJob");
        JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher");
        try {
            String format = new SimpleDateFormat("YYYY-MM-dd").format(new Date());
            JobParameters jobParameters = new JobParametersBuilder().addString("date", format).toJobParameters();
            JobExecution job = jobLauncher.run(logProcessorJob, jobParameters);
        } catch (JobExecutionAlreadyRunningException e) {
            e.printStackTrace();
        } catch (JobRestartException e) {
            e.printStackTrace();
        } catch (JobInstanceAlreadyCompleteException e) {
            e.printStackTrace();
        } catch (JobParametersInvalidException e) {
            e.printStackTrace();
        }
    }
}
