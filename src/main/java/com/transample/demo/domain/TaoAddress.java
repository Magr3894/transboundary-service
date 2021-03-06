package com.transample.demo.domain;


/**
 * 全国省市村统计表 tao_address
 * 
 * @author youcaihua
 * @date 2020-10-13
 */
public class TaoAddress
{
	
	/** ID */
	private Integer id;
	/** 所属省份 */
	private String provence;
	/** 所属城市 */
	private String city;
	/** 所属县/区 */
	private String county;
	/** 所属村/乡 */
	private String village;

	public void setId(Integer id) 
	{
		this.id = id;
	}

	public Integer getId() 
	{
		return id;
	}
	public void setProvence(String provence) 
	{
		this.provence = provence;
	}

	public String getProvence() 
	{
		return provence;
	}
	public void setCity(String city) 
	{
		this.city = city;
	}

	public String getCity() 
	{
		return city;
	}
	public void setCounty(String county) 
	{
		this.county = county;
	}

	public String getCounty() 
	{
		return county;
	}
	public void setVillage(String village) 
	{
		this.village = village;
	}

	public String getVillage() 
	{
		return village;
	}

}
