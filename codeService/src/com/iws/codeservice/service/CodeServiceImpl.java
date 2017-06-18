package com.iws.codeservice.service;

import org.springframework.stereotype.Service;

import com.iws.codeservice.dao.CodesDaoIF;
import com.iws.codeservice.dto.AppCodeDTO;
import com.iws.codeservice.dto.AppTransDTO;
import com.iws.codeservice.dto.CampignDTO;
import com.iws.codeservice.dto.ClientDTO;
import com.iws.codeservice.dto.PartnerDTO;
import com.iws.codeservice.dto.ProductDTO;
import com.iws.codeservice.dto.UserDTO;
import com.iws.codeservice.exceptions.DaoException;
import com.iws.codeservice.exceptions.ServiceException;
import com.iws.codeservice.factory.DaoFactory;
@Service
public class CodeServiceImpl implements CodeServiceIF {
  
	public Integer userDetailsInfo(String usename,String password) throws ServiceException {
		Integer userStatus=100;
 CodesDaoIF codesDaoIF=DaoFactory.codesFactory();
	try {
		UserDTO userDTO=codesDaoIF.userDetailsInfo(usename);
		if(userDTO!=null){
			if(password.equalsIgnoreCase(userDTO.getPassword())){
				if(userDTO.isStatus()){
					userStatus=0;					
				}else{
					userStatus=17;
				}
			}else{
				userStatus=16;
			}
		}else{
			userStatus=17;
		}
	} catch (DaoException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return userStatus;
	}

	public Integer clientDetailsInfo(String clientId,String clientName) throws ServiceException {
		 CodesDaoIF codesDaoIF=	DaoFactory.codesFactory();
		 Integer clientStatus=100;
		 try {
			 ClientDTO clientDTO= codesDaoIF.clientDetailsInfo(clientId);
			if(clientDTO!=null){
			if(clientName.equalsIgnoreCase(clientDTO.getClientName())){
				clientStatus=0;
			}else{
				clientStatus=18;
			}
			}else{
				clientStatus=18;
			}
		} catch (DaoException e) {
			throw new 	ServiceException();
		}
		return clientStatus;
	}

	@Override
	public Boolean trasnStatus(String trasRefId) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer insertTrasnInfo(AppTransDTO transRef) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AppCodeDTO codeChecking(String appCode) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CampignDTO getCampignDTO(String campName) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductDTO getProductDTO(String prodName) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PartnerDTO getPartnerDTO(String partnerName) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

}
