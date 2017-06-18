package com.iws.codeservice.dao;

import java.sql.ResultSet;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.iws.codeservice.dto.AppCodeDTO;
import com.iws.codeservice.dto.AppTransDTO;
import com.iws.codeservice.dto.CampignDTO;
import com.iws.codeservice.dto.ClientDTO;
import com.iws.codeservice.dto.PartnerDTO;
import com.iws.codeservice.dto.ProductDTO;
import com.iws.codeservice.dto.UserDTO;
import com.iws.codeservice.exceptions.DaoException;
import com.iws.codeservice.utils.CodeServiceConstants;

public class CodesDaoImpl implements CodesDaoIF{


	private static DataSource dataSource = null;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

@SuppressWarnings("unchecked")
public UserDTO userDetailsInfo(String username) throws DaoException {
		UserDTO userDTO=null;
		try {
			JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
			userDTO=jdbcTemplate.queryForObject(CodeServiceConstants.SELECT_USER_VALIDATION,
					new Object[]{username},
					new RowMapper(){
				public UserDTO mapRow(ResultSet rs, int arg1)
	         			throws SQLException {
	         		UserDTO userDTO=new UserDTO();
	         		userDTO.setUserName(rs.getString("User_Name"));
					userDTO.setId(rs.getInt("User_Id"));
					userDTO.setPassword(rs.getString("Password"));
					userDTO.setStatus(rs.getBoolean("status"));
	               return userDTO;
	               
	         	}
			});
		} catch (Exception e) {
			  e.printStackTrace();
			throw new DaoException(e);
		}
		return userDTO;
	}

	@Override
	public ClientDTO clientDetailsInfo(String clientId) throws DaoException {
		ClientDTO clientDTO=null;
		try {
			JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
			clientDTO=(ClientDTO)jdbcTemplate.queryForObject(CodeServiceConstants.SELECT_CLIENT_CHECKING_QUERY, 
					new Object[]{clientId},
					new RowMapper(){
	         	public ClientDTO mapRow(ResultSet rs, int arg1)
	         			throws SQLException {
	         		ClientDTO clientDTO=new ClientDTO();
	         		clientDTO.setStatus(rs.getInt("status"));
	         		clientDTO.setClientName(rs.getString("clientName"));
	         		clientDTO.setClientApiKeyCode(rs.getString("apiKeyCode"));
	               return clientDTO;
	               
	         	}
			});
	
			
		}catch(Exception e){
			
		}
		
		return clientDTO;
	}

	@Override
	public Boolean trasnStatus(String trasRefId) throws DaoException {
		boolean status=false;
		try
		{
			JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
			int count=jdbcTemplate.queryForInt
					(CodeServiceConstants.TRASREFID_QUERY_CHECKING,
					new Object[]{trasRefId});
		  if(count==1){
			  status=true;  
		  }else{
			  status=false;
		  }
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return status;
	}

	@Override
	public Integer insertTrasnInfo(AppTransDTO transRef) throws DaoException {
		int insertStatus=0;
        	   try
       		{
       			JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
       			insertStatus=jdbcTemplate.update(CodeServiceConstants.INSERT_TRANSCTION_QUERY, new Object[]{transRef.getCampId(),transRef.getProductId(),transRef.getAppCode(),transRef.getTransRefId()});
       			
		} catch (Exception e) {
			// TODO: handle exception
		} 
		return insertStatus;
	}

	@Override
	public AppCodeDTO codeChecking(String appCode) throws DaoException {
		
		AppCodeDTO appCodeDTO=null;
		try {
			JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
			appCodeDTO=(AppCodeDTO)jdbcTemplate.queryForObject(CodeServiceConstants.SELECT_CODE_VALIDATION, new Object[]{appCode},new RowMapper<AppCodeDTO>(){
				public AppCodeDTO mapRow(ResultSet rs, int arg1) throws SQLException {
					AppCodeDTO appCode=new AppCodeDTO();
					appCode.setCampId(rs.getString("camp_id"));
					appCode.setProdId(rs.getString("product_id"));
					appCode.setCodeStatus(rs.getString("code_status"));
					appCode.setAppCode(rs.getString("app_Code"));
					
					return appCode;
				}
				
				
			});
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return appCodeDTO;
	}

	public CampignDTO getCampignDTO(String campName) throws DaoException {
		CampignDTO campInfo=null;
		try{
			JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
			//campInfo=jdbcTemplate.queryForObject("", new Object[]{},new )
			campInfo=(CampignDTO)jdbcTemplate.queryForObject(
					CodeServiceConstants.SELECT_CAMPAGIN_QUERY, 
					new Object[]{campName},new RowMapper<CampignDTO>(){
					public CampignDTO mapRow(ResultSet rs, int arg1) throws SQLException {
						CampignDTO campDTO=new CampignDTO();
						campDTO.setCampaignId(rs.getInt("Campaign_Id"));
						campDTO.setCampaignName(rs.getString("Campaign_Name"));
						campDTO.setShortCode(rs.getInt("ShortCode"));
						campDTO.setStatus(rs.getBoolean("Status"));
						return campDTO;
					}
					
						
				});
				
				
		}catch(Exception e){
			
		}
		return campInfo;

	}

	public ProductDTO getProductDTO(String prodName) throws DaoException {
		ProductDTO productDTO=null;
		try{
			JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
			//campInfo=jdbcTemplate.queryForObject("", new Object[]{},new )
			productDTO=(ProductDTO)jdbcTemplate.queryForObject(CodeServiceConstants.SELECT_CAMPAGIN_QUERY
					,new Object[]{prodName},new RowMapper<ProductDTO>(){
					public ProductDTO mapRow(ResultSet rs, int arg1) throws SQLException {
						ProductDTO productDTO=new ProductDTO();
						productDTO.setProductId(rs.getInt("Product_Id"));
						productDTO.setProductName(rs.getString("Product_Name"));
						productDTO.setStatus(rs.getBoolean("Status"));
						return productDTO;
					}
					
						
				});
				
				
		}catch(Exception e){
			
		}
		return productDTO;
	}

	public PartnerDTO getPartnerDTO(String partnerName) throws DaoException {
		
		return null;
	}
	
	
	

}
