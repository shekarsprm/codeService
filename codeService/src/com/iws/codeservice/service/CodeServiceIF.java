package com.iws.codeservice.service;

import org.springframework.stereotype.Service;

import com.iws.codeservice.dto.AppCodeDTO;
import com.iws.codeservice.dto.AppTransDTO;
import com.iws.codeservice.dto.CampignDTO;
import com.iws.codeservice.dto.ClientDTO;
import com.iws.codeservice.dto.PartnerDTO;
import com.iws.codeservice.dto.ProductDTO;
import com.iws.codeservice.dto.UserDTO;
import com.iws.codeservice.exceptions.ServiceException;


public interface CodeServiceIF {

	public Integer userDetailsInfo(String usename,String password)throws ServiceException;	
	public Integer clientDetailsInfo(String clientId,String clientName)throws ServiceException;
    public Boolean trasnStatus(String trasRefId)throws ServiceException;
    public Integer insertTrasnInfo(AppTransDTO transRef)throws ServiceException;
    public AppCodeDTO codeChecking(String appCode)throws ServiceException;
    public CampignDTO getCampignDTO(String campName)throws ServiceException;
    public ProductDTO getProductDTO(String prodName)throws ServiceException;
    public PartnerDTO getPartnerDTO(String partnerName)throws ServiceException;
    

}
