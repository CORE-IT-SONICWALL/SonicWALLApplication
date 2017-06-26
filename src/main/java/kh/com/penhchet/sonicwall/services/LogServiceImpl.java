package kh.com.penhchet.sonicwall.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kh.com.penhchet.sonicwall.models.Log;
import kh.com.penhchet.sonicwall.repositories.LogRepository;

@Service
public class LogServiceImpl implements LogService{
	
	@Autowired
	private LogRepository logRepository;

	@Override
	public Iterable<Log> findAll() {
		return logRepository.findAll();
	}
	
	@Override
	public Log save(Log log) {
		return logRepository.save(log);
	}

	@Override
	public Iterable<Log> findByGroup(String group) {
		return logRepository.findByGroup(group);
	}
}
