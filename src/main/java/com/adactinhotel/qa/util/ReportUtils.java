package com.adactinhotel.qa.util;

import java.io.File;
import java.util.Date;
import java.text.SimpleDateFormat;

public class ReportUtils {
	public static String getTimestamp() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss");
        return dateFormat.format(new Date());
    }

    public static String createExecutionDirectory() {
        String timestamp = getTimestamp();
        String directoryName = "target/cucumber-reports/" + timestamp;
        File directory = new File(directoryName);
        if (!directory.exists()) {
            directory.mkdirs();
        }
        return directoryName;
    }

	
}
