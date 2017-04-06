package com.solarvillage.services;

import java.util.HashMap;

import com.solarvillage.constants.Constants;

public class Structural {
	
	static HashMap<String, String> permitList = new HashMap<String, String>();
	static Integer index = 0;

	public static String submitPermitRequest(String requestId) {
		permitList.put(requestId, Constants.STATUS_IN_PROGRESS);
		
		return Constants.STATUS_IN_PROGRESS;
	}
	
	public static String getPermitRequestStatus(String requestId) {
		String result = permitList.get(requestId);
		
		return result;
	}
	
	public static String changePermitRequestStatus(String requestId, String newStatus) {
		String existingStatus = permitList.get(requestId);
		String result;
		
		if(existingStatus != null) {
			if(newStatus != null) {
				switch(newStatus) {
					case Constants.SIGNAL_APPROVE:
						permitList.put(requestId, Constants.STATUS_APPROVED);
						result = Constants.SUCCESS;
						break;
					case Constants.SIGNAL_DENY:
						permitList.put(requestId, Constants.STATUS_DENIED);
						result = Constants.SUCCESS;
						break;
					case Constants.SIGNAL_RESET:
						permitList.put(requestId, Constants.STATUS_IN_PROGRESS);
						result = Constants.SUCCESS;
						break;
					default:
						result = "ERROR: Invalid status supplied!";
						break;
				}
				permitList.put(requestId, newStatus);
			}else {
				result = "ERROR: Invalid status supplied!";
			}
		}else {
			result = "ERROR: No status by that ID exists!";
		}
		
		return result;
	}
	
	public static String rescindPermit(String requestId) {
		String result = "";
		
		permitList.remove(requestId);
		
		if(permitList.get(requestId) == null) {
			result = Constants.SUCCESS;
		}else {
			result = Constants.FAILED;
		}
		
		return result;
	}
}
