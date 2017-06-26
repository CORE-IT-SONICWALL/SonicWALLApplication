package kh.com.penhchet.sonicwall.repositories;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import kh.com.penhchet.sonicwall.models.Log;

public interface LogRepository extends ElasticsearchRepository<Log, String> {

    public Iterable<Log> findByGroup(String group);
}
