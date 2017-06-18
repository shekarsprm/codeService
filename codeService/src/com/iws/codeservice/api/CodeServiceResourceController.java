package com.iws.codeservice.api;

import java.util.Date;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.iws.codeservice.exceptions.ServiceException;
import com.iws.codeservice.form.AppCodeForm;
import com.iws.codeservice.form.AppCodeResponseForm;
import com.iws.codeservice.service.CodeServiceIF;
import com.iws.codeservice.utils.PropertiesUtility;
import com.iws.codeservice.utils.TACGenerator;

@Controller
public class CodeServiceResourceController {

	private static Logger LOGGERS = Logger.getLogger("common");
	private static Logger EDRS = Logger.getLogger("common1");

	
	@Autowired
	private CodeServiceIF codesServiceIF;
	
	
		@RequestMapping(value = "/codeChecking",
			method = RequestMethod.POST,
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public  AppCodeResponseForm CodeChecking(
			@RequestBody AppCodeForm appCode,@RequestHeader HttpHeaders header){
			LOGGERS.info("Enter into the CodeChecking controller "+new Date());
			LOGGERS.info("AppCodeForm Info "+appCode.toString());
		AppCodeResponseForm appCodeResponse=null;
		String gereateId=TACGenerator.generateOTP(16);
		EDRS.info("CODE_REQ"+"|"+gereateId+"|"+appCode.getAppCode()+"|"+appCode.getClientCode()+"|"+appCode.getClientId()+"|"+appCode.getCampName()+"|"+appCode.getProductName()+"|"+new Date());
			String validateStatus= validate(appCode);
			appCodeResponse=new AppCodeResponseForm();
			if("0".equalsIgnoreCase(validateStatus)){
				try {
					
					Integer userStatus=codesServiceIF.userDetailsInfo(appCode.getUsername(), appCode.getPassword());
					if("0".equalsIgnoreCase(String.valueOf(userStatus))){
						userStatus=codesServiceIF.clientDetailsInfo(appCode.getClientId(),appCode.getClientCode());
						if("0".equalsIgnoreCase(String.valueOf(userStatus))){
							
						}else{
							appCodeResponse.setStatusCode(String.valueOf(userStatus));
							appCodeResponse.setStatusMessage
							(PropertiesUtility.getPropertiesValue(String.valueOf(userStatus)));
								
						}
					}else{
						appCodeResponse.setStatusCode(String.valueOf(userStatus));
						appCodeResponse.setStatusMessage
						(PropertiesUtility.getPropertiesValue(String.valueOf(userStatus)));
					}
					
				} catch (ServiceException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}else{
				appCodeResponse.setStatusCode(validateStatus);
				appCodeResponse.setStatusMessage
				(PropertiesUtility.getPropertiesValue(validateStatus));
				//appCodeResponse.setResponseStatusTime(new Timestamp(new Date().getTime()));
			}
		
			EDRS.info("CODE_RES"+"|"+gereateId+"|"+appCodeResponse.getStatusCode()+"|"+appCodeResponse.getStatusMessage()+"|"+new Date());
			LOGGERS.info("Exit into the CodeChecking controller "+new Date());
		return appCodeResponse;
	}
	
	public String validate(AppCodeForm appCodeForm){
		String status="1";
	
		if(appCodeForm!=null){
			if(appCodeForm.getAppCode()==null || appCodeForm.getAppCode().isEmpty()){
				return "3";
			}
			if(appCodeForm.getCampName()==null ||appCodeForm.getCampName().isEmpty()){
				return "4";
			}
			if(appCodeForm.getProductName()==null||appCodeForm.getProductName().isEmpty()){
				return "5";
			}
			if(appCodeForm.getClientCode()==null ||appCodeForm.getClientCode().isEmpty()){
				return "6";
			}
			if(appCodeForm.getClientId()==null ||appCodeForm.getClientId().isEmpty()){
				return "7";
			}
			
			if(appCodeForm.getUsername()==null ||appCodeForm.getUsername().isEmpty()){
				return "8";
			}
			if(appCodeForm.getPassword()==null ||appCodeForm.getPassword().isEmpty()){
				return "9";
			}
			
			if(appCodeForm.getTransId()==null || appCodeForm.getTransId().isEmpty()){
				return "10";
			}
			status="0";
		}else{
			
			status="2";
		}
		return status;
		
	}
}
