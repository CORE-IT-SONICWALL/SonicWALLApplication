package kh.com.penhchet.sonicwall.repositories;

import kh.com.penhchet.sonicwall.models.Log;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface LogRepository extends ElasticsearchRepository<Log, String> {

    public Iterable<Log> findByGroup(String group);
}
