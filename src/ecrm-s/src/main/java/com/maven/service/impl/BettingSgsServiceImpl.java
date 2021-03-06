package com.maven.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maven.base.dao.BaseDao;
import com.maven.dao.BettingHqNhqDao;
import com.maven.dao.BettingSgsDao;
import com.maven.entity.BettingHqNhq;
import com.maven.entity.BettingSgs;
import com.maven.service.BettingGameService;
@Service
public class BettingSgsServiceImpl extends BaseServiceImpl<BettingSgs> implements BettingGameService<BettingSgs> {
	
	@Autowired
	private BettingSgsDao bettingHqNhqDaoImpl;

	@Override
	public BaseDao<BettingSgs> baseDao() {
		return bettingHqNhqDaoImpl;
	}

	@Override
	public Class<BettingSgs> getClazz() {
		return BettingSgs.class;
	}

	@Override
	public List<BettingSgs> takeRecord(Map<String, Object> object) throws Exception {
		return super.selectAll(object);
	}

	@Override
	public int takeRecordCount(Map<String, Object> object) throws Exception {
		return super.selectAllCount(object);
	}
	/**
	 * 获取游戏记录总数之金额统计
	 * @param object
	 * @return
	 */
	@Override
	public Map<String, Object> takeRecordCountMoney(Map<String, Object> object) throws Exception {
		return bettingHqNhqDaoImpl.takeRecordCountMoney(object);
	}
}
