package it.epicode.w5d2p;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class W5d2pApplicationTests {

	static AnnotationConfigApplicationContext ctx;
	static void accediAlContesto(){
		ctx = new AnnotationConfigApplicationContext(W5d2pApplication.class);
	}

	@Test
	void contextLoads() {
	}

}
