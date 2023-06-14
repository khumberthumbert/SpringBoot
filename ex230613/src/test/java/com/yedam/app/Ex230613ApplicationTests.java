package com.yedam.app;

import org.jasypt.encryption.StringEncryptor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class Ex230613ApplicationTests {
	
	@Autowired
	StringEncryptor jasyptStringEncryptor;
	//변수명을 이름으로 해두면 파일만 보는게 아니라 이름을 찾아온다.
	
	@Test
	void propertiesEncrypt() {
		String[] strArray = {"oracle.jdbc.driver.OracleDriver", 
							 "jdbc:oracle:thin:@127.0.0.1:1521/xe", 
							 "hr",
							 "hr"};
		
		for(String str : strArray) {
			String enyStr = jasyptStringEncryptor.encrypt(str);
			System.out.println(enyStr);
		}
	}//password가 안넘어 감.
	//암호화 하고자 하는 대상에 대해서 가져오면 된다. 
	//배열로 남긴 이유는 -> 최초에 몇개를 들고 있을지 정해져 있으니까 썼음.
	
	//Bean을 등록할 때 이름은 크게 상관 없음.

}
