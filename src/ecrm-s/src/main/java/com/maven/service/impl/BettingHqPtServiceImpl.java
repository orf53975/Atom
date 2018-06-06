package com.maven.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maven.base.dao.BaseDao;
import com.maven.dao.BettingHqPtDao;
import com.maven.entity.BettingHqPt;
import com.maven.service.BettingGameService;

@Service
public class BettingHqPtServiceImpl extends BaseServiceImpl<BettingHqPt>implements BettingGameService<BettingHqPt> {

	@Autowired
	private BettingHqPtDao bettingHqPtDao;

	@Override
	public BaseDao<BettingHqPt> baseDao() {
		return bettingHqPtDao;
	}

	@Override
	public Class<BettingHqPt> getClazz() {
		return BettingHqPt.class;
	}

	/**
	 * 获取游戏记录
	 */
	@Override
	public List<BettingHqPt> takeRecord(Map<String,Object> object)throws Exception {
		return super.selectAll(object);
	}

	/**
	 * 获取游戏记录总数
	 */
	@Override
	public int takeRecordCount(Map<String,Object> object)throws Exception{
		return super.selectAllCount(object);
	}
	/**
	 * 获取游戏记录总数之金额统计
	 * @param object
	 * @return
	 */
	@Override
	public Map<String, Object> takeRecordCountMoney(Map<String, Object> object) throws Exception {
		return bettingHqPtDao.takeRecordCountMoney(object);
	}
}
