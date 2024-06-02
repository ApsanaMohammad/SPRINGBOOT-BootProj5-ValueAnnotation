package com.nt.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;


@PropertySource("classpath:com/nt/commons/inputs.properties")
@Component("info")
class ItemsInfo {
	@Value("${idly.price}")
	public float idlyPrice;
	@Value("${dosa.price}")
	public float dosaPrice;
	@Value("${poha.price}")
	public float pohaPrice;
	@Override
	public String toString() {
		return "ItemsInfo [idlyPrice=" + idlyPrice + ", dosaPrice=" + dosaPrice + ", pohaPrice=" + pohaPrice + "]";
	}
	

}
