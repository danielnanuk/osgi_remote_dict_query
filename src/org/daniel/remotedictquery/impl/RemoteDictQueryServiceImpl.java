package org.daniel.remotedictquery.impl;


import java.util.HashMap;
import java.util.Map;

import org.daniel.dictquery.query.QueryService;

/**
 * 远程查询单词
 * 
 * @author daniel
 *
 */
public class RemoteDictQueryServiceImpl implements QueryService {
	private static final Map<String, String> remoteDict = new HashMap<String, String>();
	static {
		remoteDict.put("sky", "天空");
		remoteDict.put("ash", "灰尘");
	}

	@Override
	public String queryWord(String word) {
		System.out.println("RemoteDictQueryServiceImpl.queryWord called!");
		String result = remoteDict.get(word);
		if (result == null) {
			result = "N/A";
		}
		return result;
	}

}
