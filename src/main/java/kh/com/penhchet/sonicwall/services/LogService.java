package kh.com.penhchet.sonicwall.services;

import kh.com.penhchet.sonicwall.models.Log;

public interface LogService {

    Log save(Log log);

    Iterable<Log> findAll();

    Iterable<Log> findByGroup(String group);

}
