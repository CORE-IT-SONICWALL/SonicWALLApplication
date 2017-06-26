package kh.com.penhchet.sonicwall;

import java.io.*;
import java.util.Collection;
import java.util.Map;

import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
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

		//TODO: READING LOG FROM CSV FILE AND THEN SAVE TO THE ELASTIC_SEARCH
//        String csvFile = "Sample_Log_File_CSV_1.csv";
//        Reader reader = new FileReader(csvFile);
//        Iterable<CSVRecord> records = (CSVFormat.EXCEL).parse(reader);
//        for(CSVRecord record: records){
//            Log log = new Log();
//            log.setTime(record.get(0));
//            log.setLogID(record.get(1));
//            log.setCategory(record.get(2));
//            log.setGroup(record.get(3));
//            log.setEvent(record.get(4));
//            log.setMsgType(record.get(5));
//            log.setPriority(record.get(6));
//            log.setEtherType(record.get(7));
//            log.setSrcMAC(record.get(8));
//            log.setSrcInt(record.get(9));
//            log.setSrcZone(record.get(10));
//            log.setDstMAC(record.get(11));
//            log.setDstInt(record.get(12));
//            log.setDstZone(record.get(13));
//            log.setSrcIP(record.get(14));
//            log.setSrcPort(record.get(15));
//            log.setSrcName(record.get(16));
//            log.setSrcNATIP(record.get(17));
//            log.setSrcNATPort(record.get(18));
//            log.setInSPI(record.get(19));
//            log.setDstIP(record.get(20));
//            log.setDstPort(record.get(21));
//            log.setDstName(record.get(22));
//            log.setDstNATIP(record.get(23));
//            log.setDstNATPort(record.get(24));
//            log.setOutSPI(record.get(25));
//            log.setIpProtocol(record.get(26));
//            log.setIcmpType(record.get(27));
//            log.setIcmpCode(record.get(28));
//            log.setRxBytes(record.get(29));
//            log.setTxBytes(record.get(30));
//            log.setAccessRule(record.get(31));
//            log.setNatPolicy(record.get(32));
//            log.setUserName(record.get(33));
//            log.setSessionTime(record.get(34));
//            log.setSessionType(record.get(35));
//            log.setIdpRule(record.get(36));
//            log.setIdpPriority(record.get(37));
//            log.setHttpPOP(record.get(38));
//            log.setUrl(record.get(39));
//            log.setVpnPolicy(record.get(40));
//            log.setHttpResult(record.get(41));
//            log.setBlockCat(record.get(42));
//            log.setApplication(record.get(43));
//            log.setFwAction(record.get(44));
//            log.setNotes(record.get(45));
//            log.setMessage(record.get(46));
//            logService.save(log);
//        }

		Iterable<Log> logs = logService.findAll();

		System.out.println("Total Size ==> " + Lists.newArrayList(logs).size());

        logs.forEach(x -> System.out.println(x));


        Iterable<Log> attackLogs = logService.findByGroup("Attacks");

        System.out.println("Total Size ==> " + Lists.newArrayList(attackLogs).size());

        attackLogs.forEach(x -> System.out.println(x));

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
