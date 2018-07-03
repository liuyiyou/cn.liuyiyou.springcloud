package cn.liuyiou.cloud;

import cn.liuyiou.cloud.service.SubsService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderServiceApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Autowired
	private SubsService subsService;

	@Test
	public void test(){
		subsService.addSubs();
	}
}
