package com.iws.codeservice.dao;

import com.iws.codeservice.dto.AppCodeDTO;
import com.iws.codeservice.dto.AppTransDTO;
import com.iws.codeservice.dto.CampignDTO;
import com.iws.codeservice.dto.ClientDTO;
import com.iws.codeservice.dto.PartnerDTO;
import com.iws.codeservice.dto.ProductDTO;
import com.iws.codeservice.dto.UserDTO;
import com.iws.codeservice.exceptions.DaoException;

public interface CodesDaoIF {

	
	public UserDTO userDetailsInfo(String usename)throws DaoException;	
	public ClientDTO clientDetailsInfo(String clientId)throws DaoException;
    public Boolean trasnStatus(String trasRefId)throws DaoException;
    public Integer insertTrasnInfo(AppTransDTO transRef)throws DaoException;
    public AppCodeDTO codeChecking(String appCode)throws DaoException;
    public CampignDTO getCampignDTO(String campName)throws DaoException;
    public ProductDTO getProductDTO(String prodName)throws DaoException;
    public PartnerDTO getPartnerDTO(String partnerName)throws DaoException;
    
    
    
    
}
