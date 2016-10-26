package com.threadUtils.thread;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.threadUtils.util.Constants;

@Component
@Scope("prototype")
public class PrintTask2 implements Runnable{

	String name;
	
	public void setName(String name){
		this.name = name;
	}
	
	@Override
	public void run() {
		
		System.out.println(name + " is running");
		
		try {
			while (true) {
				Thread.sleep(Constants.THREAD_DELAY_MS);
//				List<ExcelInfo> lstExcelInfo_All = Util.readDataFromExcel(Constants.EXCEL_FILE_NAME);
//				List<ExcelInfo> lstExcelInfo_Processed = Util.processedExcelInfo(lstExcelInfo);
//				if (null != lstExcelInfo_Processed && lstExcelInfo_Processed.size() > 0) {
//					Util.triggerTestsForProcessedRecords(lstExcelInfo_Processed);
//					Util.removeFromExcel(lstExcelInfo_Processed);
//				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(name + " is running");

	}

}