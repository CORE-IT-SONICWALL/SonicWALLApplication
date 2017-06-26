package kh.com.penhchet.sonicwall;

import java.util.Map;

import org.elasticsearch.client.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;

import kh.com.penhchet.sonicwall.models.Log;
import kh.com.penhchet.sonicwall.services.LogService;

@SpringBootApplication
public class SonicWallApplication implements CommandLineRunner {
	
    @Autowired
    private ElasticsearchOperations es;

    @Autowired
    private LogService logService;

	public static void main(String[] args) {
		SpringApplication.run(SonicWallApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		printElasticSearchInfo();
        
//		Log log = new Log();
//		log.setTime("5/10/2017 7:23");
//		log.setID("45");
		
//		logService.save(log);
		
		Iterable<Log> logs = logService.findAll();

        logs.forEach(x -> System.out.println(x));

    }

    //useful for debug
    private void printElasticSearchInfo() {

        System.out.println("--ElasticSearch-->");
        Client client = es.getClient();
        Map<String, String> asMap = client.settings().getAsMap();

        asMap.forEach((k, v) -> {
            System.out.println(k + " = " + v);
        });
        System.out.println("<--ElasticSearch--");
    }
}
