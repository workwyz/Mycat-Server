package io.mycat.route;

import io.mycat.cache.LayerCachePool;
import io.mycat.server.MySQLFrontConnection;
import io.mycat.server.SystemConfig;
import io.mycat.server.config.SchemaConfig;

import java.sql.SQLNonTransientException;

/**
 * 路由策略接口
 * @author wang.dw
 *
 */
public interface RouteStrategy {
	public RouteResultset route(SystemConfig sysConfig,
			SchemaConfig schema,int sqlType, String origSQL, String charset, MySQLFrontConnection sc, LayerCachePool cachePool)
			throws SQLNonTransientException;
}
